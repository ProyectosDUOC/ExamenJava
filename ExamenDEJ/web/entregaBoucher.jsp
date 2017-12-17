<%-- 
    Document   : entregaBoucher
    Created on : 14-dic-2017, 2:57:58
    Author     : benja
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dao.FormaEnvioDAO"%>
<%@page import="modelo.FormaEnvio"%>
<%@page import="modelo.DetalleBoleta"%>
<%@page import="dao.BoletaDAO"%>
<%@page import="modelo.Boleta"%>
<%@page import="dao.DetalleBoletaDAO"%>
<%@page import="dao.EstacionamientoDAO"%>
<%@page import="dao.EstacionamientoDAO"%>
<%@page import="modelo.Estacionamiento"%>
<%@page import="modelo.Estacionamiento"%>
<%@page import="dao.TicketDAO"%>
<%@page import="dao.TicketDAO"%>
<%@page import="modelo.Ticket"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entrega Boucher</title>
        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/pagarCuentas.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <%
            HttpSession sesion = request.getSession(true);
            Boleta boleta = sesion.getAttribute("boleta") == null ? null : (Boleta) sesion.getAttribute("boleta");
            ArrayList<DetalleBoleta> listaDetalle = sesion.getAttribute("carrito") == null ? new ArrayList<DetalleBoleta>() : (ArrayList) sesion.getAttribute("carrito");

            String idBoleta = "";
            String total = "0";            
            String formaEnvio = "1";
            String idEnvio = "";

            if (boleta != null) {
                total = boleta.getTotalBoleta().toString();                
                idEnvio = boleta.getIdEnvio().toString();
                idBoleta = boleta.getIdBoleta().toString();
            }


        %>
    </head>
    <body>
        <nav class="blue darken-4" role="navigation">
            <div class="nav-wrapper container"><a id="logo-container" href="index.jsp" class="brand-logo yellow-text"><i class="large material-icons left">directions_car</i>Auto Park</a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="index.jsp">Inicio</a></li>                    
                    <li><a href="pagarCuentas.jsp">Pagar</a></li>
                    <li><a href="buscarPagos.jsp">Ver Pagos</a></li>
                    <li><a href="ayuda.jsp">Ayuda</a></li>
                    <li><a href="verEstacionamientos.jsp">Ver Estacionamientos</a></li>               
                </ul>
            </div>
        </nav>   
        <div class="section">
            <div class="container">
                <h1>Entrega de Pago Estacionamientos</h1>
                <div class="col s12">
                    <div class="card">
                        <table>
                            <thead>
                                <tr>
                                    <th>Nombre estacionamiento</th>
                                    <th>Monto</th>
                                    <th>N° Ticket</th>

                                </tr>
                            </thead>
                            <tbody>
                                <%  Ticket tic;
                                    Estacionamiento esta;
                                    for (DetalleBoleta detalle : listaDetalle) {
                                        tic = (new TicketDAO()).BuscarId(detalle.getIdTicket());
                                        esta = (new EstacionamientoDAO()).BuscarId(tic.getIdEstacionamiento());
                                %>
                                <tr>
                                    <td><%=esta.getNombreEsta()%></td>
                                    <td>$<%=tic.getTotalPago()%>.-</td>
                                    <td><%=tic.getNumeroTicket()%></td>
                                    <td>

                                </tr>
                                <%}%>                                      
                            </tbody>
                        </table>
                    </div>
                </div>
                <!--Total-->
                <div class="col s12">
                    <div class="card">
                        <h3 class="red-text">Total : $<%=total%>.-</h3>
                    </div>
                </div> 
                <div class="col s12">
                    <div class="card">
                        <h3 class="red-text">OPCIÓN DE ENVÍO : $<%=boleta.getIdEnvio()%>.-</h3>
                    </div>
                </div> 
            </div>        
        </div>
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script> 
    </body>
</html>
