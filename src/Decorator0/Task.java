/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator0;

import Decorator1.TesterPHPDeveloper;
import Decorator1.ManagerPHPDeveloper;

/**
 *
 * @author User
 */
public class Task {

    public static void main(String[] args) {
        Developer developer = new PhpDeveloper();
        System.out.println(developer.makeJob());  

    }
}
