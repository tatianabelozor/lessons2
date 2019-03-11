/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton1;

/**
 *
 * @author User
 */
public class Controller1 {
    public static void main(String[] args) {
        Boiler1 b1=Boiler1.getInstance();
        b1.boil();
        Boiler1 b2=Boiler1.getInstance();
    }
}
