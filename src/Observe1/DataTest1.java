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
public class DataTest1 {
    JFrame frame;
    
    public void go(){
    
   frame=new JFrame(); 
    JButton button=new JButton("Можно я нажму эту кнопку?!");
    button.addActionListener(new FirstListener());
    button.addActionListener(new SecondListener());
    frame.getContentPane().add(BorderLayout.CENTER,button);
    
     
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(BorderLayout.CENTER,button);
    frame.setSize(400, 400);
    frame.setVisible(true);}
}
