<%-- 
    Document   : login
    Created on : 23/10/2020, 08:33:15 PM
    Author     : andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>

<body>
    <h1>Login</h1>

    <div>
        <form action="accionesC" method="post">
            <label for="usuario">
                <p>Usuario:</p>
            </label>
            <input type="text" name="usuario" id="usuario" class="usuario">
            <label for="contrasena">
                <p>Contraseña:</p>
            </label>
            <input type="password" name="contrasena" id="contrasena">
            <input type="submit" value="Login" class="login" id="login" name="boton">
        </form>
    </div>
</body>

</html>