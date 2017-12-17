<%-- 
    Document   : entregaBoucher
    Created on : 14-dic-2017, 2:57:58
    Author     : benja
--%>

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
                <div class="col s12">                    
                    <div class="card">
                        <div class="card-content orange lighten-5">
                            <span class="card-title center-align">Entrega de Pago Estacionamiento</span>
                            <div class="input-field ">                                
                                <select name="estacionamientos" >
                                    <option value="" disabled selected>Estacionamientos</option>
                                    
                                </select>                                
                                <label class="black-text">Selecciones un Estacionamiento</label>
                            </div>
                            <div class="input-field">
                                <i class="material-icons prefix"></i>
                                <input id="id" type="text" maxlength="9" name="idTicket"/> 
                                <label for="id" class="blue-text" >Id Ticket</label>
                            </div>
                            <div class="input-field">
                                <button class="btn waves-effect waves-light red white-text" type="submit" name="opcion" value="agregar">Agregar
                                    <i class="material-icons right">add_circle_outline</i>
                                </button>
                                
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
