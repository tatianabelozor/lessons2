/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template3;



/**
 *
 * @author user
 */
public class Barista {

    public static void main(String[] args) {
        HotDrink coffee = new Coffee();
        System.out.println("Making coffee: ");
        coffee.prepareRecipe();

        System.out.println("\n");
        HotDrink tea = new Tea();
        System.out.println("Making tea: ");
        tea.prepareRecipe();
    }

}
