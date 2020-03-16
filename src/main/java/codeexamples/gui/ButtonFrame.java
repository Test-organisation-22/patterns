package codeexamples.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {

    private final JButton jButton1;
    private final JButton jButton2;

    public ButtonFrame(){
        super("Testing buttons");
        setLayout(new FlowLayout());

        jButton1 = new JButton("Button 1");
        add(jButton1);


        jButton2 = new JButton("Button 2");
        add(jButton2);

        ButtonHandler handler = new ButtonHandler();
        jButton2.addActionListener(handler);
        jButton1.addActionListener(handler);

    }

    private class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", actionEvent.getActionCommand()));
        }
    }



}
