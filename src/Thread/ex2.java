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
public class ex2 {

    static class Recipe implements Runnable {

        @Override
        public void run() {
            System.err.println("...готовим по рецепту...");
        }
    }
    public static void main(String[] args) {
        Thread thread=new Thread(new Recipe());
        thread.start();//стартует новый поток и выполняется все из метода run(написан на С)
        
        thread.setName("Cook");
        System.err.println(thread.getName());
        System.err.println(Thread.currentThread().getName());
        //какой-то поток может раньше вызвать свой метод (если несколько раз запустить)...так как два "Повара"
    }
}
