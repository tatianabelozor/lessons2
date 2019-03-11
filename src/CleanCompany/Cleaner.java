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
public class Cleaner implements Employee{
    @Override
    public void doWork(){
    for(int i=0;i<3;i++)
    {
        System.out.println("Cleaner: Cleaning");
    }
    }
    
}
