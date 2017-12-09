<%-- 
    Document   : index
    Created on : 08-dic-2017, 23:54:21
    Author     : benja
--%>

<%@page import="dao.ComunaDAO"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Comuna"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Principal</title>
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
                    <li><a href="buscarPedidos.jsp">Ver Pagos/Compras</a></li>
                    <li><a href="#">Ayuda</a></li>
                    <li><a href="verEstacionamientos.jsp">Ver Estacionamientos</a></li>
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
                        <input name="grupPago" id="Radio1" type="radio" value="T" checked/>
                        <label for="Radio1">Transferencia</label>
                    </p>
                    <p>
                        <input name="grupoPago" id="Radio2" type="radio" value="PL"/>
                        <label for="Radio2">Pago en Linea</label>
                    </p>
                    
                    
                    <div class="col s12 m12 l6">
                <div class="card-panel">
                  <h4 class="header2">Form with validation</h4>
                  <div class="row">
                    <form class="col s12">
                      <div class="row">
                        <div class="input-field col s12">
                          <i class="large material-icons left">account-circle</i>
                          
                          <input id="name4" type="text" class="validate">
                          <label for="first_name">Name</label>
                        </div>
                      </div>
                      <div class="row">
                        <div class="input-field col s12">
                          <i class="mdi-communication-email prefix"></i>
                          <input id="email4" type="email" class="validate">
                          <label for="email">Email</label>
                        </div>
                      </div>
                      <div class="row">
                        <div class="input-field col s12">
                          <i class="mdi-action-lock-outline prefix"></i>
                          <input id="password5" type="password" class="validate">
                          <label for="password">Password</label>
                        </div>
                      </div>
                      <div class="row">
                        <div class="input-field col s12">
                          <i class="mdi-action-question-answer prefix"></i>
                          <textarea id="message4" class="materialize-textarea validate" length="120"></textarea>
                          <label for="message">Message</label>
                        </div>
                        <div class="row">
                          <div class="input-field col s12">
                            <button class="btn cyan waves-effect waves-light right" type="submit" name="action">Submit
                              <i class="mdi-content-send right"></i>
                            </button>
                          </div>
                        </div>
                      </div>
                    </form>
                  </div>
                </div>
              </div>
                    
                    
                    
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
