<%-- 
    Document   : verEstacionamientos
    Created on : 14-dic-2017, 2:55:22
    Author     : benja
--%>

<%@page import="java.util.List"%>
<%@page import="dao.EstacionamientoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Estacionamiento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estacionamientos - Auto Park</title>
        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/mapmarker.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <style>
            #map {
                height: 350px;
                width: 100%;
            }
        </style>
        <% List<Estacionamiento> parks = (new EstacionamientoDAO()).Listar(); %>
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
            <div class="row">
                <h2 class="center-align">Estacionamientos</h2>
                <div class="col s6">
                    <div id="map"></div>
                </div>

                <ul class="collapsible col s6" data-collapsible="accordion">
                    <% for (Estacionamiento park : parks) {%>
                    <li>
                        <div class="collapsible-header"><i class="material-icons">directions_car</i><%=park.getNombreEsta()%></div>
                        <div class="collapsible-body">Direccion: <span><%=park.getGlosa()%>. </span><a href="#" id="mostrar<%=park.getIdEstacionamiento()%>">[Mostrar]</a></div>
                    </li>
                    <% } %>
                </ul>
            </div>
        </div>
        <script>
            var markers = [];
            var infoWindows = [];
            
            function initMap() {

                var map = new google.maps.Map(document.getElementById('map'), {
                    zoom: 6,
                    center: {lat: -34.6, lng: -71.5}
                });

            <% for (Estacionamiento park : parks) {%>
                var marker<%=park.getIdEstacionamiento()%> = new google.maps.Marker
                        ({
                            position: {lng: <%=park.getMapaLatitud()%>, lat: <%=park.getMapaLongitud()%>},
                            map: map,
                            label: '<%=park.getIdEstacionamiento()%>'
                        });

                var infowindow<%=park.getIdEstacionamiento()%> = new google.maps.InfoWindow({content: '<%=park.getNombreEsta()%>'});
                
                var mostrar = function() {
                    map.setZoom(16);
                    map.setCenter(marker<%=park.getIdEstacionamiento()%>.getPosition());
                    infowindow<%=park.getIdEstacionamiento()%>.open(map, marker<%=park.getIdEstacionamiento()%>);
                    window.setTimeout(function () {
                        infowindow<%=park.getIdEstacionamiento()%>.close();
                    }, 3000);
                };
                
                marker<%=park.getIdEstacionamiento()%>.addListener('click',mostrar);
                
                document.getElementById("mostrar<%=park.getIdEstacionamiento()%>").addEventListener('click',mostrar);
                                
                markers.push(marker<%=park.getIdEstacionamiento()%>);
                infoWindows.push(infowindow<%=park.getIdEstacionamiento()%>);
                
            <%}%>                
            }
            
        </script>

        <script async defer
                src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAv1J4q_RwQyBqrQjGNB-4KDc4914pQ78I&callback=initMap">
        </script>
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script> 
    </body>
</html>
