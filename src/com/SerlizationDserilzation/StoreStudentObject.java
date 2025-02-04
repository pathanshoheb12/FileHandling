package com.SerlizationDserilzation;

import java.io.*;
import java.util.Scanner;

public class StoreStudentObject {

    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("C:\\Users\\ShohebPathan\\IdeaProjects\\FileHandling\\src\\com\\SerlizationDserilzation\\student.txt");
        ObjectOutputStream Oout = new ObjectOutputStream(fout);
        try {
            System.out.println("How Many Students Details you Want Store");
            Scanner sc = new Scanner(System.in);

            int noOfStudentObject = sc.nextInt();

            for (int i = 0; i < noOfStudentObject; i++) {
                Student studentObject = Student.getStudentObject();
                Oout.writeObject(studentObject);
            }
            System.out.println(noOfStudentObject + " Students details added Successfully");
        } catch (Exception e1) {
            e1.getMessage();
        } finally {
            fout.close();
            Oout.close();
        }


    }
}
