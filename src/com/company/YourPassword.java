package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YourPassword extends Container {
    public static JLabel mistakeLabel;
    private JButton okButton;
    public YourPassword() {
        setSize(500,400);
        setLayout(null);


        mistakeLabel = new JLabel();
        mistakeLabel.setBounds(185, 100, 200, 40);
        add(mistakeLabel);

        okButton = new JButton("OK");
        okButton.setBounds(210, 150, 100, 30);
        okButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.yourPasswordWindow.setVisible(false);
                Main.frame.Log_in_Window.setVisible(true);
            }
        });
        add(okButton);
    }
}
