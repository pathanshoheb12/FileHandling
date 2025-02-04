package com.SerlizationDserilzation;

import java.io.*;

public class RetrieveStudentObject {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ShohebPathan\\IdeaProjects\\FileHandling\\src\\com\\SerlizationDserilzation\\student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try (fileInputStream; objectInputStream) {
            Student student = null;
            while ((student = (Student) objectInputStream.readObject()) != null) {
                System.out.println(student);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
