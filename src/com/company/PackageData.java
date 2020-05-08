package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operationType;
    private Student student;
    private ArrayList<Student> students;

    public PackageData(String operationType, Student student) { // Send to server info about one student
        this.operationType = operationType;
        this.student = student;
    }

    public PackageData(String operationType) { // List all info from server
        this.operationType = operationType;
    }

    public PackageData(ArrayList<Student> students) { // Send back to client
        this.students = students;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
