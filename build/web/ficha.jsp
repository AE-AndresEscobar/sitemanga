<%-- 
    Document   : ficha
    Created on : 23/10/2020, 05:01:21 PM
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
    <form action="fichaC" method="get">
        <div>
            <div></div>
            <div>
                <figure></figure>

                <input type="submit" value="Guardad">
                <input type="button" value="Cancelar">
                
                <br>
                
                <label for="nombre"><p>Nombre:</p></label>
                <input type="text" name="nombre" id="nombre" class="nombre">
                <label for="codigo"><p>Codigo:</p></label>
                <input type="number" name="codigo" id="codigo" class="codigo">
            </div>
            <div></div>
        </div>
        <div>
            <label for="stomo"><p>Tomo:</p></label><br>
            <input type="number" name="tomo" id="tomo" class="tomo">
            <label for="origen"><p>Origen:</p></label><br>
            <input type="text" name="origen" id="origen" class="origen">
            <label for="editorial"><p>Editorial:</p></label>
            <input type="text" name="editorial" id="editorial" class="editorial">
            <label for="idioma"><p>Idioma:</p></label>
            <input type="text" name="idioma" id="idioma" class="idioma">
            <label for="caracteristicas"><p>Caracteristicas:</p></label>
            <input type="text" name="caracteristicas" id="caracteristicas" class="caracteristicas">
        </div>
        <div></div>
    </form>
</body>

</html>