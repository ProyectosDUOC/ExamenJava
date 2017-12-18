<%-- 
    Document   : buscarPagos
    Created on : 14-dic-2017, 2:55:43
    Author     : benja
--%>

<%@page import="dao.TicketDAO"%>
<%@page import="modelo.Ticket"%>
<%@page import="dao.DetalleBoletaDAO"%>
<%@page import="modelo.DetalleBoleta"%>
<%@page import="dao.BoletaDAO"%>
<%@page import="modelo.Boleta"%>
<%@page import="java.util.List"%>
<%@page import="dao.EstacionamientoDAO"%>
<%@page import="modelo.Estacionamiento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
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
        <div>
            <%String rutC = request.getParameter("rut"); %>
            
            <form method="POST" action="ControladorPedido">
                <div class="container">
                    <div class="row margin">
                        <div class="input-field col s4">                                
                            <i class="material-icons">person_outline</i>
                            <input id="rut" type="text" required name="rut" maxlength="9" value="<%=rutC%>"> 
                            <label for="rut" class="center-align">Rut Cliente (sin puntos ni guión)</label>
                            <span id="mensaje" class="red-text"> ${param.mensaje}</span>
                        </div>
                    </div>
                    <div class="row">                      
                        <button class="btn waves-effect waves-light deep-orange accent-2" type="submit" name="opcion" value="buscar">
                            Buscar
                        </button>
                    </div>
                    <div class="row margin col s12">
                        <table class="striped responsive-table">
                            <thead>
                                <tr>
                                    <th>Estacionamiento</th>
                                    <th>Total</th>
                                    <th>Pedir</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    
                                    List<Boleta> listaBoleta = (new BoletaDAO()).ListarPorRut(rutC);
                                    List<DetalleBoleta> listaDetalle = (new DetalleBoletaDAO()).Listar();
                                    List<Ticket> listaTicket = (new TicketDAO()).Listar();
                                    List<Estacionamiento> listaEsta = (new EstacionamientoDAO()).Listar();

                                    String nombre = "";
                                    for (Boleta bol : listaBoleta) {
                                        nombre = "";
                                        for (DetalleBoleta de : listaDetalle) {
                                            if (bol.getIdBoleta() == de.getIdBoleta()) {
                                                for (Ticket tic : listaTicket) {
                                                    if (de.getIdTicket() == tic.getIdTicket()) {
                                                        for (Estacionamiento esta : listaEsta) {
                                                            if (esta.getIdEstacionamiento() == tic.getIdEstacionamiento()) {
                                                                nombre = nombre + "<br>"+ esta.getNombreEsta();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                %>
                                <tr>
                                    <td><%= nombre%></td> 
                                    <td>$<%= bol.getTotalBoleta()%>.-</td>     
                                    <td>
                                        <button class="btn waves-effect waves-light red black-text" type="submit" name="opcion" value="x<%=bol.getIdBoleta()%>">Pedir
                                            <i class="material-icons right">zoom_in</i>
                                        </button>
                                    </td>                               
                                </tr>
                                <%
                                    }
                                %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </form> 
        </div>
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script> 
    </body>
</html>