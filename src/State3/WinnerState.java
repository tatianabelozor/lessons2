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
public class WinnerState implements State {
    
    GumballMachine gumballMachine;
    
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }
    
    @Override
    public void ejectQuarter() {
        System.out.println("Please wait,we're already giving you a gumball");
    }
    
    @Override
    public void turnCrank() {
        System.out.println("Turning again doesn't get you another gumball");
    }
    
    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops,out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
            
        }
    }
    
    @Override
    public void refill() {
    }
    
    @Override
    public String toString() {
        return "dispensing two gumball for your quarter, because YOU'RE A WINNER!";
    }
}
