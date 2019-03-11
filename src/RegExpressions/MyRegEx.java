/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class MyRegEx {

    private static Matcher matcher;
    private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,15})";
    private static Pattern patternPass = Pattern.compile(PASSWORD_PATTERN);

    private static Matcher matcherEmail;
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
    private static Pattern patternEmail = Pattern.compile(EMAIL_PATTERN);

    private static Matcher matcherIp;
    private static final String IP_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\$";
    private static Pattern patternIP = Pattern.compile(IP_PATTERN);

    public static boolean checkPass(String str) {

        matcher = patternPass.matcher(str);

        return matcher.matches();
    }

    public static boolean checkEmail(String str) {
        matcherEmail = patternEmail.matcher(str);
        return matcherEmail.matches();
    }

    public static boolean checkIP(String str) {
        matcherIp = patternIP.matcher(str);
        return matcherIp.matches();
    }
}
