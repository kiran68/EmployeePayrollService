package com.bridgelabz.employeepayrollservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class EmployeePayrollService {
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {
        employeePayrollList = new ArrayList<>();
    }

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter number of employees: ");
        int n = consoleInputReader.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee ID : ");
            int id = consoleInputReader.nextInt();
            System.out.println("Enter Your name : ");
            String name = consoleInputReader.next();
            System.out.println("Enter Employee Salary :");
            long salary = consoleInputReader.nextLong();
            employeePayrollList.add(new EmployeePayrollData(id, name, salary));
        }
    }

    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Data to Console\n" + employeePayrollList);
    }
}

