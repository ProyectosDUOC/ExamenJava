/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Boleta;
import modelo.DetalleBoleta;
import dao.BoletaDAO;
import dao.DetalleBoletaDAO;
import dao.EstacionamientoDAO;
import dao.TicketDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Estacionamiento;
import modelo.Ticket;

/**
 *
 * @author benja
 */
public class ControladorPagarC extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        HttpSession sesion = request.getSession(true);

        String opcion = request.getParameter("opcion");
        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String tel = request.getParameter("tel");
        String correo = request.getParameter("correo");
        String idEstacion = "0";

        String[] miseleccion = request.getParameterValues("estacionamientos");
        //Encuentra la id del combo box de estacionamiento
        for (int i = 0; i < miseleccion.length; i++) {
            idEstacion = miseleccion[i];
        }

        Logger.getLogger(getClass().getName()).log(Level.INFO, "Estacionamiento id=" + idEstacion);

        //id ticke a agregar al carrito
        String ticket = request.getParameter("idTicket");
        //Crea boleta en el caso si existe las llama        
        Boleta boleta = sesion.getAttribute("boleta") == null ? new Boleta() : (Boleta) sesion.getAttribute("boleta");
        ArrayList<DetalleBoleta> listaDetalle = sesion.getAttribute("carrito") == null ? new ArrayList<DetalleBoleta>() : (ArrayList) sesion.getAttribute("carrito");
               
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorPagarC</title>");
            out.println("</head>");
            out.println("<body>");
            if (opcion.equals("agregar")) {

                //*******************ANEXO BOLETA**********************************  
                // En el cao que la boleta esta null creara una nueva con los campos de la ventana
                if (boleta.getNombreBoleta() == null) {
                    int id = (new BoletaDAO()).contador() + 1;
                    Date fecha = new Date();
                    boleta = new Boleta(id, rut, nombre, tel, correo, fecha, 0, 0, 0, 0);
                    /*        id_boleta      INT NOT NULL,
                        rut_cliente    VARCHAR(9),
                        nombre_boleta      VARCHAR(200),
                        telefono_boleta    VARCHAR(12),
                        correo_boleta      VARCHAR(100),
                        fecha_boleta   DATE,
                        total_boleta   INT,
                        id_envio       INT,
                        id_pago        INT, 
                        id_estado_t    INT 0 no pagado, 1 pagado */
                }//else {en el caso contrario ya esta registrada la boleta}

                //Busco el estacionamiento
                List<Estacionamiento> listaE = (new EstacionamientoDAO()).Listar();
                Estacionamiento estacionamiento;
                for (Estacionamiento es : listaE) {
                    if (es.getIdEstacionamiento().toString().equals(idEstacion)) {
                        estacionamiento = es;
                        break;
                    }
                }
                //Busca el ticket
                List<Ticket> listaT = (new TicketDAO()).Listar();
                Ticket ticketBuscado = null;
                for (Ticket ti : listaT) {
                    if (ti.getNumeroTicket().toString().equals(ticket) && ti.getIdEstacionamiento().toString().equals(idEstacion) && ti.getRutCliente().equals(rut)) {
                        ticketBuscado = ti;
                        break;
                    }
                }

                if (ticketBuscado != null) {
                    //El tiket SI Existe
                    if (ticketBuscado.getIdEstadoT() == 0) {
                        //El ticket no ha sido pagado

                        boolean estado = false;
                        //ahora veremos que si el carrito esta vacio y si existe el articulo que vamos a agregar
                        if (listaDetalle.size() > 0) {

                            for (DetalleBoleta detalle : listaDetalle) {
                                //Vamos a confirma si etamos en el detalle de boleta correcto
                                if (boleta.getIdBoleta() == detalle.getIdBoleta()) {
                                    if (detalle.getIdTicket() == ticketBuscado.getIdTicket()) {
                                        //No se puede Agregar
                                        estado = true;//Si existe ete elemento en la lista de detalle   
                                        break;
                                    }
                                }
                            }

                            //En el caso que no encuentre el carrito
                            if (!estado) {
                                int contadorId = 0;
                                for (DetalleBoleta cc : listaDetalle) {
                                    contadorId = cc.getIdDetalleBoleta();
                                }
                                contadorId = contadorId + 1;
                                listaDetalle.add(new DetalleBoleta(contadorId, boleta.getIdBoleta(), ticketBuscado.getIdTicket()));

                                //A boleta se Actualiza el moento
                                int total = boleta.getTotalBoleta();
                                total = total + ticketBuscado.getTotalPago();
                                boleta.setTotalBoleta(total);

                                sesion.setAttribute("carrito", listaDetalle);
                            }

                        } else {
                            if (listaDetalle.isEmpty()) {
                                int contadorId = 0;
                                contadorId = (new DetalleBoletaDAO()).ultimoId() + 1;
                                listaDetalle.add(new DetalleBoleta(contadorId, boleta.getIdBoleta(), ticketBuscado.getIdTicket()));
                                Logger.getLogger(getClass().getName()).log(Level.INFO, "contador id=" + contadorId);
                                //A boleta se Actualiza el moento
                                int total = boleta.getTotalBoleta();
                                total = total + ticketBuscado.getTotalPago();
                                boleta.setTotalBoleta(total);

                                sesion.setAttribute("carrito", listaDetalle);
                            }
                        }

                        Logger.getLogger(getClass().getName()).log(Level.INFO, "Estado =" + estado);

                        //Ahora vamos a guardarlo sin importar que no exista debe ingresar                
                    } else {
                        //Error:
                        //El ticket ya lo ocuparon

                        //Ahora vamos a guardarlo sin importar que no exista debe ingresar
                    }

                } else {
                    //Error : 
                    //El ticket NO EXISTE

                    //Ahora vamos a guardarlo sin importar que no exista debe ingresar
                }
                sesion.setAttribute("boleta", boleta);
                response.sendRedirect("pagarCuentas.jsp");
            }
            if (opcion.startsWith("x")) {
                
                sesion.setAttribute("carrito", listaDetalle);
                sesion.setAttribute("boleta", boleta);
                response.sendRedirect("pagarCuentas.jsp");
            }

            out.println("<h1>Servlet ControladorPagarC at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
