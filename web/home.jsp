<%-- 
    Document   : home
    Created on : 23/10/2020, 04:36:54 PM
    Author     : andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.ficha"%>
<%--- --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% ficha f = (ficha)request.getAttribute("value");%>
        <div>
            <div>
                <p>
                    <%=f.getNombre()%>
                </p>
                
            </div>
        </div>
    </body>
</html>
