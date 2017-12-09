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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% List<Comuna> lista = (new ComunaDAO()).Listar();  %>
        <% for (Comuna xx: lista){
                %>
                <p><%=xx.getNombreComuna()  %></p>
        <%       
            }
        %>
    
    </body>
</html>
