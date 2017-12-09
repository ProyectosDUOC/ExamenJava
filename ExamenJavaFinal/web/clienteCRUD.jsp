<%-- 
    Document   : clienteCRUD
    Created on : 09-12-2017, 0:59:08
    Author     : carlos
--%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <% List<modelo.Comuna> listaComuna = (new dao.ComunaDAO().Listar());  %>
    </head>
    <body>

        <table border="1">           
            <tr>
                <td>Rut</td>
                <td>Nombre Cliente</td>
                <td>Telefono</td>
                <td>Correo</td>
                <td>Direccion</td>
               

            <div class="input-field col s12">
                <select name="comuna">                            
                    <option value="" disabled selected>Elija la comuna</option>
                    <% for (modelo.Comuna xx : listaComuna)
                    {                    
                    %>
                    <option value="<%=xx.getNombreComuna()%>" ><%=xx.getNombreComuna()%></option>
                    <%
                      }
                    %>
                </select>
                <label>Comuna</label>
            </div>
        </tr>
    </table>

</body>
</html>
