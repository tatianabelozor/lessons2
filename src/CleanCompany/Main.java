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
public class Main {
    public static void main(String[] args) {
        Company cleanCompany=new CleanWorkCompany();
       Employee[]workers=cleanCompany.getEmployes();
        cleanCompany.startWorking(workers);
    }
   
}
