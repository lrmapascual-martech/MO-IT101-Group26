/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph;

import java.util.Scanner;

/**
 * HoursWorkedCalculator
 * ---------------------------------------------------------
 * PURPOSE
 * Calculates the total hours worked by an employee
 * using the formula:
 *
 * Total Hours Worked = (Time Out - Time In) - Break Time
 *
 * DESIGN
 * This class provides a reusable method that can be
 * called by the main payroll system.
 */

public class HoursWorkedCalculator {

    /**
     * METHOD: calculateHoursWorked
     *
     * Collects time input and computes total hours worked.
     */

    public static double calculateHoursWorked() {

        Scanner input = new Scanner(System.in);

        System.out.println("\n======= WORK HOURS CALCULATION =======");

        System.out.print("Enter Time In (example: 8.0): ");
        double timeIn = input.nextDouble();

        System.out.print("Enter Time Out (example: 17.0): ");
        double timeOut = input.nextDouble();

        System.out.print("Enter Break Time (hours): ");
        double breakTime = input.nextDouble();

        // Raw working hours
        double rawHoursWorked = timeOut - timeIn;

        // Subtract break time
        double totalHoursWorked = rawHoursWorked - breakTime;

        System.out.println("Total Hours Worked: " + totalHoursWorked);

        return totalHoursWorked;
    }
}
