
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerardo
 */
import java.sql.*; 
public class Conexion {
   static String bd = "hospital"; 
   static String login = "root"; 
   static String password = "canabis"; 
   static String url = "jdbc:mysql://localhost/"+bd; 
 
   Connection conn = null; 
    
   public Conexion() { 
      try{          
         Class.forName("com.mysql.jdbc.Driver");          
         conn = DriverManager.getConnection(url,login,password); 
         if (conn!=null){ 
            System.out.println("Conexión a base de datos "+bd+". Realizada"); 
         } 
      }catch(SQLException e){ 
         System.out.println(e); 
      }catch(ClassNotFoundException e){ 
         System.out.println(e); 
      } 
   } 
    
   public Connection getConnection(){ 
      return conn; 
   } 
 
   public void desconectar(){ 
      conn = null; 
   } 
    
}
