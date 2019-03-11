/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CleanCompany;

/**
 *
 * @author User
 */
public class CleanWorkCompany extends Company {
    @Override
    Employee[] getEmployes(){
    System.out.println("Start work " + CleanWorkCompany.class.getSimpleName()+ "\n");
   Employee[] employee = new Employee[2];
   employee[0]=new Cleaner();
   employee[1]=new Manager();
   return employee;
    }
}
