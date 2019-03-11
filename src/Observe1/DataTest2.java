/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observe1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class DataTest2 {
    JFrame frame;
    
    public void go(){
    frame=new JFrame();
    JButton button=new JButton("Я нажму на эту кнопку?!");
    button.addActionListener(event->System.out.println("Не делай этого!"));
    frame.getContentPane().add(BorderLayout.CENTER,button);
     frame.getContentPane().add(BorderLayout.CENTER,button);
    frame.setSize(400, 400);
    frame.setVisible(true);
    }
   
}
