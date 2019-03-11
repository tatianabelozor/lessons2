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
public class Main {
    public static void main(String[] args) {
        Company buildCompany= new BuildWorkCompany();
        Employee[] workers=buildCompany.getEmployes();
        buildCompany.startWorking(workers);
    }
}
