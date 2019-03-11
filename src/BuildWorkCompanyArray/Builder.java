/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildWorkCompanyArray;

/**
 *
 * @author User
 */
public class Builder implements Employee{
    @Override
    public void doWork(){
   for(int i=1;i<=10;i++){
        System.out.println(i+" "+"Builder:  I'm do all work!");
        }
    }
    
}
