package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Successfully extends Container {
    private JLabel successfullyLabel;
    private JButton okButton;
    public Successfully() {
        setSize(500,400);
        setLayout(null);

        successfullyLabel = new JLabel("You have successfully registered!");
        successfullyLabel.setBounds(170, 100, 200, 40);
        successfullyLabel.setForeground(Color.green);
        add(successfullyLabel);

        okButton = new JButton("OK");
        okButton.setBounds(210, 150, 100, 30);
        okButton.setForeground(Color.GREEN);
        okButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.successfullyWindow.setVisible(false);
                Main.frame.registrationWindow.setVisible(true);
            }
        });
        add(okButton);
    }
}
