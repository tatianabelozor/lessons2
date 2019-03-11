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
public class NNN {

    public static void main(String[] args) {
        Pattern regex = Pattern.compile("([А-ЯA-Z].{15,}?(\\.|\\!|\\?)(?=\\ |\\r|\\n|$))");
        Matcher m = regex.matcher("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce dapibus tellus nec nulla gravida, sed congue nunc hendrerit. Integer interdum elementum lorem id rutrum. Ut sit amet interdum mauris. Phasellus mollis ex eleifend lacus molestie dictum. Fusce blandit, ligula non condimentum maximus, massa nisi ullamcorper odio, et vehicula nisl nunc nec orci. Sed neque diam, gravida eu blandit ullamcorper, porttitor non lorem. Etiam sagittis diam a dolor feugiat placerat. Suspendisse enim turpis, imperdiet in tellus sit amet, consectetur porta magna. Suspendisse odio nulla, imperdiet eget augue in, pulvinar hendrerit nunc. Aenean ut cursus tellus, nec vehicula ante. Vestibulum ornare erat non ante tempus, eu aliquet felis dapibus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris eget arcu imperdiet, laoreet erat non, imperdiet leo. Sed arcu mi, ornare non leo sed, faucibus semper nunc.");
        while (m.find()) {
            System.out.println(m.group() + " ");
        }
        Pattern reg = Pattern.compile("([4-6][0-9][0-9])");//шаблон для поиска числа в диапазоне с 400 до 699
        Matcher m1 = reg.matcher("545069953201879540051235046877789305054878978103788046993686298777163367791774196548534");
        while (m1.find()) {
            System.out.println(m1.group() + " ");
        }
         
        Pattern regex1 = Pattern.compile("(?<=(^|;)).*?(?=(;|$|\\r\\n))");
        Matcher m2 = regex1.matcher("Etiam sagittis diam; a dolor feugiat placerat. Suspendisse enim turpis, imperdiet in; tellus sit amet, consectetur porta magna. Suspendisse odio; nulla, imperdiet; eget augue in, pulvinar hendrerit nunc. Aenean; ut cursus tellus, nec vehicula ante. Vestibulum ornare erat ");
        while (m2.find()){
        System.out.println(m2.group());
        }
         
        Pattern reg1 = Pattern.compile("([^\\\\]+$)");
        Matcher m3 = reg1.matcher("D:\\java");
         while (m3.find()){
        System.out.println(m3.group());}
        
    }
}
