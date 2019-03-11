/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JobVacation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class JavaDevelopersJobsSite implements Observed {

    List<String> vacations = new ArrayList<>();
    List<Observer> subscribes = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacations.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacations.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribes.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribes) {
            observer.HandleEvent(this.vacations);
        }
    }
}
