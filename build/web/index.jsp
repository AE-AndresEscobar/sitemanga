<%-- 
    Document   : index
    Created on : 23/10/2020, 08:33:46 PM
    Author     : andres
--%>

<%@page import="modelo.usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            HttpSession sesion = request.getSession();
            usuario usu = (usuario)sesion.getAttribute("usuario");
        %>
        <div>
            <div>
                <p>
                    <%=usu.getUsuario()%>
                </p>
                
            </div>
        </div>
    </body>
</html>
