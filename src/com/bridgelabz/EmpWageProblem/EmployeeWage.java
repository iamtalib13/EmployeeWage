package com.bridgelabz.EmpWageProblem;

public interface EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;


    public void calculateEmpWage();

    public int calculateEmpWage(CompanyEmpWage companyEmpWage);
}