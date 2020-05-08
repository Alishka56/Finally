package com.company;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        try{
            DBManager manager = new DBManager();
            manager.connect();

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            PackageData packageData = null;
            while ( (packageData=(PackageData)inputStream.readObject())!=null ){
                if(packageData.getOperationType().equals("REGISTRATION")){/// "ADD", Student
                    Student studentFromClient = packageData.getStudent();
                    manager.addStudent(studentFromClient);
                }
                else if(packageData.getOperationType().equals("LIST")){
                    ArrayList<Student> infoForClient = manager.getAllStudents();
                    PackageData toClient = new PackageData(infoForClient);
                    outputStream.writeObject(toClient);
                }
                else if(packageData.getOperationType().equals("DATA")){
                    ArrayList<Student> infoForClient = manager.getAllStudents();
                    PackageData toClient = new PackageData(infoForClient);
                    outputStream.writeObject(toClient);
                }
                else if(packageData.getOperationType().equals("PASSWORD")){
                    ArrayList<Student> infoForClient = manager.getAllStudents();
                    PackageData toClient = new PackageData(infoForClient);
                    outputStream.writeObject(toClient);
                }
                else if(packageData.getOperationType().equals("DELETE")){
                    Student studentFromClient = packageData.getStudent();
                    manager.deleteStudent(9);
                }
            }
            inputStream.close();
            outputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

