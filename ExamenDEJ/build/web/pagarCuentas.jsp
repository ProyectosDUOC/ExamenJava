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
        <link href="css/pagarCuentas.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <script>
            function habilitar(value)
            {
                if (value.length() > 0)
                {
                    // habilitamos
                    document.getElementById("tel").disabled = false;
                } else if (value.length() === 0) {
                    document.getElementById("tel").disabled = true;
                }
            }
        </script> 

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
        <br>
        <br>

        <div class="container" id="acceso">
            <div class="row">
                <h4 class="white green-text">Auto Park: Servicio online a la comodidad del Usuario</h4>
                <div class="col s12 m4">
                    <div class="card orange lighten-5">
                        <div class="card-content blue-text">
                            <span class="card-title">Datos Personales</span>
                            <div class="input-field">
                                <i class="material-icons prefix">account_circle</i>
                                <input id="rut" type="text" maxlength="9" name="rut" required="requered" /> 
                                <label for="rut" class="blue-text" >Rut  ejemplo 190000008</label>
                            </div>
                            <div class="input-field">
                                <i class="material-icons prefix">people</i>
                                <input id="nombre" type="text" name="Nombre" required="requered" onchange="habilitar(this.value);" />
                                <label for="nombre" class="blue-text">Nombre Completo</label>
                            </div>
                            <div class="input-field">
                                <i class="material-icons prefix">local_phone</i>
                                <input id="tel" type="text" maxlength="12" required="requered" />
                                <label for="tel" class="blue-text">Telefono +569XXXXXXXX</label>
                            </div>
                            <div class="input-field">
                                <i class="material-icons prefix">email</i>
                                <input id="correo" type="email" name="correo" required="requered" />
                                <label for="correo" class="blue-text">Correo Electronico @...</label>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col s6 slider">
                    <div class="carousel carousel-slider">
                        <a class="carousel-item" href="#one!"><img  width="600" height="400" src="images/auto1.jpg"></a>
                        <a class="carousel-item" href="#two!"><img width="600" height="400"  src="images/auto2.jpg"></a>
                        <a class="carousel-item" href="#three!"><img width="600" height=400  src="images/auto3.jpg"></a>
                        <a class="carousel-item" href="#four!"><img width="600" height="400"  src="images/auto1.jpg"></a>
                    </div>
                </div>
                <div class="col s12">                    
                    <div class="card orange lighten-5">
                        <div class="card-content orange lighten-5">
                            <span class="card-title center-align">Estacionamientos</span>
                            <div class="input-field col s12">                                
                                <select name="etacionamientos" id="comboBox">
                                    <option value="" disabled selected>Estacionamientos</option>
                                    <%for (Estacionamiento esta : listaEsta) {
                                    %>
                                    <option value="<%=esta.getIdEstacionamiento()%>"><%=esta.getNombreEsta()%> - <%=esta.getGlosa()%></option>
                                    <%
                                        }
                                    %>
                                </select>                                
                                <label class="black-text">Selecciones un Estacionamiento</label>
                            </div>

                            <div class="input-field col s6">
                                <i class="material-icons prefix">email</i>
                                <input id="correo" type="email" name="correo" required="requered" />
                                <label for="correo" class="blue-text">Correo Electronico @...</label>
                            </div>
                            <button class="btn waves-effect waves-light red white-text col s6" type="submit" name="action">Agregar
                                <i class="material-icons right">send</i>
                            </button>
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
