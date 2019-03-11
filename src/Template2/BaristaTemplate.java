/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template2;

/**
 *
 * @author user
 */
public abstract class BaristaTemplate {

    public void prepareRecipe() {
        System.out.println("Boiling water");
        //  boilWater();
        Brew();
        System.out.println("Pouring into cup");
        addIngridients();
        //pourInCup();
        //  addSugarAndMilk();
        //steepTeaBag();

    }

    public abstract void Brew();//boilWater();

    public abstract void addIngridients(); //pourInCup();
    
    

}
