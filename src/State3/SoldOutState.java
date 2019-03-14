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
    
    @Override
    public void insertQuarter(){
        System.out.println("You cant't insert a quarter, the machine is sold out");
    }
    @Override 
    public void ejectQuartet(){
        System.out.println("You cant't eject, you haven't inserted a quarter yet");
    }
    @Override
    public void dispense(){
        System.out.println("No gumball dispensed");
    }
    @Override
    public void refill(){
    gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    @Override
    public String toString(){
    return "Sold out";
    }
}
