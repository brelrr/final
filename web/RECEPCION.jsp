<%-- 
    Document   : Recepcion
    Created on : 15/11/2015, 03:04:00 PM
    Author     : wendy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recepción</title>
    </head>
    <body>
        <h1>Recepción de Datos Carta</h1>
        <p>
          <%
        String gyoza01=null;
        String uramaki02=null;
        String sashimi03=null;
        String nigiris04=null;
	String kakiage05=null;
        String ebi06=null;
        String yakimeshi07=null;
        String pulpo08=null;
        String langostino09=null;
        String yakisoba01=null;
        String yakitori01=null;
        double gyoza1=0,uramaki2=0,sashimi3=0,nigiris4=0,kakiage5=0,ebi6=0,yakimeshi7=0,pulpo8=0,langostino9=0;  
        double yakisoba02=0,yakitori02=0;
        double preciogyoza=45,preciouramaki=36,preciosashimi=67,precionigiris=45,preciokakiage=34,precioebi=87,precioyakimeshi=54,preciopulpo=44;
        double preciolangostino=76,precioyakisoba=54,precioyakitori=34;
		if (request.getParameter("gyoza")!=null){
			gyoza01=request.getParameter("gyoza");
			gyoza1=Double.parseDouble(gyoza01);	
		}
		if (request.getParameter("uramaki")!=null){
			uramaki02=request.getParameter("uramaki");
			uramaki2=Double.parseDouble(uramaki02);	
		}
		if (request.getParameter("sashimi")!=null){
			sashimi03=request.getParameter("sashimi");
			sashimi3=Double.parseDouble(sashimi03);	
		}
		if (request.getParameter("nigiris")!=null){
			nigiris04=request.getParameter("nigiris");
			nigiris4=Double.parseDouble(nigiris04);	
		}
		if (request.getParameter("kakiage")!=null){
			kakiage05=request.getParameter("kakiage");
			kakiage5=Double.parseDouble(kakiage05);	
		}
		if (request.getParameter("ebi")!=null){
			ebi06=request.getParameter("ebi");
			ebi6=Double.parseDouble(ebi06);	
		}
		
		if (request.getParameter("yakimeshi")!=null){
			yakimeshi07=request.getParameter("yakimeshi");
			yakimeshi7=Double.parseDouble(yakimeshi07);	
		}
		if (request.getParameter("pulpo")!=null){
			pulpo08=request.getParameter("pulpo");
			pulpo8=Double.parseDouble(pulpo08);	
		}
		if (request.getParameter("langostino")!=null){
			langostino09=request.getParameter("langostino");
			langostino9=Double.parseDouble(langostino09);	
		}
		if (request.getParameter("yakisoba")!=null){
			yakisoba01=request.getParameter("yakisoba");
			yakisoba02=Double.parseDouble(yakisoba01);	
		}
		if (request.getParameter("yakitori")!=null){
			yakitori01=request.getParameter("yakitori");
			yakitori02=Double.parseDouble(yakitori01);	
		}
		double totalunidades= gyoza1+uramaki2+sashimi3+nigiris4+kakiage5+ebi6+yakimeshi7+pulpo8+langostino9+yakisoba02+yakitori02;
                
                out.println("El número de unidades en su orden: " + totalunidades);
                
                
                double totalgyoza=(gyoza1*preciogyoza);
                double totaluramaki=(uramaki2*preciouramaki);
                double totalsashimi=(sashimi3*preciosashimi);
                double totalnigiris=(nigiris4*precionigiris);
                double totalkakiage=(kakiage5*preciokakiage);
                double totalebi=(ebi6*precioebi);
                double totalyakimeshi=(yakimeshi7*precioyakimeshi);
                double totalpulpo=(pulpo8*preciopulpo);
                double totallangostino=(langostino9*preciolangostino);
                double totalyakisoba=(yakisoba02*precioyakisoba);
                double totalyakitori=(yakitori02*precioyakitori);
                
                double cuenta=(totalgyoza+totaluramaki+totalsashimi+totalnigiris+totalkakiage+totalebi+totalyakimeshi+totalpulpo+totallangostino+totalyakisoba+totalyakitori);
                
                out.println("El total de su orden es de $ " + cuenta);
                %>
        </p>
        
        <p><a href="index.jsp">REGRESAR A INICIO</a></p>
                
                
  

    </body>
</html>
