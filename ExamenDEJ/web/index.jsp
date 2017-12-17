<%-- 
    Document   : index
    Created on : 13-12-2017, 2:53:40
    Author     : Seba
--%>

<%@page import="dao.TicketDAO"%>
<%@page import="modelo.Ticket"%>
<%@page import="modelo.Ticket"%>
<%@page import="dao.ClienteDAO"%>
<%@page import="modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
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
        <div class="container">
            <div class="row center-align">
                <h1>Auto Park</h1>    
                <a  class="white-text btn-large  waves-effect waves-light  red" href="movilApp.jsp"><i class="material-icons">touch_app</i>App movil</a>       
            </div>
            <div class="slider">
                <ul class="slides">
                    <li>
                        <img src="images/auto1.jpg"> <!-- random image -->                                                  

                    </li>
                    <li>
                        <img src="images/auto2.jpg"> <!-- random image -->                           
                    </li>
                    <li>
                        <img src="images/auto3.jpg"> <!-- random image -->                            
                    </li>                 
                </ul>
            </div>
        </div>

        <%  List<Cliente> listaCliente = (new ClienteDAO()).Listar(); %>

        <% for (Cliente cli : listaCliente) {
        %>
        <p><%=cli.getRutCliente()%> - <%=cli.getNombreCliente()%></p>
        <%
            }
        %>
        
          <%  List<Ticket> listaT = (new TicketDAO()).Listar(); %>

        <% for (Ticket t : listaT) {
        %>
        <p><%=t.getRutCliente()%></p>
        <%
            }
        %>
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script> 
        <script>
            $(document).ready(function () {
                $('select').material_select();
            });
        </script>
        <script>
            $('.carousel.carousel-slider').carousel({fullWidth: true});
            //      
            $(document).ready(function () {
                $('.slider').slider();
            });
        </script>
    </body>
</html>
