/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User
 */
public class Test2 {

    public static void main(String[] args) {
        
        System.out.println("---------Collection List---------");
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sergei", "Petrov"));
        persons.add(new Person("Alexei", "Smirnov"));
        persons.add(new Person("Petr", "Green"));

        for (Person person : persons) {
            person.sayHello();
            person.sayBye();
        }

        System.out.println("-------Collection Map-------------");
        Map<Integer, Person> persons2 = new HashMap<>();
        persons2.put(1562248, new Person("Sergei", "Petrov"));
        persons2.put(5132313, new Person("Alexei", "Smirnov"));
        persons2.put(4687788, new Person("Petr", "Green"));

        for (Map.Entry<Integer, Person> entry : persons2.entrySet()) {
            entry.getValue().sayHello();
            entry.getValue().sayBye();

        }
    }
}
