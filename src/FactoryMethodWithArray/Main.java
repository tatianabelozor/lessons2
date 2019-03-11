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
public class Main {

    public static void main(String[] args) {
        Company gameCompany = new  GameDevCompany();
        List computerWorkers = gameCompany.getEmploees();
        gameCompany.startWorking(computerWorkers);
    }
}
