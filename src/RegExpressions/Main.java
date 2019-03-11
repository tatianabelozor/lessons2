/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) throws IOException {
               
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your IP");
        String st=br.readLine();
        boolean result2=MyRegEx.checkIP(st);
        if (result2==true)
        {
        System.out.println("IP is correct");
        }
        else {
        System.out.println("IP not correct");
        }
        
        System.out.println("Enter your E-mail");
        String strg = br.readLine();

        boolean result1 = MyRegEx.checkEmail(strg);
        if (result1 == true) {
            System.out.println("E-mail is correct");
        } else {
//            System.out.println("Not correct!");
        }
        
        System.out.println("Enter new password");
        String str = br.readLine();
        boolean result = MyRegEx.checkPass(str);

        while (!result) {
            System.out.println("Password is not correct");
            System.out.println("Enter new password");
            str = br.readLine();
            result = MyRegEx.checkPass(str);
        }
        System.out.println("OK!");
    }
}
