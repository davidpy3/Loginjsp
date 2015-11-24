<%-- 
    Document   : registro
    Created on : Nov 22, 2015, 11:33:26 PM
    Author     : djseven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarme</title>
    </head>
    <body>
        <h1>Forulario de Registro</h1>
        <form action="RegistrarU" method="post">
            <label >Dni</label>
            <input type="text" name="dni"/>
            <label >Nombre </label>
            <input type="text" name="apeterno"/>
            <label >Apellido</label>
            <input type="text" name="amaterno"/>
            <label >Contrasena</label>
            <input type="text" name="nombre"/>
            <input type="submit" name="Registrarme"/>
        </form>
        
    </body>
</html>
