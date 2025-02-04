package com.SerlizationDserilzation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoreEmployeeObject {


    public static void main(String[] args) throws IOException {
        //Creating a file to write object data
        FileOutputStream fout = new FileOutputStream("C:/Users/ShohebPathan/Employee.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        Scanner sc = new Scanner(System.in);

        try (fout; oos; sc) {
            System.out.println("How many objects u want to store");
            int noOfObj = sc.nextInt();

            for (int i = 1; i <= noOfObj; i++) {
                Employee object = Employee.getEmployeeObject();
                //oos.writeObject(object.getEmployeeId() + "," + object.getEmployeeName() + "," + object.getEmployeeSalary());
                oos.writeObject(object);
            }
            oos.writeObject(new EOFClass());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oos.close();
            fout.close();
        }
        System.out.println("Employee Object Stored Successfully");
    }

}


