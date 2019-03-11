/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author user
 */
public class DeveloperRunner {

    public static void main(String[] args) {
        String[] javaSkills = {"Java basic", "Spring", "Hibernate", "Maven", "PosgreSQL",
            "Docker"};
        String[] phpSkills = {"Java basic", "Spring", "Hibernate", "Maven", "PosgreSQL",
            "Docker"};
        Developer javaDeveloper = new Developer("Nikolai Smirnov", javaSkills);
        Developer phpDeveloper = new Developer("Ivan Ivanov", phpSkills);

        Iterator iterator = javaDeveloper.getIterator();
        Iterator iterator2 = phpDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");

        }
        System.out.println("\n==============\n");

        System.out.println("Developer: " + phpDeveloper.getName());
        System.out.print("Skills: ");
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next().toString() + " ");

        }
    }
}

