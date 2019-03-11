/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartTest;

/**
 *
 * @author User
 */
public class Person {

    private String Name;
    private String LastName;

    public Person(String name, String lastname) {
        this.Name = name;
        this.LastName = lastname;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", LastName=" + LastName + '}';
    }

    void sayHello() {
        System.out.println("Hello from " + Name + " " + LastName);
    }

    void sayBye() {
        System.out.println(Name + " " + LastName + " Bye");
    }

    
}
