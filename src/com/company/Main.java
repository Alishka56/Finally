package com.company;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class Main {
    public static MainFrame frame;

    public static Student[] students = new Student[35];
    public static int stCount=0;
    public static int n=0;
    public static boolean checks=false;
    public static void addStudent(Student st){
        students[stCount++] = st;
    }

    public static void connect(PackageData packageData) {
       try {
           Socket socket = new Socket( "127.0.0.1" , 8888);
           ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
           ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

           if(packageData.getOperationType().equals("REGISTRATION")){
               outputStream.writeObject(packageData); // REGISTRATION Student
           }
           else if (packageData.getOperationType().equals("LIST")){
               outputStream.writeObject(packageData);
               PackageData infoFromServer = (PackageData)inputStream.readObject();
               ArrayList<Student> arrayListFromServer = infoFromServer.getStudents();
               String s = "";
               for (int i=0;i<arrayListFromServer.size();i++){
                   s+=arrayListFromServer.get(i) + "\n";
               }
               ListStudent.textArea.append(s);
           }
           else if (packageData.getOperationType().equals("DATA")){
               outputStream.writeObject(packageData);
               PackageData infoFromServer = (PackageData)inputStream.readObject();
               ArrayList<Student> arrayListFromServer = infoFromServer.getStudents();
               ArrayList<Student> login;
               login=arrayListFromServer;
               for (int i=0;i<arrayListFromServer.size();i++){
                     Main.addStudent(login.get(i));
               }
           }
           else if (packageData.getOperationType().equals("PASSWORD")){
               outputStream.writeObject(packageData);
               PackageData infoFromServer = (PackageData)inputStream.readObject();
               ArrayList<Student> arrayListFromServer = infoFromServer.getStudents();
               String s = "";
               for (int i=0;i<arrayListFromServer.size();i++){
                   if(arrayListFromServer.get(i).getLogin().equalsIgnoreCase(ForgetPassword.loginText.getText())){
                       s+="Your password: "+arrayListFromServer.get(i).getPassword();
                       break;
                   }
               }
               YourPassword.mistakeLabel.setText(s);
           }
           else if(packageData.getOperationType().equals("DELETE")){
               outputStream.writeObject(packageData);
           }

           socket.close();
           outputStream.close();
           inputStream.close();
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    public static void saveUserList(ArrayList<Student> st) {
        try{
            BufferedWriter output = new BufferedWriter(new FileWriter("Data.txt"));
            String s = "";
            for(int i=0;i<st.size();i++){
                s+=st.get(i) + "\n";
            }

            output.write(s);
            output.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> getUserList(){
        ArrayList<Student> students = new ArrayList<>();
        try {
            BufferedReader input = new BufferedReader(new FileReader("Data.txt"));
            String s = "" ;
            while((s=input.readLine())!=null){
                String[] words = s.split(" ");
                Student student1 = new Student(Integer.parseInt(words[0]),words[1],words[2],words[3],words[4],words[5],words[6]);
                students.add(student1);
            }
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }

    public static ArrayList<WeaponTypes> getWeaponsList(){
        ArrayList<WeaponTypes> weaponTypes = new ArrayList<>();
        try {
            BufferedReader input = new BufferedReader(new FileReader("Weaponss.txt"));
            String s = "" ;
            while((s=input.readLine())!=null){
                String[] words = s.split(" ");
                WeaponTypes wt = new WeaponTypes(words[0],words[1],Integer.parseInt(words[2]),Integer.parseInt(words[3]));
                weaponTypes.add(wt);
            }
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return weaponTypes;
    }

    public static ArrayList<Instructor> getInstructorList(){
        ArrayList<Instructor> instructors = new ArrayList<>();
        try {
            BufferedReader input = new BufferedReader(new FileReader("Instructor.txt"));
            String s = "" ;
            while((s=input.readLine())!=null){
                String[] words = s.split(" ");
                Instructor wt = new Instructor(Integer.parseInt(words[0]),words[1],words[2],words[3],words[4],words[5],words[6],words[7],words[8],words[9]);
                instructors.add(wt);
            }
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return instructors;
    }

    public static void main(String[] args) {
        frame = new MainFrame();
        frame.setVisible(true);
        try {
            PackageData pd = new PackageData("DATA");
            Main.connect(pd);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
