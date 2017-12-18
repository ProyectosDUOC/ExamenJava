/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.BoletaDAO;
import dao.ClienteDAO;
import dao.DetalleBoletaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import modelo.Boleta;
import modelo.Cliente;
import modelo.DetalleBoleta;

/**
 *
 * @author carlos
 */
@WebServlet(name = "ControladorPedido", urlPatterns = {"/ControladorPedido"})
public class ControladorPedido extends HttpServlet {

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
            if (opcion.equals("buscar")) {
                List<Cliente> listaCliente = (new ClienteDAO()).Listar();
                
                Cliente cli = null;
                
                for(Cliente c: listaCliente)
                {
                    if(c.getRutCliente().equals(rut))
                    {
                        cli = c;
                        break;
                    }
                }
                
                if(cli != null)
                {
                    response.sendRedirect("buscarPagos.jsp?rut="+ cli.getRutCliente() );
                }
                else
                {
                    response.sendRedirect("buscarPagos.jsp?mensaje=El Cliente no Existe");
                }
                
            }
            if (opcion.startsWith("x")) {
                String idBoleta = opcion.substring(1);
                int cont = 0;
                Boleta boleta = sesion.getAttribute("boleta") == null ? new Boleta() : (Boleta) sesion.getAttribute("boleta");
                ArrayList<DetalleBoleta> listaDetalle = sesion.getAttribute("carrito") == null ? new ArrayList<DetalleBoleta>() : (ArrayList) sesion.getAttribute("carrito");
                List<DetalleBoleta> listaPrincipal = (new DetalleBoletaDAO()).Listar();
                
                boleta = (new BoletaDAO()).BuscarId(Integer.parseInt(idBoleta));
                Logger.getLogger(getClass().getName()).log(Level.INFO, "Boleta funciona " + boleta.getIdBoleta());
                
                if (boleta != null) {                  
                    for (DetalleBoleta xx: listaPrincipal){
                        if (xx.getIdBoleta() == boleta.getIdBoleta()) {
                            listaDetalle.add(xx);
                            Logger.getLogger(getClass().getName()).log(Level.INFO, "Funciono 2.0");
                        }
                    }
                    
                    sesion.setAttribute("carrito", listaDetalle);
                    sesion.setAttribute("boleta", boleta);
                    response.sendRedirect("entregaBoucher.jsp");
                }else{
                     response.sendRedirect("buscarPagos.jsp?mensaje=Error!");
                }
                                                   
                
            }
        }catch(Exception e)
        {
            response.sendRedirect("buscarPagos.jsp?mensaje=El Cliente no Existe" + e.toString());
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
