package com.bridgelabz.EmpWageProblem;

public class EmployeeWageProblem {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;


    public static int computeEmpWage(int empRatePerHour,
                                     int NumOfWorkingDays, int MaxHrsPerMonth) {
        int workingHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int day = 1;


        while (totalEmpHrs <= MaxHrsPerMonth && totalWorkingDays < NumOfWorkingDays) {
            totalWorkingDays++;

            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            switch (empCheck) {

                case PART_TIME:
                    workingHrs = 4;

                    break;

                case FULL_TIME:
                    workingHrs = 8;
                    break;

                default:
                    workingHrs = 0;

            }

            empWage = workingHrs * empRatePerHour;
            totalEmpWage = totalEmpWage + empWage;
            totalEmpHrs = totalEmpHrs + workingHrs;
            day++;
        }

        return totalEmpWage;
    }

    public static void main(String[] args) {

        int totalWage = computeEmpWage(20, 20, 80);
        System.out.println("Total Emp Wage for TCS: " + totalWage);
        int totalWage1 = computeEmpWage(30, 20, 100);
        System.out.println("Total Emp Wage for Infosys: " + totalWage1);
    }
}