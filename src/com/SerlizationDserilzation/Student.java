package com.SerlizationDserilzation;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private  Integer studentId;
    private String studentName;
    private String course;
   private Integer marks;

    public Student(Integer studentId, String studentName, String course, Integer marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static Student getStudentObject()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the StudentId:");
        int id = sc.nextInt();
        System.out.println("Enter the StudentName:");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter the Course:");
        String course = sc.nextLine();
        System.out.println("Enter the StudentMarks:");
        int marks= sc.nextInt();
        return new Student(id,name,course,marks);

    }
}
