package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MagicList extends Container {
    public static JTextArea textArea;
    private JButton buttonList;
    private JButton buttonBack;

    public MagicList() {
        setSize(500, 450);
        setLayout(null);

        textArea = new JTextArea();
        textArea.setBounds(50, 10, 400, 300);
        add(textArea);

        buttonList = new JButton("LIST MAGIC");
        buttonList.setBounds(90, 320, 145, 30);
        buttonList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "";

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
                Main.frame.magicListWindow.setVisible(false);
            }
        });
        add(buttonBack);
    }
}
