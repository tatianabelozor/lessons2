/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC1.view;

import java.awt.event.ActionListener;
import MVC1.model.Model;
import MVC1.controller.Controller;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author user
 */
public class SwingView implements ActionListener, View {

    private JFrame frame;
    private JList<String> list;
    private JButton add;
    private JButton remove;
    private JTextField field;
    private Controller controller;

    public SwingView() {
        initComponents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            controller.removeAction(field.getText());
        } else if (e.getSource() == remove) {
            controller.removeAction(list.getSelectedValue());
            list.clearSelection();
        }
    }

    @Override
    public void dispose() {
        frame.dispose();
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void setModel(Model model) {
        list.setModel(new ModelWrapper(model));
    }
}
