<%-- 
    Document   : movilCuenta
    Created on : 14-dic-2017, 17:08:10
    Author     : benja
--%>

<%@page import="dao.EstacionamientoDAO"%>
<%@page import="modelo.Estacionamiento"%>
<%@page import="dao.TicketDAO"%>
<%@page import="modelo.Ticket"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>        
        <link href="css/login.css" type="text/css" rel="stylesheet" media="screen,projection"/>

    </head>
    <body>     
        <div id="login-page" class="row">
            <div class="col s12 z-depth-4 card-panel">
                <form class="login-form" method="POST" action="ControladorMovil">
                    <div class="row">
                        <div class="input-field col s12 center">
                            <!-- <img src="images/login-logo.png" alt="" class="circle responsive-img valign profile-image-login"> -->
                            <h1 class="black-text">Auto Park app</h1> 
                            <p class="center">Para la comodida de nuestro clientes, siempre y cuando lo necesite</p>
                            <% Cliente clie = (Cliente) session.getAttribute("cliente"); %>
                            <p><%=clie.getNombreCliente() %></p>
                            <p><%=clie.getRutCliente() %></p>
                            <p><%=clie.getCorreoCliente() %></p>
                            <p><%=clie.getTelefonoCliente() %></p>
                        </div>
                    </div>
                    <div class="row margin col s12">
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
                                <% List<Ticket> listaTickets = (new TicketDAO()).Listar();
                                //Arreglas despues
                                List<Estacionamiento> listaEsta = (new EstacionamientoDAO()).Listar();
                                Estacionamiento estacionamiento = new Estacionamiento();
                                   for (Ticket tt : listaTickets) {
                                        if (tt.getRutCliente().equals(clie.getRutCliente()) && tt.getIdEstadoT()==0) {
                                            for (Estacionamiento est : listaEsta) {
                                                if (est.getIdEstacionamiento() == tt.getIdEstacionamiento()) {
                                                    estacionamiento = est;
                                                    break;
                                                }
                                            }
                                               
                                %>                                        
                                        <td><%=tt.getNumeroTicket()%></td>
                                        <td><%=tt.getFechaTicket().getDate()%>/<%=tt.getFechaTicket().getMonth()+1%>/<%=tt.getFechaTicket().getYear()+1900%></td>
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
                    </div>
                    <div class="row">                      
                        <button class="btn waves-effect waves-light deep-orange accent-2" type="submit" name="opcion" value="salir">
                            Salir
                        </button>
                    </div>
                    <div class="row">
                        <div class="input-field col s6 m6 l6">
                            <p class="margin medium-small"><a href="index.jsp">Registrate Ahora</a></p>
                        </div>
                        <div class="input-field col s6 m6 l6">
                            <p class="margin right-align medium-small"><a href="ayuda.jsp">¿Has olvidad tu clave?</a></p>
                        </div>          
                    </div>
                </form>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script> 
    </body>
</html>
