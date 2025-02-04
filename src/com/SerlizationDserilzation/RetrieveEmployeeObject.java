package com.SerlizationDserilzation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class RetrieveEmployeeObject {
    public static void main(String[] args) throws IOException, Exception {
        var fin = new FileInputStream("C:/Users/ShohebPathan/Employee.txt");
        var ois = new ObjectInputStream(fin);

        try {
            Object e = null;
            while (!(( e = ois.readObject()) instanceof EOFClass)) {
                 System.out.println(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fin.close();
            ois.close();
        }

    }
}