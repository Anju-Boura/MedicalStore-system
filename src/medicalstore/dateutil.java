/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalstore;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
        

/**
 *
 * @author Anand
 */
public class dateutil {
   static String getdate(){
    Date  d = new Date();
    String  txtdate=new SimpleDateFormat("dd/MM/yyyy").format(d);
    System.out.println(txtdate);
    return txtdate;
    }
   static String gettime(){
    Date  d = new Date();
    String  txttime=new SimpleDateFormat("hh:mm").format(d);
    System.out.println(txttime);
    return txttime;
    }
    

}