/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalstore;
import java.sql.*;

/**
 *
 * @author Anand
 */

public class dbutil {
    static  Connection  con = null;
    static  Connection getConnection(){
        try{
        if (con==null){
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@localhost:1521:xe";
            String uname="medicalstore";
            String pass="medical";
             con=DriverManager.getConnection(url, uname,pass);
             System.out.println(con);
        }
        return con;
        }
        catch(Exception e){
                System.out.println(e);
                return null;
               }
    }
    
   
    public static void main(String args){
        con =getConnection();
    }
    }

    
    

