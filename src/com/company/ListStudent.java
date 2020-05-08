package com.company;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class ListStudent extends Container {
    public static JTextArea textArea;
    private JButton buttonList;
    private JButton buttonBack;

    public ListStudent() {
        setSize(500, 450);
        setLayout(null);

        textArea = new JTextArea();
        textArea.setBounds(50, 10, 400, 300);
        add(textArea);

        buttonList = new JButton("LIST STUDENT");
        buttonList.setBounds(90, 320, 145, 30);
        buttonList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "";
                textArea.setText("");
                if(Main.checks){
                     PackageData packageData = new PackageData("LIST");
                     Main.connect(packageData);
                }
                else{
                    for (int j=0;j<Main.students.length;j++){
                        if(Main.students[j]==null){
                            break;
                        }
                        if(Main.students[j].getSchool().equalsIgnoreCase(Main.students[Main.n].getSchool())){
                            s+=Main.students[j] + "\n";
                        }
                    }
                    textArea.setText(s);
                }
            }
        });
        add(buttonList);

        buttonBack = new JButton("BACK");
        buttonBack.setBounds(245, 320, 145, 30);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                Main.frame.loginWindow.setVisible(true);
                Main.frame.listStudentWindow.setVisible(false);
            }
        });
        add(buttonBack);
    }
}
