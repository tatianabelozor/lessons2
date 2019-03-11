/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

/**
 *
 * @author User
 */
public class Task {

    public static void main(String[] args) {
        Developer developer1=new PhpDeveloper();
        System.out.println(developer1.makeJob());
        
        Developer developer2 = new TesterPHPDeveloper(new PhpDeveloper());
        System.out.println(developer2.makeJob());

        Developer developer3 = new ManagerPHPDeveloper(new PhpDeveloper());
        System.out.println(developer3.makeJob());
        
        Developer developer4=new SupportPhpDeveloper(new PhpDeveloper());
        System.out.println(developer4.makeJob());
    }

}
