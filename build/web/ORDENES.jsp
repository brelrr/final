<%-- 
    Document   : ESTATUS
    Created on : 12/11/2015, 06:02:23 PM
    Author     : wendy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>ORDENES</title>
    <style type="text/css">
    body {
	background-color: #CCC;
}
    </style>
    </head>
    <body>
        <h1>STATUS GENERAL        </h1>
          <table width="658" height="259" border="1">
          <tr>
            <th width="261" align="center" scope="col"><div align="center">ESTATUS</div></th>
            <th width="381" align="center" scope="col"><div align="center">
              <form name="form1" method="post" action="">
                <select name="ESTATUS_LISTA" id="ESTATUS_LISTA">
                  <option selected="selected">PAGADO</option>
                  <option>PENDIENTE</option>
                </select>
              </form>
            </div></th>
          </tr>
          <tr>
            <td align="center"><div align="center">CLAVE_PLATILLO</div></td>
            <td align="center"><div align="center">
              <form name="form2" method="post" action="">
                <textarea name="CLAVE_PLATILLO_TEXTO" readonly="readonly" id="CLAVE_PLATILLO_TEXTO"></textarea>
              </form>
            </div></td>
          </tr>
        </table>
         <p><a href="index.jsp">REGRESAR A INICIO</a></p>
       
</body>
</html>
