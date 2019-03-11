/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Example2 {
    
    private Pattern pattern1;
    private Matcher matcher;
    
    private static final String PASSWORD_PATTERN="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,15})";
    
    public Example2(){
    pattern1=Pattern.compile(PASSWORD_PATTERN);
    }
    
   boolean checkPassword (String pass){
       
       matcher=pattern1.matcher(pass);
       return matcher.matches();
          
   }
    
    public static void main(String[] args) {
 
        Example2 p=new Example2();
        
       System.out.println(p.checkPassword("gj[FuewA2g"));
        
    }
    
}
