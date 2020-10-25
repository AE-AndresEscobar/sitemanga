<%-- 
    Document   : login__empleado
    Created on : 24/10/2020, 04:30:55 PM
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
            <label for="codigo">
                <p>Codigo:</p>
            </label>
            <input type="text" name="codigo" id="codigo" class="codigo">
            
            <br>

            <label for="nombre">
                <p>Nombre:</p>
            </label>
            <input type="text" name="nombre" id="nombre" class="nombre">

            <br>

            <label for="contrasena">
                <p>Contraseña:</p>
            </label>
            <input type="text" name="contrasena" id="contrasena">

            <br>

            <input type="submit" value="registrar" class="registrar" id="registrar" name="boton">
        </form>
    </div>
    </body>
</html>
