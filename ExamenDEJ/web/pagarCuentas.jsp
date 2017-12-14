<%-- 
    Document   : pagarCuentas
    Created on : 14-dic-2017, 2:52:13
    Author     : benja
--%>

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
        <% List<Estacionamiento> listaEsta = (new EstacionamientoDAO()).Listar();  %>
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

        <div class="section" id="acceso">
            <div class="row">
                <div class="col s4 offset-s6">
                    <div class="card  cyan darken-2">
                        <div class="card-content white-text">
                            <span class="card-title">Datos Personales</span>
                            <div class="input-field">
                                <i class="material-icons prefix">account_circle</i>
                                <input id="rut" type="text" maxlength="9" name="rut" required="requered" /> 
                                <label for="rut" class="white-text" >Rut  ejemplo 190000008</label>
                            </div>
                            <div class="input-field">
                                <i class="material-icons prefix">people</i>
                                <input id="nombre" type="text" name="Nombre" required="requered"/>
                                <label for="nombre" class="white-text">Nombre Completo</label>
                            </div>
                            <div class="input-field">
                                <i class="material-icons prefix">local_phone</i>
                                <input id="tel" type="text" maxlength="12" required="requered" />
                                <label for="tel" class="white-text">Telefono +569XXXXXXXX</label>
                            </div>
                            <div class="input-field">
                                <i class="material-icons prefix">email</i>
                                <input id="correo" type="email" name="correo" required="requered" />
                                <label for="correo" class="white-text">Correo Electronico @...</label>
                            </div>
                        </div>
                    </div>
                </div>                   
            </div>
        </div>

        <div class="section" id="Estacionamientos">
            <div class="container">
                <div class="col s6 ">
                    <div class="card orange darken-1">
                        <div class="card-content white-text">
                            <span class="card-title center-align">Estacionamientos</span>
                            <div class="input-field">
                                <select name="etacionamientos">

                                    <option value="" disabled selected>Estacionamientos</option>
                                    <%for (Estacionamiento esta : listaEsta) {
                                    %>
                                    <option value="<%=esta.getIdEstacionamiento()%>"><%=esta.getNombreEsta()%> - <%=esta.getGlosa()%></option>
                                    <%
                                        }
                                    %>
                                </select>
                                <label class="black-text">Selecciones un Estacionamiento</label>
                                <button class="btn waves-effect waves-light center-align" type="submit" name="action">Agregar
                                    <i class="material-icons right">send</i>
                                </button>
                            </div>
                            <div class="input-field">
                                <i class="material-icons prefix">people</i>
                                <input id="nombre" type="text" name="Nombre" required="requered"/>
                                <label for="nombre" class="white-text">Nombre Completo</label>
                            </div>
                            <div class="input-field">
                                <i class="material-icons prefix">local_phone</i>
                                <input id="tel" type="text" maxlength="12" required="requered" />
                                <label for="tel" class="white-text">Telefono +569XXXXXXXX</label>
                            </div>
                            <div class="input-field">
                                <i class="material-icons prefix">email</i>
                                <input id="correo" type="email" name="correo" required="requered" />
                                <label for="correo" class="white-text">Correo Electronico @...</label>
                            </div>
                        </div>
                    </div>
                </div>                   
            </div>
        </div>
        <div class="section">

            <div class="container">
                <div class="row">
                    <div class="card blue-grey darken-1">

                        <div class="col s12 m8 l9">                  
                            <p>
                                <input name="group1" type="radio" id="test1" />
                                <label for="test1">Red</label>
                            </p>
                            <p>
                                <input name="group1" type="radio" id="test2" />
                                <label for="test2">Yellow</label>
                            </p>
                            <p>
                                <input class="with-gap" name="group1" type="radio" id="test3" />
                                <label for="test3">Green</label>
                            </p>
                            <p>
                                <input name="group1" type="radio" id="test4" disabled="disabled" />
                                <label for="test4">Brown</label>
                            </p>                  
                        </div>
                    </div> 
                </div>
            </div>
        </form>
    </div>

    <div class="section">
        <div class="container">
            <form action="#" method="POST">    
                <div class="input-field col s2 ">
                    <div class="input-field col s12">
                        <select name="etacionamientos">

                            <option value="" disabled selected>Estacionamientos</option>
                            <%for (Estacionamiento esta : listaEsta) {%>
                            <option value="<%=esta.getIdEstacionamiento()%>"><%=esta.getNombreEsta()%></option>
                            <%
                                }
                            %>
                            <option value="Calera de Tango">Calera de Tango</option>
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
