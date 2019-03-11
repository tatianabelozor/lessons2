/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildWorkCompanyArray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class BuildWorkCompany extends Company {
    @Override
    List getEmployees(){
    System.out.println("Start to build house " + BuildWorkCompany.class.getSimpleName() + "\n");
    List employee =new ArrayList();
    employee.add(new Builder());
    employee.add(new Director());
    employee.add(new Electrician());
    employee.add(new Foreman());
   
    return employee;
    }
    
}
