package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");///
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/finally?useUnicode=true&serverTimezone=UTC","root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student student){
        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO student (id, name, surname ,course ,groups ,school ,typeMagic ,login ,password) " +
                    "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setString(3, student.getCourse());
            statement.setString(4, student.getGroup());
            statement.setString(5, student.getSchool());
            statement.setString(6, student.getTypeMagic());
            statement.setString(7, student.getLogin());
            statement.setString(8, student.getPassword());

            statement.executeUpdate();// Insert, Delete, Update

            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Student> getAllStudents(){
        ArrayList<Student> studentList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM student");
            ResultSet resultSet = statement.executeQuery();/// Select

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String course = resultSet.getString("course");
                String groups = resultSet.getString("groups");
                String school = resultSet.getString("school");
                String typeMagic = resultSet.getString("typeMagic");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");

                studentList.add(new Student(id, name, surname,course,groups,school,typeMagic,login,password));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return studentList;
    }
    //// CRUD: Create(Insert into), Read(Select), Update, Delete
    public void deleteStudent(Integer id){
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "DELETE FROM student WHERE id = ?");
            statement.setInt(1,id);
            int rows = statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
