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
public class TestClass {

    public static void main(String[] args) {
        //как создать экземпляр нащего класса
        MyObject o = new MyObject();
        //создать еще один экземпляр
        MyObject o2 = new MyObject();

        //можно сколько угодно создавать объектов
        //создать экземпляр закрытого класса
        //MyObjectClosed0 o3 = new MyObjectClosed0();
     /*   MyObjectClosed1 o4 = new MyObjectClosed1.getInstance();
        MyObjectClosed1 o5 = new MyObjectClosed1.getInstance();*/

        Singletone s1 = Singletone.getInstance();
        Singletone s2 = Singletone.getInstance();//пытаемся создать второй экземпляр
    }
}
