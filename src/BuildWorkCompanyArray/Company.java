/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildWorkCompanyArray;

import java.util.List;

/**
 *
 * @author User
 */
public abstract class Company {
    List getEmployees()
    {
        return null;
    };
    void startWorking(List<Employee> employeers)
    {
    for(Employee emp:employeers){
    emp.doWork();
    }
    }
}

