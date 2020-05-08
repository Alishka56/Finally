package com.company;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Registration extends Container {
    private JLabel loginLabel;
    private JLabel passwordLabel;
    private JLabel passwordAgainLabel;
    private JLabel nameLabel;
    private JLabel surNameLabel;
    private JLabel schoolLabel;

    private JTextField loginText;
    private JPasswordField passwordText;
    private JPasswordField passwordAgainText;
    private JTextField nameText;
    private JTextField surNameText;
    private String[] id = {"1" , "2" , "3", "4" , "5" , "6" , "7" , "8" , "9" , "10" , "11" , "12" , "13" , "14" , "15" , "16" , "17" , "18" ,"19" , "20" , "21" , "22" , "23", "24" , "25" , "26" , "27" , "28" , "29" , "30"};
    private JComboBox idBox;

    private JButton registrationButton;
    private JButton backButton;

    public Registration() {
        setSize(500,450);
        setLayout(null);

        loginLabel = new JLabel("LOGIN: ");
        loginLabel.setBounds(70, 40, 60, 30);
        add(loginLabel);

        loginText = new JTextField();
        loginText.setBounds(205, 40, 150, 30);
        add(loginText);

        passwordLabel = new JLabel("PASSWORD: ");
        passwordLabel.setBounds(70, 80, 100, 30);
        add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(205, 80, 150, 30);
        add(passwordText);

        passwordAgainLabel = new JLabel("REPEAT PASSWORD: ");
        passwordAgainLabel.setBounds(70, 120, 130, 30);
        add(passwordAgainLabel);

        passwordAgainText = new JPasswordField();
        passwordAgainText.setBounds(205, 120, 150, 30);
        add(passwordAgainText);

        nameLabel = new JLabel("NAME: ");
        nameLabel.setBounds(70, 160, 60, 30);
        add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(205, 160, 150, 30);
        add(nameText);

        surNameLabel = new JLabel("SURNAME: ");
        surNameLabel.setBounds(70, 200, 90, 30);
        add(surNameLabel);

        surNameText = new JTextField();
        surNameText.setBounds(205, 200, 150, 30);
        add(surNameText);

        schoolLabel = new JLabel("ID: ");
        schoolLabel.setBounds(70, 240, 60, 30);
        add(schoolLabel);

        idBox = new JComboBox(id);
        idBox.setBounds(205, 240, 150, 30);
        add(idBox);

        registrationButton = new JButton("REGISTRATION");
        registrationButton.setBounds(130, 280, 210, 30);
        registrationButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String name = nameText.getText();
                String surname = surNameText.getText();
                String id = (String)idBox.getSelectedItem();
                String password = passwordText.getText();
                String passwordAgain = passwordAgainText.getText();
                String login = loginText.getText();

                boolean check = true;
                boolean checkText = true;
                for(int i=0;i<Main.students.length;i++){
                    if(Main.students[i]==null){
                        break;
                    }
                    if(login.equalsIgnoreCase(Main.students[i].getLogin())){
                        check = false;
                        // Такой логин уже есть
                        String s="This login is already there. Choose another login";
                        checkText=false;
                        loginText.setForeground(Color.RED);
                        Main.frame.mistakeWindow.setVisible(true);
                        Main.frame.registrationWindow.setVisible(false);
                        break;
                    }
                }
                if(check) {
                    if (password.equalsIgnoreCase(passwordAgain)) {
                        ArrayList<Student> st;
                        st = Main.getUserList();
                        int k = -1;
                        for (int i = 0; i < st.size(); i++) {
                            if (st.get(i).getName().equalsIgnoreCase(name) && st.get(i).getSurname().equalsIgnoreCase(surname) && st.get(i).getId() == Integer.parseInt(id)) {
                                k = i;
                                break;
                            }
                        }
                        if (k == -1) {
                            System.out.println("such a student does not attend school of magic or the student is already registered!");
                            checkText=false;
                            Main.frame.mistakeWindow.setVisible(true);
                            Main.frame.registrationWindow.setVisible(false);
                        } else {
                            Student student = new Student(null, st.get(k).getName(), st.get(k).getSurname(), st.get(k).getCourse(), st.get(k).getGroup(), st.get(k).getSchool(), st.get(k).getTypeMagic(), login, password);
                            Main.addStudent(student);
                            st.remove(k);
                            Main.saveUserList(st);
                            PackageData packageData = new PackageData("REGISTRATION", student);
                            Main.connect(packageData);
                        }
                    } else {
                        System.out.println("You did not enter the password again is not correct");
                        passwordAgainLabel.setForeground(Color.RED);
                        passwordAgainText.setText("");
                    }
                }
                else{
                    System.out.println("This login is already there. Choose another login");
                    checkText=false;
                    loginText.setForeground(Color.RED);
                    Main.frame.mistakeWindow.setVisible(true);
                    Main.frame.registrationWindow.setVisible(false);
                }
                if(checkText) {
                    nameText.setText("");
                    surNameText.setText("");
                    loginText.setText("");
                    passwordText.setText("");
                    passwordAgainText.setText("");
                    Main.frame.successfullyWindow.setVisible(true);
                    Main.frame.registrationWindow.setVisible(false);
                }
            }
        });
        add(registrationButton);

        backButton = new JButton("BACK");
        backButton.setBounds(130, 320, 210, 30);
        backButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.menuWindow.setVisible(true);
                Main.frame.registrationWindow.setVisible(false);
            }
        });
        add(backButton);
    }
}
