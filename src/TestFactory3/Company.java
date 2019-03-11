/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory3;

/**
 *
 * @author User
 */
public abstract class Company {
    Employee[] getEmploees(){
    return null;
    }
    void startWorking(Employee[] emploers){
    for (Employee emploer:emploers){
    emploer.doWork();
    }
    }
}
