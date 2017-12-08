<%-- 
    Document   : index
    Created on : 08-12-2017, 17:04:20
    Author     : carlos
--%>

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
            <div class="nav-wrapper container"><a id="logo-container" href="#" class="brand-logo yellow-text"><i class="large material-icons left">directions_car</i>Auto Park</a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="#">Inicio</a></li>
                    <li><a href="#">Ver Pagos/Compras</a></li>
                    <li><a href="#">Ayuda</a></li>
                    <li><a href="#">Ver Estacionamientos</a></li>
                </ul>
            </div>
        </nav>    
        <div class="section">
            <div class="container">
                <div class="input-field col s2 ">
                    Rut:<input id="Text1" type="text" /> 
                </div>
                <div class="input-field col s2 ">
                    Nombre:<input id="Text2" type="text" />
                </div>
                <div class="input-field col s2 ">
                    Telefono:<input id="Text3" type="text" />
                </div>
                <div class="input-field col s2 ">
                    e-mail:<input id="Text4" type="text" />
                </div>
            </div>
        </div>

        <div class="section">
            <div class="container">
                <form action="#" method="POST">    
                <div class="input-field col s2 ">
                    Seleccione Estacionamiento, indique la cantidad de dinero que mostro la aplicacion movil:
                    <div class="input-field col s12">
                        <select name="comuna">
                            <option value="" disabled selected>Elija la comuna</option>
                            <option value="Calera de Tango">Calera de Tango</option>
                            <option value="San Bernardo">San Bernardo</option>
                            <option value="Santiago">Santiago</option>
                            <option value="Rancagua">Rancagua</option>
                            <option value="La Pintana">La  Pitanta</option>
                            <option value="Puente ALto">Puente alto</option>
                            <option value="Cerrillos">Cerrillos</option>
                            <option value="Maipu">Maipu</option>
                        </select>
                        <label>Comuna</label>
                    </div>
                    <input id="btnAgregar" type="button" value="Agrebar" />
                </div>
                <div class="input-field col s2 ">
                    Opciones de Pago:
                    <br/><br/>
                    <p>
                        <input name="grupPago" id="Radio1" type="radio" />
                        <label for="Radio1">Transferencia</label>
                    </p>
                    <br/><br/>
                    <p>
                        <input class="with-gap" name="group3" type="radio" id="test5" checked />
                        <label for="test5">Red</label>
                    </p>




                    <p>
                        <input name="group1" type="radio" id="test1" />
                        <label for="test1">Red</label>
                    </p>


                    <input id="Radio2" type="radio" />Pago en Linea
                    <br/><br/>
                    <input id="Radio3" type="radio" />Orden de Compra
                </div>
                <div class="input-field col s2 ">
                    Opciones de Envio de Boleta
                    <br/><br/>
                    <input id="Radio4" type="radio" />Correo Eléctronico
                    <br/><br/>
                    <input id="Radio5" type="radio" />Direccion Particular
                </div>
                <div class="input-field col s2 ">
                    lblPago
                    <br/><br/>
                    <input id="btnPagar" type="button" value="Pagar" />
                </div>
            </form>
            
            </div>
        </div>



        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script>    
        <script>
            $(document).ready(function () {
                $('select').material_select();
            });
        </script>
    </body>
</html>
