/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wendy
 */
@WebServlet(urlPatterns = {"/MENU"})
public class MENU extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String nombre_platillo[]=new String[100];
        String Platillos[];
        int platillo3[];
        platillo3=new int[100];
        double precios[];
        precios= new double [100];
        String PRECIOS[]=new String[100];
        Platillos= new String [11];
        Platillos[0]=request.getParameter("gyoza");
        Platillos[1]=request.getParameter("uramaki");
        Platillos[2]=request.getParameter("sashimi");
        Platillos[3]=request.getParameter("nigiris");
        Platillos[4]=request.getParameter("kakiage");
        Platillos[5]=request.getParameter("ebi");
        Platillos[6]=request.getParameter("yakimeshi");
        Platillos[7]=request.getParameter("pulpo");
        Platillos[8]=request.getParameter("langostino");
        Platillos[9]=request.getParameter("yakisoba");
        Platillos[10]=request.getParameter("yakitori");
        
        PRECIOS[0]=request.getParameter("precio_0");
        PRECIOS[1]=request.getParameter("precio_1");
        PRECIOS[2]=request.getParameter("precio_2");
        PRECIOS[3]=request.getParameter("precio_3");
        PRECIOS[4]=request.getParameter("precio_4");
        PRECIOS[5]=request.getParameter("precio_5");
        PRECIOS[6]=request.getParameter("precio_6");
        PRECIOS[7]=request.getParameter("precio_7");
        PRECIOS[8]=request.getParameter("precio_8");
        PRECIOS[9]=request.getParameter("precio_9");
        PRECIOS[10]=request.getParameter("precio_10");
        
        String Platillo="";
         int platillo2=0;
         
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MENU</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>SAKIKO MENU at PLATILLO SELECCIONADO </h3>");
            out.println("<h1>ORDEN DE PEDIDO : </h1>");
                       
            int j=0; 
            int i=0;
            for(i=0;i<Platillos.length;i++){
                Platillo="";
                 Platillo=Platillos[i];
                 platillo2=Integer.parseInt(Platillo);
                 
                if(platillo2 !=0){
                 
            
                //rutina para seleccionar el nombre del platillo
                
                 if(i==0 )
                 {
                     precios[j]=Double.parseDouble(PRECIOS[0]);
                     nombre_platillo[j]="GYOZA";
                     platillo3[j]=platillo2; 
                     out.println("<br>SU PLATILLO ES: " + nombre_platillo[j] +" CANTIDAD : "+ platillo3[j]+  "PRECIO UNITARIO : " + precios[j]+ "</br>");
                      out.println("");
                 }
                 if(i ==1){
                     precios[j]=Double.parseDouble(PRECIOS[1]);
                     nombre_platillo[j]="URAMAKI";
                     platillo3[j]=platillo2; 
                     out.println("<br>SU PLATILLO ES: " + nombre_platillo[j] +" CANTIDAD : "+ platillo3[j] + "PRECIO UNITARIO : " + precios[j]+ "</br>");
                     out.println("");
                 }
                 if (i==2){
                     precios[j]=Double.parseDouble(PRECIOS[2]);
                     nombre_platillo[j]="SASHIMI";
                     platillo3[j]=platillo2; 
                     out.println("<br>SU PLATILLO ES: " + nombre_platillo[j] +" CANTIDAD : "+ platillo3[j] + "PRECIO UNITARIO : " + precios[j]+ "</br>");
                     out.println("");
                 }
                 if (i==3){
                     precios[j]=Double.parseDouble(PRECIOS[3]);
                     nombre_platillo[j]="NIGIRIS";
                     platillo3[j]=platillo2; 
                     out.println("<br>SU PLATILLO ES: " + nombre_platillo[j] +" CANTIDAD : "+ platillo3[j] + "PRECIO UNITARIO : " + precios[j]+ "</br>");
                     out.println("");
                 }
                 if(i==4){
                     precios[j]=Double.parseDouble(PRECIOS[4]);
                     nombre_platillo[j]="KAKIAGE";
                     platillo3[j]=platillo2; 
                     out.println("<br>SU PLATILLO ES: " + nombre_platillo[j] +" CANTIDAD : "+ platillo3[j] + "PRECIO UNITARIO : " + precios[j]+ "</br>");
                     out.println("");
                 }
                 if(i==5){
                     precios[j]=Double.parseDouble(PRECIOS[5]);
                     nombre_platillo[j]="EBI FRIED";
                     platillo3[j]=platillo2;
                     out.println("<br>SU PLATILLO ES: " + nombre_platillo[j] +" CANTIDAD : "+ platillo3[j] + "PRECIO UNITARIO : " + precios[j]+ "</br>");
                     out.println("");
                 }
                 if(i==6){
                     precios[j]=Double.parseDouble(PRECIOS[6]);
                     nombre_platillo[j]="YAKIMESHI";
                     platillo3[j]=platillo2; 
                     out.println("<br>SU PLATILLO ES: " + nombre_platillo[j] +" CANTIDAD : "+ platillo3[j] + "PRECIO UNITARIO : " + precios[j]+ "</br>");
                     out.println("");
                 }
                 if(i==7){
                     precios[j]=Double.parseDouble(PRECIOS[7]);
                     nombre_platillo[j]="PULPO";
                     platillo3[j]=platillo2; 
                     out.println("<br>SU PLATILLO ES: " + nombre_platillo[j] +" CANTIDAD : "+ platillo3[j] + "PRECIO UNITARIO : " + precios[j]+ "</br>");
                     out.println("");
                 }
                 if(i==8){
                     precios[j]=Double.parseDouble(PRECIOS[8]);
                     nombre_platillo[j]="LANGOSTINO";
                     platillo3[j]=platillo2; 
                     out.println("<br>SU PLATILLO ES: " + nombre_platillo[j] +" CANTIDAD : "+ platillo3[j] + "PRECIO UNITARIO : " + precios[j]+ "</br>");
                     out.println("");
                 }
                 if(i==9){
                     precios[j]=Double.parseDouble(PRECIOS[9]);
                     nombre_platillo[j]="YAKISOBA";
                     platillo3[j]=platillo2; 
                     out.println("<br>SU PLATILLO ES: " + nombre_platillo[j] +" CANTIDAD : "+ platillo3[j]  + "PRECIO UNITARIO : " + precios[j]+ "</br>");
                     out.println("");
                 }
                 if(i==10){
                     precios[j]=Double.parseDouble(PRECIOS[10]);
                     nombre_platillo[j]="YAKITORI";
                     platillo3[j]=platillo2; 
                     out.println("<br>SU PLATILLO ES: " + nombre_platillo[j] +" CANTIDAD : "+ platillo3[j] + "PRECIO UNITARIO : " + precios[j]+ "</br>");
                     out.println("");
                 }
                 j++;
                }
                 
            }
            
            
            Administracion obj;
            
           
            
            for(int k=0;k<i;k++)
            {
                if(nombre_platillo[k]!=null){
              obj=null;
               obj=new Administracion();  
                obj.agregar_datos(nombre_platillo[k], precios[k], platillo3[k]);
                obj.Contabilidad();
              
                }
            }
                
            out.println("<BR><INPUT TYPE=SUBMIT VALUE=CONFIRMAR>"+"</BR>");
            //out.println ("</FORM>");
           
            
            out.println("</body>");
            out.println("</html>");
             
        }finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out2 = response.getWriter(); 
        out2.println("<br> se recibió un click </br>");
        
        
        
     
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
