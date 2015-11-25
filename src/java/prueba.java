/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wendy
 */
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
public class prueba {
    public static void main (String args[]){
       
         Administracion obj;
            
            obj=new Administracion();
            obj.agregar_datos("sushi",500,500);
            obj.agregar_datos("Gerardo",200,200);
            obj.Contabilidad();
    }
    
}
