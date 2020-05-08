package com.company;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu menuWindow;
    public static Registration registrationWindow;
    public static LOG_IN Log_in_Window;
    public static Login loginWindow;
    public static WeaponsList weaponsListWindow;
    public static MagicList magicListWindow;
    public static ListStudent listStudentWindow;
    public static SchoolRating schoolRatingWindow;
    public static ForgetPassword forgetPasswordWindow;
    public static Error1 mistakeWindow;
    public static Successfully successfullyWindow;
    public static YourPassword yourPasswordWindow;
    public static DeleteStudents deleteStudentsWindow;
    public static LoginInstructor loginInstructorWindow;

    public MainFrame() {
        setSize(500,400);
        setTitle("Online diary for mage students");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuWindow = new MainMenu();
        menuWindow.setLocation(0, 0);
        add(menuWindow);

        registrationWindow = new Registration();
        registrationWindow.setLocation(0, 0);
        registrationWindow.setVisible(false);
        add(registrationWindow);

        Log_in_Window = new LOG_IN();
        Log_in_Window.setLocation(0, 0);
        Log_in_Window.setVisible(false);
        add(Log_in_Window);

        loginWindow = new Login();
        loginWindow.setLocation(0, 0);
        loginWindow.setVisible(false);
        add(loginWindow);

        weaponsListWindow = new WeaponsList();
        weaponsListWindow.setLocation(0, 0);
        weaponsListWindow.setVisible(false);
        add(weaponsListWindow);

        magicListWindow = new MagicList();
        magicListWindow.setLocation(0, 0);
        magicListWindow.setVisible(false);
        add(magicListWindow);

        listStudentWindow = new ListStudent();
        listStudentWindow.setLocation(0, 0);
        listStudentWindow.setVisible(false);
        add(listStudentWindow);

        schoolRatingWindow = new SchoolRating();
        schoolRatingWindow.setLocation(0, 0);
        schoolRatingWindow.setVisible(false);
        add(schoolRatingWindow);

        mistakeWindow = new Error1();
        mistakeWindow.setLocation(0, 0);
        mistakeWindow.setVisible(false);
        add(mistakeWindow);

        successfullyWindow = new Successfully();
        successfullyWindow.setLocation(0, 0);
        successfullyWindow.setVisible(false);
        add(successfullyWindow);

        forgetPasswordWindow = new ForgetPassword();
        forgetPasswordWindow.setLocation(0, 0);
        forgetPasswordWindow.setVisible(false);
        add(forgetPasswordWindow);

        deleteStudentsWindow = new DeleteStudents();
        deleteStudentsWindow.setLocation(0, 0);
        deleteStudentsWindow.setVisible(false);
        add(deleteStudentsWindow);

        loginInstructorWindow = new LoginInstructor();
        loginInstructorWindow.setLocation(0, 0);
        loginInstructorWindow.setVisible(false);
        add(loginInstructorWindow);
    }
}
