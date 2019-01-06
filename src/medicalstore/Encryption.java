/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalstore;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Anand
 */
public class Encryption {
    static int a=0;
    static Map<String,String> enstring = new HashMap<String,String>();
    static {
        enstring.put("a", "Q");
        enstring.put("b", "W");
        enstring.put("c", "E");
        enstring.put("d", "R");
        enstring.put("e", "S");
        enstring.put("f", "T");
        enstring.put("g", "U");
        enstring.put("h", "I");
        enstring.put("i", "O");
        enstring.put("j", "P");
        enstring.put("k", "Z");
        enstring.put("l", "X");
        enstring.put("m", "C");
        enstring.put("n", "V");
        enstring.put("o", "B");
        enstring.put("p", "N");
        enstring.put("q", "M");
        enstring.put("r", "A");
        enstring.put("s", "S");
        enstring.put("t", "D");
        enstring.put("u", "F");
        enstring.put("v", "G");
        enstring.put("w", "H");
        enstring.put("x", "J");
        enstring.put("y", "K");
        enstring.put("6", "L");
        enstring.put("7", "<");
        enstring.put("9", "?");
        enstring.put("3", "+");
        enstring.put("5", "(");
        enstring.put("1", ")");
        enstring.put("4", "*");
        enstring.put("8", "^");
        enstring.put("2", "&");
    }
    static public String signedUp(String pword){
        
        String epword="";
        char ch[]=pword.toCharArray();
        for(char c:ch )
        {
            if(enstring.containsKey(String.valueOf(c))){
                epword=epword+enstring.get(String.valueOf(c));
            }
            else{
                epword+="%";
            }
        }
        return epword;
        //JOptionPane.showMessageDialog(LogIn.this,"you are successfully sign up");
       
       
    }
       
        static public int loggedIn(String user,String pword){
        
        String epword="";
        char ch[]=pword.toCharArray();
        for(char c:ch )
        {
            if(enstring.containsKey(String.valueOf(c))){
                epword=epword+enstring.get(String.valueOf(c));
            }
            else{
                epword+="%";
            }
        }
        try{
            Connection con = dbutil.getConnection();
             String query = "select * from account where username=? and password=?" ;
             PreparedStatement ps = con.prepareStatement(query);
             ps.setString(1, user);
             ps.setString(2, epword);
             
             ResultSet rs = ps.executeQuery();
             if(rs.next()){
                 System.out.println("WELCOME");
                 return 0;
             }
             else{
                 return 1;
                 
            }
             
        }
        catch(Exception e){
                           System.out.println(e);
                           return 2;
        }
     } 
        
    
   
}
