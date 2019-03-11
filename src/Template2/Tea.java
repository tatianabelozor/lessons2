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
public class Tea extends BaristaTemplate {

    @Override
    public void Brew(){//boilWater() {
System.out.println("Steeping the tea");
    }
    
    @Override
   // public void pourInCup(){
    public void addIngridients(){
        System.out.println("Adding lemon");
    }
}
