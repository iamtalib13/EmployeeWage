package com.bridgelabz.EmpWageProblem;

public class EmployeeWageProblem {
    public static  final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static void main(String[] args) {
        int workingHrs = 0;
        int empWage = 0;

        System.out.println("Welcome to Employee Wage Computation Program");
        int empCheck = (int) (Math.floor(Math.random() * 10) %3);

        if(empCheck == FULL_TIME) {
            workingHrs = 8;
            System.out.println("Employee is Present for "+workingHrs+" Hrs");
        }
       else if(empCheck == PART_TIME) {
            workingHrs = 4;
            System.out.println("Employee is Present for "+workingHrs+" Hrs");
        }
        else{
            workingHrs = 0;
            System.out.println("Employee is Absent");
        }

        empWage = workingHrs * WAGE_PER_HOUR ;
        System.out.println("Employee wage is: "+ empWage);
    }
}
