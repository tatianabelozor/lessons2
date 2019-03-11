/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State1;

/**
 *
 * @author user
 */
public class SendingCode implements Activity {

    @Override
    public void justDoIt() {
        System.out.println("Sending code to GitHub");
    }
}
