/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wendy
 */
import java.sql.*;

public class Administracion {
    String sql;
    String sql2;
    String sql3;
    String sql5;
    ResultSet resultado,resultado2;
    int total_registros=0;
    private Connection Con;
    private Statement S,S2,S3,S4,S5;
    int auxiliar[];
    
    public Administracion(){
    String usuario="root";
    String password="57525404";
    String servidor="jdbc:mysql://localhost/sakiko";
    String controlador="com.mysql.jdbc.Driver";
    System.out.println("Cargando controlador");
    try{
        Class.forName(controlador);
        System.out.println ("Controlador OK");
    }
    catch(ClassNotFoundException error){
        System.out.println ("Error de Controlador" + error);
    }
    System.out.println ("Conectándose");
    try{
        Con=DriverManager.getConnection(servidor,usuario,password);
        System.out.println ("Proyecto Terminal Universidad La Salle Noviembre, 2015");
        System.out.println ("Conexión OK");
    }
    
    catch(SQLException error){
        System.out.println ("Error de Conexión" + error);
    }
    
    
    }
    
    //método para agregar datos de la tabla menu
    public void agregar_datos(String nombre, double precio, int cantidad){
    
    sql="";
    sql="insert into MENU (PLATILLO,PRECIO,CANTIDAD)";
    sql=sql + " ";
    sql=sql + "values(";
    //sql=sql + clave ;
    //sql=sql + " , ";
    sql=sql + "' ";
    sql=sql + nombre;
    sql=sql + " ' ";
    sql=sql + " , ";
    sql=sql + precio;
    sql=sql + " , ";
    sql=sql + cantidad;
    sql=sql + ")";
    
    
   sql2="SELECT CLAVE_PLATILLO FROM MENU";
   
   
   //sql2="UPDATE ORDENES SET ORDENES.CLAVE_PLATILLO <> MENU.CLAVE_PLATILLO";
  // sql2=sql2 + " ";
   //sql2=sql2 + "SELECT CLAVE_PLATILLO FROM MENU";
   
   
   //sql2=sql2 + ")";
    
    //sql2="update ORDENES SET CLAVE_PLATILLO= MENU.CLAVE_PLATILLO WHERE ORDENES.CLAVE_PLATILLO <> MENU.CLAVE_PLATILLO";
   // sql3="update CONTABILIDAD SET CLAVE_PLATILLO= MENU.CLAVE_PLATILLO WHERE CONTABILIDAD.CLAVE_PLATILLO <> MENU.CLAVE_PLATILLO"; 
    //sql3="insert into CONTABILIDAD (CLAVE_PLATILLO)";
    //sql3=sql3 + " ";
    //sql3= sql3 + "values (";
    //sql3=sql3 + clave;
    //sql3=sql3 + ")";
    
    
    try{
   S=Con.createStatement();
   S.executeUpdate(sql);
    
    System.out.println("Se agregaron los datos");
    S2=Con.createStatement();
    resultado=S2.executeQuery(sql2);
//    sql3="INSERT INTO MENU(CLAVE_PLATILLO)";
  //  sql3=sql3 + "values(";
    //sql3=sql3 + resultado.next();
    //sql3=sql3 + ")";
     boolean registro=resultado.next();
     
  //   while (registro){
   //     System.out.println(resultado.next());
   //  }
     auxiliar=new int [100];
     int total_registros=0;
     do {
        //System.out.println(resultado.getInt(1));
     auxiliar[total_registros]=resultado.getInt(1);
     total_registros++;
     
     } while (resultado.next());
     int l=0;
            while(l<total_registros)
            {
                
                
                // AGREGANDO LAS CLAVES PARA ORDENES(SQL3)
                sql3="INSERT INTO ORDENES (CLAVE_PLATILLO)";
                sql3= sql3 + "values(";
                sql3= sql3 + auxiliar[l];
                sql3= sql3 + ")";
    
                //AGREGANDO LAS CLAVES PARA CONTABILIDAD(SQL2)
                sql2="INSERT INTO CONTABILIDAD (CLAVE_PLATILLO)";
                sql2= sql2 + "values(";
                sql2= sql2 + auxiliar[l];
                sql2= sql2 + ")";
                        
                        
                l++;
            }
    
    //System.out.println("Se actualizaron los datos en la tabla de ORDENES ");
    //SE VAN A AGREGAR LAS CLAVES PARA CONTABILIDAD
    S2=Con.createStatement();
    S2.executeUpdate(sql2);
    
    S3=Con.createStatement();
    S3.executeUpdate(sql3);
    
    
    //System.out.println("Se actualizaron los datos en la tabla de CONTABILIDAD");
    //INSTRUCCIÓN SQL PARA ACTUALIZAR LA TABLA FINANZAS HACIENDO LOS TOTALES DE VENTA 
    
    sql5= "UPDATE CONTABILIDAD SET CONTABILIDAD.TOTAL_CUENTA = MENU.CANTIDAD * MENU.PRECIO WHERE MENU.CANTIDAD>0";
    S4=Con.createStatement();
    S4.executeUpdate(sql5);
    
    }
    catch(SQLException e){
        
    }
    finally
    {
        if(Con!=null){
         try{
    //CERRANDO RECURSOS DE BASE DE DATOS
             
            resultado.close();
            S.close();
            S2.close();
            S3.close();
            S4.close();
             //Con.close();
         }
         catch (SQLException e)
         {
             
         }
        }
    }
   
    
    
    }
    
    public void Contabilidad(){
        //rutina para conectarse 
        String sql4;
        double total[];
        int j=0;
         Connection Con2;
        total=new double [100];
        int tot=0;
        System.out.println("entrando a la área de cálculo");
        try{
            sql4="SELECT PRECIO,CANTIDAD FROM MENU";
             S5=Con.createStatement();
            resultado2=S5.executeQuery(sql4);
          //  boolean flag=resultado2.next();
            
     boolean registro=resultado2.next();
          System.out.println("Registro");
            
         do{
              total[j]=(double)resultado2.getDouble(1)* resultado2.getInt(2);
              System.out.println(total [j]);  
    //  System.out.println("El primer registro es : " + resultado2.getDouble(1));
              
             
        //      System.out.println("PRUEBA");
                     j++;
          
          } while(resultado2.next());       
        
        
        //cerrando recursos 
        //S5.close();
        //resultado2.close();
        }
        catch(SQLException e){
        
        System.out.println("Error de SQL" +e);
        
        }
    //enviando el resultado a la tabla contabilidad 
    tot=j;
    j=0;
    sql5="insert into  CONTABILIDAD (TOTAL_CUENTA) VALUES( ";
    sql5= sql5 + total[j];
     sql5=sql5+")";

    while(j<tot){
       try{
          S5=Con.createStatement();
          S5.executeUpdate(sql5);
        }
        catch(SQLException e){
        }
        j++;
        
    }
    }
    
    
    
    }
        
        
      // return S;
 

    
    
    
    
