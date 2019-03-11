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
public class Boiler1 {

    public static Boiler1 uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private Boiler1() {
        empty = true;
        boiled = false;
    }

    public static Boiler1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Boiler1();
            System.out.println("The new instance of Boiler");
        }
        System.out.println("Returning instance...");
        return uniqueInstance;
    }

    public void fill() {
        //перед наполнением проверяем, что нагреватель пустой и меняем затем его значение
        if (isEmpty()) {
            empty = false;
            boiled = false;
            //заполняем его водой
            System.out.println("Boiler is filled");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            //перед тем как налить проверяем, что нагреватель не пустой и доведен до кипения. 
            //заетм снова меняем флаг на "пустой"
            //налить воду
            empty = true;
            System.out.println("Boiler is empty");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //проверяем вначале, что нагреватель не пустой и вода не доведена до кипения

            //доводим до кипения содержимое...
            boiled = true;
            System.out.println("boiling...");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
