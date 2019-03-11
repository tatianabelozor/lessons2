/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton0;

/**
 *
 * @author User
 */
public class Singletone {

    //переменная для хранения единственного экземпляра этого класса
    public static Singletone uniqueInstance;

    //приватный конструктор(означает, что тольок этот класс может создавать экземпляры этого класса)
    private Singletone() {

    }

    //отложенное создание объекта(только, если действительно нужно). В отличии от глобальной переменной
    public static Singletone getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singletone();
            System.out.println("The new instance of Singletone");
        }
        System.out.println("Returning instance...");
        return uniqueInstance;
    }
}
