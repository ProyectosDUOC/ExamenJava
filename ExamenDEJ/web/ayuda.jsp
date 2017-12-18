<%-- 
    Document   : ayuda
    Created on : 14-dic-2017, 2:54:58
    Author     : benja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ayuda Auto Park</title>
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
            <h1 class="center-align">Preguntas Frecuentes</h1>
            <div class="center-align">                
                <img src="images/Logo.png"   width="200" height="100" alt="Logo"/>
            </div>    
            <div class="card">
                <div class="card-content blue lighten-2">
                    <ul class="collapsible" data-collapsible="accordion">
                        <li>
                            <div class="collapsible-header"><i class="material-icons">directions_car</i>¿Que es AutoPark?</div>
                            <div class="collapsible-body">
                                <span>
                                    Es un sistema Online en el cual puedes pagar las boletas de los 
                                    estacionamientos en los que has estado, a lo largo de todo Chile.
                                </span>
                            </div>
                        </li>
                        <li>
                            <div class="collapsible-header"><i class="material-icons">format_list_numbered</i>¿Como puedo ver mis boletas pendientes?</div>
                            <div class="collapsible-body">
                                <span>
                                    1.- Al ingresar a la pagina principal de AutoPark, aparecera un boton de color
                                    rojo que dira "APP Movil"y le damos click. 
                                    <br/><br/> 
                                    2.- Al darle click nos llevara a la pagina de acceso de la pagina Web,via movil
                                    y aparecera una linea de texto que nos solicitara nuestro Rut sin puntos ni guión,
                                    ingresamos nuestro rut y le damos al botón anaranjado que dice "Acceder".
                                    <br/><br/> 
                                    3.- posteriormente si nuestro Rut es correcto, apareceran nuestros datos personales,
                                    tales como nombre, rut, correo electronico y número de telefono asociado, junto a
                                    una tabla con la lista de todos los tickets de cada estacionamiento a pagar.
                                </span>
                            </div>
                        </li>
                        <li>
                            <div class="collapsible-header"><i class="material-icons">local_atm</i>¿Como puedo pagar mis cuentas de estacionamiento?</div>
                            <div class="collapsible-body">
                                <span>1.- En la parte superior de la pantalla, en una barra de color azul, apareceran una
                                    serie de opcciones una de esas opciones es "Pagar".
                                    <br/><br/> 
                                    2.- Le damos Click en "Pagar" y nos reenviara a la Pagina de Pago de cuentas.
                                    <br/><br/> 
                                    3.- Rellenamos los campos que nos pedia a continuacion, y psoteriormente nos apareceran en 
                                    la parte inferior de la pagina.
                                    <br/><br/> 
                                    4.- En la parte inferior nos saldra un campo de datos en forma de cascada donde debemos de seleccionar
                                    el estacionamiento y mas abajo un campo que nos pedira el Id del Ticket que deseamos pagar.
                                    <br/><br/> 
                                    5.- Le damos al boton de color  rojo que dice "Agregar", y nos aparecera abajo el ticket que hemos ingresado
                                    a una lista de Tickets, que mostrara sus datos, y mas abajo aparecera el monto total de la boleta a pagar.
                                    <br/>
                                    En caso de que no querramos pagar un ticket, por algun motivo, al lado derecho de cada ticket, aparecera
                                    un boton amarillo en cual dice "Eliminar", y al darle click, se eliminara ese Ticket de la cuenta a pagar. 
                                    <br/><br/> 
                                    6.- Mas abajo, nos apareceran las posibles formas de pago y las posibles formas de envio, debe escojer solo
                                    una forma de pago y solo una forma de envio.
                                    <br/><br/> 
                                    7.- Al darle Click al boton "Pagar" nos enviara la pagina de pago de estacionamientos, este nos mostrara en 
                                    pantalla todos los tickets de estacionamiento que deseamos pagar, con sus espectivos datos y de paso, 
                                    el total a pagar de la boleta, junto a su forma de pago. 
                                </span>
                            </div>
                        </li>
                        <li>
                            <div class="collapsible-header"><i class="material-icons">face</i>¿Como puedo hacerme cliente de AutoPark?</div>
                            <div class="collapsible-body">
                                <span>
                                    1.- Puedes hacerte cliente de AutoPark descargando la aplicacion de forma gratuita de Internet desde GooglePlay o desde
                                    la AppStore.
                                    <br/><br/>
                                    2.- la descarga y el servicio es Gratuita y se asocia al correo electronico registrado en el sistema de tienda de aplicaciones
                                    por lo cual los datos deben de ser reales y confirmarse.
                                    <br/><br/>
                                    3.- no hay ningun costo de mantencion por tener la Apliacion.
                                </span>
                            </div>
                        </li>
                        <li>
                            <div class="collapsible-header"><i class="material-icons">place</i>¿Como puedo ver la ubicacion de los Estacionamientos de AutoPark en el mapa?</div>
                            <div class="collapsible-body">
                                <span>
                                    1.- En la parte superior de la pantalla se encuentra uan barra azul, buscamos 
                                    la opcion que dice "Ver Estacionamientos" y le damos Click.
                                    <br/><br/>
                                    2.- Al darle Click nos llevara a la Pagina que nos mostrara en el mapa, todos los 
                                    estacionamientos que se ecneutran dentro del sistema de AutoPark, indicando sus puntos
                                    de ubicacion en el mapa.
                                    3.- Tambien saldran al lado derecho del mapa una lista de estacionamientos que posee AutoPark,
                                    el cual, al darle click nos saldra la opcion "mostrar", y nos mostrara directamente en el
                                    mapa donde se encuentra el estacionamiento seleccionado.
                                </span>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>



        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script> 
    </body>
</html>
