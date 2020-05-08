package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Error1 extends Container {
    private JLabel mistakeLabel;
    private JButton okButton;
    public Error1() {
        setSize(500,400);
        setLayout(null);

        mistakeLabel = new JLabel("You entered an incorrect data");
        mistakeLabel.setBounds(170, 100, 200, 40);
       // mistakeLabel.setPreferredSize(new Dimension(250,100));
        mistakeLabel.setForeground(Color.red);
        add(mistakeLabel);

        okButton = new JButton("OK");
        okButton.setBounds(210, 150, 100, 30);
        okButton.setForeground(Color.RED);
        okButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.mistakeWindow.setVisible(false);
                Main.frame.registrationWindow.setVisible(true);
            }
        });
        add(okButton);
    }
}
