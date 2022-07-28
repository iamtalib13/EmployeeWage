package com.bridgelabz.EmpWageProblem;

public class EmployeeWageProblem {
    public static  final int FULL_TIME = 1;
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        int empCheck = (int) (Math.floor(Math.random() * 10) %2);

        if(empCheck == FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }
}
