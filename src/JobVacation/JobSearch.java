/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JobVacation;

/**
 *
 * @author User
 */
public class JobSearch {
    
    public static void main(String[] args) {
        JavaDevelopersJobsSite jobSite = new JavaDevelopersJobsSite();
        
        Observer firstSubscriber = new Subscriber("Jelena Petrova");
        Observer secondSubscriber = new Subscriber("Tim Hex");
        Observer thirdSubscriber = new Subscriber("Aaron Gimp");
        Observer fourthSubscriber = new Subscriber("Natalja Ivanova");
        
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addObserver(thirdSubscriber);
        jobSite.addObserver(fourthSubscriber);
        
        jobSite.addVacancy("Java developer in Tallinn");
        jobSite.addVacancy("Java developer in Helsinki");
        jobSite.addVacancy("Java developer in Riga");
        jobSite.addVacancy("Java developer in Berlin");
        
        jobSite.removeVacancy("Java developer in Helsinki");
    }
}
