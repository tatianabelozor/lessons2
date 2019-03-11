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
public abstract class Company {
     Employee[] getEmployes(){
    return null;
    };
    void startWorking(Employee[]employers){
    for(Employee employee:employers){
    employee.doWork();
    }
    }
}
