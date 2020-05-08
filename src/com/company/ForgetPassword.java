package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ForgetPassword extends Container {
    private JLabel loginLabel;
    private JLabel courseLabel;
    private JLabel groupsLabel;
    private JLabel nameLabel;
    private JLabel surNameLabel;
    private JLabel schoolLabel;

    public static JTextField loginText;
    private JTextField courseText;
    private JTextField groupsText;
    private JTextField nameText;
    private JTextField surNameText;
    private String[] school = {"1_school","2_school","3_school"};
    private JComboBox schoolBox;

    private JButton registrationButton;
    private JButton backButton;

    public ForgetPassword() {
        setSize(500,450);
        setLayout(null);

        loginLabel = new JLabel("LOGIN: ");
        loginLabel.setBounds(70, 40, 60, 30);
        add(loginLabel);

        loginText = new JTextField();
        loginText.setBounds(205, 40, 150, 30);
        add(loginText);

        courseLabel = new JLabel("COURSE: ");
        courseLabel.setBounds(70, 80, 100, 30);
        add(courseLabel);

        courseText = new JTextField();
        courseText.setBounds(205, 80, 150, 30);
        add(courseText);

        groupsLabel = new JLabel("GROUP: ");
        groupsLabel.setBounds(70, 120, 130, 30);
        add(groupsLabel);

        groupsText = new JTextField();
        groupsText.setBounds(205, 120, 150, 30);
        add(groupsText);

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

        schoolLabel = new JLabel("SCHOOL: ");
        schoolLabel.setBounds(70, 240, 60, 30);
        add(schoolLabel);

        schoolBox = new JComboBox(school);
        schoolBox.setBounds(205, 240, 150, 30);
        add(schoolBox);

        registrationButton = new JButton("SEND");
        registrationButton.setBounds(130, 280, 210, 30);
        registrationButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String name = nameText.getText();
                String surname = surNameText.getText();
                String course = courseText.getText();
                String groups = groupsText.getText();
                String login = loginText.getText();
                String school = (String)schoolBox.getSelectedItem();

                boolean checks = false;
                for(int i=0;i<Main.students.length;i++){
                    if(Main.students[i]==null){
                        break;
                    }
                    if(login.equalsIgnoreCase(Main.students[i].getLogin()) && name.equalsIgnoreCase(Main.students[i].getName()) &&
                            surname.equalsIgnoreCase(Main.students[i].getSurname()) && course.equalsIgnoreCase(Main.students[i].getCourse()) &&
                            groups.equalsIgnoreCase(Main.students[i].getGroup()) && school.equalsIgnoreCase(Main.students[i].getSchool())){
                        PackageData packageData = new PackageData("PASSWORD");
                        Main.connect(packageData);
                        checks=true;
                        break;
                    }
                }
                if(checks){
                    Main.frame.yourPasswordWindow.setVisible(true);
                    Main.frame.forgetPasswordWindow.setVisible(false);
                }
                nameText.setText("");
                surNameText.setText("");
                loginText.setText("");
                courseText.setText("");
                groupsText.setText("");
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
