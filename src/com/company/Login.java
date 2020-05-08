package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends Container{
    private JButton ListStudentButton;
    private JButton schoolRatingButton;
    private JButton magicListButton;
    private JButton weaponsListButton;

    private JButton LogoutButton;

    private JButton deleteStudentButton;
    /*
    private JLabel nameLabel;
    private JButton[] profile;
    private JComboBox profileBox;
    */
    public Login() {
        setSize(500,450);
        setLayout(null);

        deleteStudentButton = new JButton("DELETE STUDENT");
        deleteStudentButton.setBounds(100, 60, 300, 30);
        deleteStudentButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.loginWindow.setVisible(false);
                Main.frame.deleteStudentsWindow.setVisible(true);
            }
        });
        add(deleteStudentButton);

        ListStudentButton = new JButton("LIST STUDENT");
        ListStudentButton.setBounds(100, 100, 300, 30);
        ListStudentButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.loginWindow.setVisible(false);
                Main.frame.listStudentWindow.setVisible(true);
            }
        });
        add(ListStudentButton);

        schoolRatingButton = new JButton("SCHOOL RATING");
        schoolRatingButton.setBounds(100, 140, 300, 30);
        schoolRatingButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.loginWindow.setVisible(false);
                Main.frame.schoolRatingWindow.setVisible(true);
            }
        });
        add(schoolRatingButton);

        magicListButton = new JButton("LIST MAGIC");
        magicListButton.setBounds(100, 180, 300, 30);
        magicListButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.loginWindow.setVisible(false);
                Main.frame.magicListWindow.setVisible(true);
            }
        });
        add(magicListButton);

        weaponsListButton = new JButton("LIST WEAPONS");
        weaponsListButton.setBounds(100, 220, 300, 30);
        weaponsListButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.loginWindow.setVisible(false);
                Main.frame.weaponsListWindow.setVisible(true);
            }
        });
        add(weaponsListButton);

        LogoutButton = new JButton("LOG OUT");
        LogoutButton.setBounds(100, 260, 300, 30);
        LogoutButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(Main.checks){
                    Main.checks=false;
                }
                Main.frame.menuWindow.setVisible(true);
                Main.frame.loginWindow.setVisible(false);
            }
        });
        add(LogoutButton);
    }
}
