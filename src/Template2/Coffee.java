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
public class Coffee extends BaristaTemplate {

    @Override
  //  public void boilWater()
    public  void Brew(){
        System.out.println("Dripping Coffee through filter");
          }
    @Override
    public void addIngridients(){
    System.out.println("Adding Sugar and Milk");
    }

}
