package com.company;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class LOG_IN extends Container {
    private JLabel loginLabel;
    private JLabel passwordLabel;

    private JTextField loginText;
    private JPasswordField passwordText;

    private JButton LOG_IN_Button;
    private JButton forgetPasswordButton;
    private JButton backButton;

    public LOG_IN() {
        setSize(500,450);
        setLayout(null);

        loginLabel = new JLabel("LOGIN: ");
        loginLabel.setBounds(100, 70, 60, 30);
        loginLabel.setForeground(Color.ORANGE);
        add(loginLabel);

        loginText = new JTextField();
        loginText.setBounds(205, 70, 150, 30);
        loginText.setForeground(Color.GREEN);
        add(loginText);

        passwordLabel = new JLabel("PASSWORD: ");
        passwordLabel.setBounds(100, 110, 100, 30);
        passwordLabel.setForeground(Color.ORANGE);
        add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(205, 110, 150, 30);
        passwordText.setForeground(Color.GREEN);
        add(passwordText);

        LOG_IN_Button = new JButton("LOG IN");
        LOG_IN_Button.setBounds(100, 150, 300, 30);
        LOG_IN_Button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                // PackageData packageData = new PackageData("LOG_IN");
                // Main.connect(packageData);
                String login = loginText.getText();
                String password = passwordText.getText();
                boolean check = true;
                boolean checkText = true;
                ArrayList<Instructor> it=Main.getInstructorList();
                for(int i=0;i<it.size();i++){
                    if(login.equalsIgnoreCase(it.get(i).getLogin()) && password.equalsIgnoreCase(it.get(i).getPassword())){
                        Main.checks=true;
                        Main.frame.Log_in_Window.setVisible(false);
                        Main.frame.loginWindow.setVisible(true);
                    }
                }
                if(!Main.checks) {
                    for (int i = 0; i < Main.students.length; i++) {
                        if (Main.students[i] == null) {
                            break;
                        }
                        if (Main.students[i].getLogin().equalsIgnoreCase(login) && Main.students[i].getPassword().equalsIgnoreCase(password)) {
                            Main.frame.Log_in_Window.setVisible(false);
                            Main.frame.loginWindow.setVisible(true);
                            Main.n = i;
                          //  System.out.println(Main.n);
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        System.out.println("INCORECT PASSWORD OR LOGIN !");
                       // loginText.setForeground(Color.RED);
                    }
                }
                loginText.setText("");
                passwordText.setText("");
            }
        });
        add(LOG_IN_Button);

        forgetPasswordButton = new JButton("FORGET PASSWORD");
        forgetPasswordButton.setBounds(100, 190, 300, 30);
        forgetPasswordButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.Log_in_Window.setVisible(false);
                Main.frame.forgetPasswordWindow.setVisible(true);
            }
        });
        add(forgetPasswordButton);

        backButton = new JButton("BACK");
        backButton.setBounds(100, 230, 300, 30);
        backButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.menuWindow.setVisible(true);
                Main.frame.Log_in_Window.setVisible(false);
            }
        });
        add(backButton);
    }
}
