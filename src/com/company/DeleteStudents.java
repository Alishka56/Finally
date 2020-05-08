package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteStudents extends Container {
    public static JTextArea textArea;
    private JButton buttonList;
    private JButton buttonBack;

    public DeleteStudents() {
        setSize(500, 450);
        setLayout(null);

        textArea = new JTextArea();
        textArea.setBounds(10, 10, 400, 300);
        add(textArea);

        buttonList = new JButton("LIST STUDENT");
        buttonList.setBounds(10, 320, 140, 30);
        buttonList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    PackageData packageData = new PackageData("LIST");
                    Main.connect(packageData);
                }
        });
        add(buttonList);

        buttonList = new JButton("DELETE STUDENT");
        buttonList.setBounds(160, 320, 140, 30);
        buttonList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PackageData packageData = new PackageData("DELETE");
                Main.connect(packageData);
            }
        });
        add(buttonList);

        buttonBack = new JButton("BACK");
        buttonBack.setBounds(310, 320, 145, 30);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                Main.frame.loginWindow.setVisible(true);
                Main.frame.deleteStudentsWindow.setVisible(false);
            }
        });
        add(buttonBack);
    }
}
