<%-- 
    Document   : entregaBoucher
    Created on : 14-dic-2017, 2:57:58
    Author     : benja
--%>

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
        <%
            String total = "0";
            String rut = "0";
            if (request.getParameter("rut") != null) {
                rut = request.getParameter("rut");
            }
            String idBoleta = "No existe";
            if (request.getParameter("idBoleta") != null) {
                idBoleta = request.getParameter("idBoleta");
            }
             if (request.getParameter("total") != null) {
                total = request.getParameter("total");
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
                        <div class="card-content orange lighten-5">
                            <span class="card-title center-align">Numero de Boleta : <%=idBoleta%></span>
                            <table class="striped responsive-table">
                                <thead>
                                    <tr>
                                        <th>N° Ticket</th>
                                        <th>Fecha</th>
                                        <th>Nombre Estacionamiento</th>
                                        <th>Precio X horas</th>
                                        <th>Cant horas</th>
                                        <th>Total</th>
                                    </tr>
                                </thead>
                                <tbody>       
                                    <% Boleta boleta = (new BoletaDAO()).BuscarId(Integer.parseInt(idBoleta));
                                       List<DetalleBoleta> listaDetalle = (new DetalleBoletaDAO()).buscarId()
                                    
                                    
                                    %>
                                    
                                    <% List<Ticket> listaTickets = (new TicketDAO()).Listar();
                                        //Arreglas despues
                                        List<Estacionamiento> listaEsta = (new EstacionamientoDAO()).Listar();
                                        List<DetalleBoleta> detalleBoleta = 
                                        Estacionamiento estacionamiento = new Estacionamiento();
                                        for (Ticket tt : listaTickets) {
                                            if (tt.getRutCliente().equals(rut) && tt.getIdEstadoT() == 1) {
                                                for (Estacionamiento est : listaEsta) {
                                                    if (est.getIdEstacionamiento() == tt.getIdEstacionamiento()) {
                                                        estacionamiento = est;
                                                        break;
                                                    }
                                                }

                                    %>                                        
                                <td><%=tt.getNumeroTicket()%></td>
                                <td><%=tt.getFechaTicket().getDate()%>/<%=tt.getFechaTicket().getMonth() + 1%>/<%=tt.getFechaTicket().getYear() + 1900%></td>
                                <td><%=estacionamiento.getNombreEsta()%></td>
                                <td>$<%=estacionamiento.getPrecioEsta()%>.-</td>
                                <td><%=tt.getCantHoras()%> hrs</td>
                                <td>$<%=tt.getTotalPago()%>.-</td>
                                </tr>      
                                <%    }
                                    }
                                %>
                                </tbody>
                            </table>
                            <div class="col s12">
                                <div class="card">
                                    <h3 class="red-text">Total a Pagar : $<%=total%>.-</h3>
                                </div>
                            </div>  
                        </div>
                    </div>
                </div>
            </div>        
        </div>
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script> 
    </body>
</html>
