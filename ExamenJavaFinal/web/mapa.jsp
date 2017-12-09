<%-- 
    Document   : mapa
    Created on : 09-12-2017, 1:01:29
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>El Mapa</title>
        <style>
            #map {
                height: 400px;
                width: 50%;
            }

            #elmapa {
                width: 10%;
            }
        </style>
    </head>
    <body>
        <h1>El mapa</h1>
        <img id="elmapa" src="https://i.ytimg.com/vi/XObUGDMbETw/hqdefault.jpg">
        <div id="map"></div>
        <script>
            function initMap() {
                var casaBenja = {lat: -33.6311, lng: -70.7654};  //-33.6311241,-70.7654491,
                var map = new google.maps.Map(document.getElementById('map'), {
                    zoom: 16,
                    center: casaBenja
                });
                var marker = new google.maps.Marker({
                    position: casaBenja,
                    map: map,
                    label: 'Basural xD'
                });
            }
        </script>
        <script async defer
                src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAv1J4q_RwQyBqrQjGNB-4KDc4914pQ78I&callback=initMap">
        </script>

    </body>
</html>
