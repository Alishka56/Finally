package com.company;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id; //null
    private String name;
    private String surname;
    private String course;
    private String groups;
    private String school;
    private String typeMagic;
    private String login;
    private String password;

    public Student() {
    }

    public Student(Integer id, String name, String surname, String school, String login, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.school = school;
        this.login = login;
        this.password = password;
    }

    public Student(Integer id, String name, String surname, String course, String groups, String school, String typeMagic) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.groups = groups;
        this.school = school;
        this.typeMagic = typeMagic;
    }

    public Student(Integer id, String name, String surname, String group, String school, String typeMagic, String login, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groups = group;
        this.school = school;
        this.typeMagic = typeMagic;
        this.login = login;
        this.password = password;
    }

    public Student(Integer id, String name, String surname, String course, String groups, String school, String typeMagic, String login, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.groups = groups;
        this.school = school;
        this.typeMagic = typeMagic;
        this.login = login;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return groups;
    }

    public void setGroup(String group) {
        this.groups = group;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTypeMagic() {
        return typeMagic;
    }

    public void setTypeMagic(String typeMagic) {
        this.typeMagic = typeMagic;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  id+" "+name+" "+surname+" "+course+" "+groups + " " + school
                + " " + typeMagic ;
    }
    public String DataStudent() {
        return  name+" "+surname+" "+course+" "+groups + " " + school
                + " " + typeMagic + " " + login;
    }
}
