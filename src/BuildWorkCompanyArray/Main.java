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
public class Main {
    public static void main(String[] args) {
        Company buildCompany=new BuildWorkCompany();
        List buildWorkers= buildCompany.getEmployees();
        buildCompany.startWorking(buildWorkers);
    }
         
}
