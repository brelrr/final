<%-- 
    Document   : RESERVACIONES
    Created on : 12/11/2015, 06:02:43 PM
    Author     : wendy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>RESERVACIONES</title>
    <style type="text/css">
    body {
	background-color: #CCC;
}
    </style>
    </head>
    <body>
        <h1>HAGA SU RESERVACIÓN    <img src="PICTURES/sakiko_reservaciones.png" width="114" height="102"></h1>
        <p> Nombre:</p>
            <input type="text" name="Nombre">
            <p> Teléfono:</p>
            <input type="tel" name="Teléfono">
            <p> Fecha: </p>
             <input type="date" name="Fecha">
            
            <input type="submit" name="Enviar">
            
            <input type="reset" name="Limpiar">
            
            <p><a href="index.jsp">REGRESAR A INICIO</a></p>
     </body>
</html>
