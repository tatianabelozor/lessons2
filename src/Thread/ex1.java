/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author User
 */
public class ex1 {

    public static void main(String[] args) {
        //выведем название потока
        System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread();//например единственный повар
        //по сути это второй поток, первый был - main

        thread.start();
        //пока только не сказали "повару" что делать.

        //У каждого потока свой Stack и свой "Garbage collector", но heap общий
        System.out.println(thread.getName());
    }
//поток main выполнен и закрывается
}
