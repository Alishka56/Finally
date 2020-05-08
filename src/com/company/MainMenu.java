package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends Container {
    private JButton LoginButton;
    private JButton registrationButton;
    private JButton exitButton;

    public MainMenu() {
        setSize(500,450);
        setLayout(null);

        LoginButton = new JButton("LOG IN");
        LoginButton.setBounds(100, 100, 300, 30);
        LoginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.menuWindow.setVisible(false);
                Main.frame.Log_in_Window.setVisible(true);
            }
        });
        add(LoginButton);

        registrationButton = new JButton("REGISTRATION");
        registrationButton.setBounds(100, 140, 300, 30);
        registrationButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.menuWindow.setVisible(false);
                Main.frame.registrationWindow.setVisible(true);
            }
        });
        add(registrationButton);

        exitButton = new JButton("EXIT");
        exitButton.setBounds(100, 180, 300, 30);
        exitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        add(exitButton);
    }
}
