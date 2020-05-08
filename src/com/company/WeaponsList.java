package com.company;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class WeaponsList extends Container {
    public static JTextArea textArea;
    private JButton buttonList;
    private JButton buttonBack;

    public WeaponsList() {
        setSize(500,450);
        setLayout(null);

            textArea = new JTextArea();
            textArea.setBounds(50, 10, 400, 300);
            add(textArea);

            buttonList = new JButton("LIST WEAPONS");
            buttonList.setBounds(90, 320, 145, 30);
            buttonList.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   Weapons weapons = new Weapons();
                    ArrayList<WeaponTypes> wt=Main.getWeaponsList();
                   for(int i=0;i<wt.size();i++){
                       weapons.addWeapon(wt.get(i));
                   }
                   String s="";
                   s+=weapons.printWeaponss();
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
                Main.frame.weaponsListWindow.setVisible(false);
            }
        });
        add(buttonBack);
    }
}
