<%-- 
    Document   : CARTA
    Created on : 12/11/2015, 06:02:04 PM
    Author     : wendy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>CARTA</title>
    <style type="text/css">
    body {
	background-color: #CCC;
}
    </style>
    </head>
    <body>
        <h1 align="center">BIENVENIDO A SAKIKO   <img src="PICTURES/sakiko_menu.png" width="151" height="163"></h1>
        <p align="center"> FAVOR DE SELECCIONAR EL PEDIDO QUE DESEA ORDENAR,GRACIAS.</p>
        <form action="/SAKIKO/MENU" method="post">
<table width="737" height="635" border="1" align="center" >
  <tr>
            <td width="567"><div align="left">
              <select name="gyoza" id="gyoza">
                <option selected="selected">0</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
              </select>
            <strong>GYOZA</strong> (EMPANADITAS  AL VAPOR) </div></td>
            <td width="154" align="center"><input name="precio_0" type="text" id="precio_0" value="45" readonly></td>
          </tr>
          <tr>
            <td><label for="uramaki"></label>
              <div align="left">
                <select name="uramaki" id="uramaki">
                  <option selected="selected">0</option>
                  <option>1</option>
                  <option>2</option>
                  <option>3</option>
                  <option>4</option>
                  <option>5</option>
                  <option>6</option>
                  <option>7</option>
                  <option>8</option>
                  <option>9</option>
                  <option>10</option>
                </select>
            <strong>URAMAKI</strong> (ARROLLADO DE ARROZ) </div></td>
            <td align="center"><input name="precio_1" type="text" id="precio_" value="36" readonly></td>
          </tr>
          <tr><label for="sashimi"></label>
            <td><div align="left">
              <select name="sashimi" id="sashimi">
                <option selected="selected">0</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
              </select>
            <strong>SASHIMI</strong>(LAMINAS DE PESCADO FRESCO) </div></td>
            <td align="center"><input name="precio_2" type="text" id="precio_2" value="67" readonly></td>
          </tr>
          <tr><label for="nigiris"></label>
            <td><div align="left">
              <select name="nigiris" id="nigiris">
                <option selected="selected">0</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
              </select>
            <strong>NIGIRIS</strong> (SALMON ROSADO) </div></td>
            <td align="center"><input name="precio_3" type="text" id="precio_3" value="45" readonly></td>
          </tr>
          <tr>
            <td><label for="kakiage"></label>
              <div align="left">
                <select name="kakiage" id="kakiage">
                  <option selected="selected">0</option>
                  <option>1</option>
                  <option>2</option>
                  <option>3</option>
                  <option>4</option>
                  <option>5</option>
                  <option>6</option>
                  <option>7</option>
                  <option>8</option>
                  <option>9</option>
                  <option>10</option>
                </select>
            <strong>KAKIAGE</strong> (TEMPURA DE VEGETALES) </div></td>
            <td align="center"><input name="precio_4" type="text" id="precio_4" value="34" readonly></td>
          </tr>
          <tr><label for="ebi"></label>
            <td><div align="left">
              <select name="ebi" id="ebi">
                <option selected="selected">0</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
              </select>
            <strong>EBI FRIED</strong> (LANGOSTINOS CROCANTES CON ENSALADA) </div></td>
            <td align="center"><input name="precio_5" type="text" id="precio_5" value="87" readonly></td>
          </tr>
          <tr><label for="yakimeshi"></label>
            <td><div align="left">
              <select name="yakimeshi" id="yakimeshi">
                <option selected="selected">0</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
              </select>
            <strong>YAKIMESHI</strong> (ARROZ SALTEADO) </div></td>
            <td align="center"><input name="precio_6" type="text" id="precio_6" value="54" readonly></td>
          </tr>
          <tr><label for="pulpo"></label>
            <td><div align="left">
              <select name="pulpo" id="pulpo">
                <option selected="selected">0</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
              </select>
            <strong>PULPO</strong> (PULPO) </div></td>
            <td align="center"><input name="precio_7" type="text" id="precio_7" value="44" readonly></td>
          </tr>
          <tr><label for="langostino"></label>
            <td><div align="left">
              <select name="langostino" id="langostino">
                <option selected="selected">0</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
              </select>
            <strong>LANGOSTINO</strong> (LANGOSTINO) </div></td>
            <td align="center"><input name="precio_8" type="text" id="precio_8" value="76" readonly></td>
          </tr>
          <tr><label for="yakisoba"></label>
            <td><div align="left">
              <select name="yakisoba" id="yakisoba">
                <option selected="selected">0</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
              </select>
            <strong>YAKISOBA</strong> (FIDEOS DE TRIGO) </div></td>
            <td align="center"><input name="precio_9" type="text" id="precio_9" value="54" readonly></td>
          </tr>
          <tr><label for="yakitori"></label>
            <td><select name="yakitori" id="yakitori">
              <option selected="selected">0</option>
              <option>1</option>
              <option>2</option>
              <option>3</option>
              <option>4</option>
              <option>5</option>
              <option>6</option>
              <option>7</option>
              <option>8</option>
              <option>9</option>
              <option>10</option>
              </select>
            <strong>YAKITORI</strong> (BROCHETTE DE POLLO AL JENGIBRE) </td>
            <td align="center"><input name="precio_10" type="text" id="precio_10" value="34" readonly></td>
          </tr>
          <tr>
            <td><div align="left">
              <input type="submit" name="ENVIAR" id="ENVIAR" value="Enviar">
*Al dar click aceptas los términos y condiciones de SAKIKO</div></td>
            <td align="center">&nbsp;</td>
          </tr>
    </table>
        </form>
 <p><a href="index.jsp">REGRESAR A INICIO</a></p>
</body>
</html>
