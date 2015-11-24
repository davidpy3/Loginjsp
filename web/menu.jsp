<%-- 
    Document   : menu
    Created on : Nov 23, 2015, 12:11:23 AM
    Author     : djseven
--%>

<%@page import="javax.servlet.http.HttpSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
HttpSession os=request.getSession(false);
String usuario=(String)os.getAttribute("usuario");

if(usuario.equals("")){    
    response.sendRedirect("index.jsp");
}
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
        <h1>Hola <%out.println(usuario);%></h1>
        <a href="registro.jsp">registrarme</a>
    </body>
</html>
