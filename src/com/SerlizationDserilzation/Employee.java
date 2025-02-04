package com.SerlizationDserilzation;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {
    private Integer employeeId;
    private String employeeName;
    private Double employeeSalary;

    public Employee(Integer employeeId, String employeeName, Double employeeSalary) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
                + employeeSalary + "]";
    }

    public static Employee getEmployeeObject() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id :");
        int id = sc.nextInt();

        System.out.print("Enter Employee Name :");
        String name = sc.nextLine();
        name = sc.nextLine();

        System.out.print("Enter Employee Salary :");
        double salary = sc.nextDouble();

        return new Employee(id, name, salary);

    }

}