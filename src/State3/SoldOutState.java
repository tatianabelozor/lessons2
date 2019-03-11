/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State3;

/**
 *
 * @author user
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;
    
    public SoldOutState (GumballMachine gumballMachine){
    this.gumballMachine=gumballMachine;
    }
}
