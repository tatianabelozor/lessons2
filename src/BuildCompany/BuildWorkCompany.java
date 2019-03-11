/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildCompany;

/**
 *
 * @author User
 */
public class BuildWorkCompany extends Company {

    @Override
    Employee[] getEmployes() {
        {
            System.out.println("Start to build house " + BuildWorkCompany.class.getSimpleName() + "\n");
            Employee[] employee = new Employee[4];
            employee[0] = new Builder();
            employee[1] = new Electrician();
            employee[2] = new Foreman();
            employee[3] = new Director();

            return employee;
        }
    }
}
