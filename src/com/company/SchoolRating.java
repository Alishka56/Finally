package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SchoolRating extends Container {
    public static JTextArea textArea;
    private JButton buttonList;
    private JButton buttonBack;

    public SchoolRating() {
        setSize(500, 450);
        setLayout(null);

        textArea = new JTextArea();
        textArea.setBounds(50, 10, 400, 300);
        add(textArea);

        buttonList = new JButton("SCHOOL RATING");
        buttonList.setBounds(90, 320, 145, 30);
        buttonList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "Raiting school 1: 9.7" + "\n" + "Raiting school 2: 7.8" + "\n" + "Raiting school 3: 6.3" ;
                textArea.setText(s);
            }
        });
        add(buttonList);

        buttonBack = new JButton("BACK");
        buttonBack.setBounds(245, 320, 145, 30);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.loginWindow.setVisible(true);
                Main.frame.schoolRatingWindow.setVisible(false);
            }
        });
        add(buttonBack);
    }
}
