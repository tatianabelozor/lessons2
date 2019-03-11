/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JobVacation;

import java.util.List;

/**
 *
 * @author User
 */
public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void HandleEvent(List<String> vacations) {
        System.out.println("Dear " + name + "\nWe have some changes in vacations" + vacations + "\n===============================\n");
    }
}
