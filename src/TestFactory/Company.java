/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory;

/**
 *
 * @author User
 */
public class Company {
    void createSoftware(){
    System.out.println("Starting company activity");
    Designer designer= new Designer();
    designer.designArchitecture();
    Programmer programmer=new Programmer();
    programmer.programmingCode();
    Tester tester=new Tester();
    tester.TestingCode();
     }
    }
    

