/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Cliente;

/**
 *
 * @author benja
 */
public class ControladorMovil extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession sesion = request.getSession(true);

        String opcion = request.getParameter("opcion");
        String rut = request.getParameter("rut");
        
        try {
            if (opcion.equals("acceder")) {
                List<Cliente> listaCliente = (new ClienteDAO()).Listar();
                Cliente cli = null;
                for (Cliente c : listaCliente) {
                    if (c.getRutCliente().equals(rut)) {
                        cli = c;
                        break;
                    }
                }
                
                if (cli != null) {
                    sesion.setAttribute("cliente", cli);
                    response.sendRedirect("movilCuenta.jsp");
                } else 
                {    
                    response.sendRedirect("movilApp.jsp?mensaje=Cliente no existe");
                }
            }
        } catch (Exception e) {
          //  response.sendRedirect("movilApp.jsp?mensaje="+e.toString());
           response.sendRedirect("movilApp.jsp?mensaje=Cliente no existe exception" + e.toString());
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
