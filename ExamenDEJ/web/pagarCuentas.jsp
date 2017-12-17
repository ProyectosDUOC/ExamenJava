<%-- 
    Document   : pagarCuentas
    Created on : 14-dic-2017, 2:52:13
    Author     : benja
--%>

<%@page import="dao.FormaPagoDAO"%>
<%@page import="modelo.FormaPago"%>
<%@page import="dao.FormaEnvioDAO"%>
<%@page import="modelo.FormaEnvio"%>
<%@page import="modelo.FormaEnvio"%>
<%@page import="java.util.List"%>
<%@page import="dao.EstacionamientoDAO"%>
<%@page import="modelo.Estacionamiento"%>
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
        <link href="css/pagarCuentas.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script>
            function habilitar()
            {
                console.log("x");
                var rutOk = document.getElementById("rut").value.length >= 7;
                var telOk = document.getElementById("tel").value.length > 0;
                var nameOk = document.getElementById("nombre").value.length > 0;
                var mailOk = document.getElementById("correo").value.length > 0;

                var panel = document.getElementById("oculto");

                if (rutOk && telOk && nameOk && mailOk) {
                    console.log("ok");
                    panel.style.display = 'inline';
                } else {
                    panel.style.display = 'none';
                }
            }
            ;
        </script>
        <%  List<Estacionamiento> listaEsta = (new EstacionamientoDAO()).Listar();
            List<FormaPago> listaP = (new FormaPagoDAO()).Listar();
            List<FormaEnvio> listaE = (new FormaEnvioDAO()).Listar();%>
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
        <br>
        <br>
        <form action="ControladorPagarC" method="POST">
            <div class="container">
                <div class="row">
                    <h4 class="white green-text">Auto Park: Servicio online a la comodidad del Usuario</h4>
                    <div class="col s12 m4">
                        <div class="card orange lighten-5">
                            <div class="card-content blue-text">
                                <span class="card-title">Datos Personales</span>
                                <div class="input-field">
                                    <i class="material-icons prefix">account_circle</i>
                                    <input id="rut" type="text" maxlength="9" name="rut" required oninput="habilitar()" /> 
                                    <label for="rut" class="blue-text" >Rut  ejemplo 190000008</label>
                                </div>
                                <div class="input-field">
                                    <i class="material-icons prefix">people</i>
                                    <input id="nombre" type="text" name="nombre" required oninput="habilitar()" />
                                    <label for="nombre" class="blue-text">Nombre Completo</label>
                                </div>
                                <div class="input-field">
                                    <i class="material-icons prefix">local_phone</i>
                                    <input id="tel" type="text" maxlength="12" nam="tel" required oninput="habilitar()" />
                                    <label for="tel" class="blue-text">Telefono +569XXXXXXXX</label>
                                </div>
                                <div class="input-field">
                                    <i class="material-icons prefix">email</i>
                                    <input id="correo" type="email" name="correo" required oninput="habilitar()" />
                                    <label for="correo" class="blue-text">Correo Electronico @...</label>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col s8 slider">
                        <div class="carousel carousel-slider">
                            <a class="carousel-item" href="#one!"><img  width="600" height="400" src="images/auto1.jpg"></a>
                            <a class="carousel-item" href="#two!"><img width="600" height="400"  src="images/auto2.jpg"></a>
                            <a class="carousel-item" href="#three!"><img width="600" height=400  src="images/auto3.jpg"></a>
                            <a class="carousel-item" href="#four!"><img width="600" height="400"  src="images/auto1.jpg"></a>
                        </div>
                    </div>
                    <div id="oculto">
                        <div class="col s12">                    
                            <div class="card">
                                <div class="card-content orange lighten-5">
                                    <span class="card-title center-align">Estacionamientos</span>
                                    <div class="input-field ">                                
                                        <select name="estacionamientos" >
                                            <option value="" disabled selected>Estacionamientos</option>
                                            <%for (Estacionamiento esta : listaEsta) {%>
                                            <option value="<%=esta.getIdEstacionamiento()%>"><%=esta.getNombreEsta()%> - <%=esta.getGlosa()%></option>
                                            <% } %>
                                        </select>                                
                                        <label class="black-text">Selecciones un Estacionamiento</label>
                                    </div>
                                    <div class="input-field">
                                        <i class="material-icons prefix">account_circle</i>
                                        <input id="id" type="text" maxlength="9" name="idTicket" required /> 
                                        <label for="id" class="blue-text" >Id Ticket</label>
                                    </div>
                                    <div class="input-field">
                                        <button class="btn waves-effect waves-light red white-text" type="opcion" name="agregar">Agregar
                                            <i class="material-icons right">send</i>
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                       
                        <!--Carga carrito -->
                        <div class="col s12">
                            <div class="card">
                                <table>
                                    <thead>
                                        <tr>
                                            <th>Nombre estacionamiento</th>
                                            <th>Monto</th>
                                            <th>N° Ticket</th>
                                            <th>Eliminar</th>
                                        </tr>
                                    </thead>
                                </table>
                            </div>
                        </div>
                        <div class="col s6">
                            <div class="card">
                                <div class="card-content">
                                    <span class="card-title center-align">Forma de Pago</span>
                                    <div>  
                                        <% for (FormaPago fp : listaP) {%>
                                        <p>
                                            <input type="radio" id="<%=fp.getNombrePago()%>" name="gpago" />
                                            <label for="<%=fp.getNombrePago()%>"> <%=fp.getNombrePago()%> </label>
                                        </p>
                                        <% } %>                                          
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col s6">
                            <div class="card">
                                <div class="card-content">                                     
                                    <span class="card-title center-align">Forma de Envio</span>
                                    <% for (FormaEnvio fe : listaE) {%>
                                    <p>
                                        <input type="radio" id="<%=fe.getNombreEnvio()%>" name="genvio" />
                                        <label for="<%=fe.getNombreEnvio()%>"><%=fe.getNombreEnvio()%></label>
                                    </p>
                                    <% }%>                                          
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>        
        </form>
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
