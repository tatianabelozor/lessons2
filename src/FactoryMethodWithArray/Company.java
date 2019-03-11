/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodWithArray;
 
import java.util.List;

/**
 *
 * @author User
 */
public class Company {
    List getEmploees(){
    return null;
    };
    void startWorking(List<Employee> emploeers){
    for(Employee emp:emploeers){
    emp.doWork();
    /*
    emploeers.forEach((emp)->{emp.doWork();})
    */
    }
    }
}
