/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorph;

import java.util.Scanner;

/**
 * MotorPH Payroll System
 * -----------------------------------------
 * Computes employee payroll for a semi-monthly
 * cutoff period (15th or 30th).
 */

public class MotorPH {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== MOTORPH PAYROLL SYSTEM =====\n");

        // ===============================
        // EMPLOYEE INFO
        // ===============================

        System.out.print("Enter Employee Complete Name: ");
        String employeeCompleteName = input.nextLine();
        
        System.out.print("Enter Employee Number: ");
        String employeeNumber = input.nextLine();

        System.out.print("Enter Hourly Rate: ");
        double hourlyRate = input.nextDouble();

        System.out.print("Enter Payroll Cutoff (15 or 30): ");
        int cutoff = input.nextInt();

        // ===============================
        // COLLECT WORK DAYS
        // ===============================

        System.out.print("Enter number of days worked this cutoff: ");
        int daysWorked = input.nextInt();

        double totalHours = 0;

        for(int i = 1; i <= daysWorked; i++){

            System.out.println("\nDay " + i);

            double hours = HoursWorkedCalculator.calculateHoursWorked();

            totalHours += hours;
        }

        // ===============================
        // GROSS SALARY
        // ===============================

        double grossSalary =
                SalaryCalculator.computeSalary(totalHours, hourlyRate);

        // ===============================
        // DEDUCTIONS
        // ===============================

        double sss = DeductionCalculator.computeSSS(grossSalary);
        double philHealth = DeductionCalculator.computePhilHealth(grossSalary);
        double pagIbig = DeductionCalculator.computePagIbig(grossSalary);
        double tax = DeductionCalculator.computeIncomeTax(grossSalary);

        double totalDeductions = sss + philHealth + pagIbig + tax;

        double netPay = grossSalary - totalDeductions;

        // ===============================
        // PAYROLL SUMMARY
        // ===============================

        System.out.println("\n===== PAYROLL SUMMARY =====");

        System.out.println("Employee Complete Name : " + employeeCompleteName);
        System.out.println("Employee Number : " + employeeNumber);
        System.out.println("Cutoff Date   : " + cutoff);
        System.out.println("Total Hours   : " + totalHours);
        System.out.println("Gross Salary  : " + grossSalary);

        System.out.println("--------------------------------");

        System.out.println("SSS           : " + sss);
        System.out.println("PhilHealth    : " + philHealth);
        System.out.println("PagIBIG       : " + pagIbig);
        System.out.println("Income Tax    : " + tax);

        System.out.println("--------------------------------");

        System.out.println("Total Deduct. : " + totalDeductions);
        System.out.println("Net Pay       : " + netPay);

        input.close();
    }
}