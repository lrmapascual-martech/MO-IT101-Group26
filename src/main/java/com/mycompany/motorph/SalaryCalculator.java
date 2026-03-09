/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph;

/**
 * SalaryCalculator
 * ---------------------------------------------------------
 * PURPOSE
 * Computes the gross salary of an employee.
 *
 * FORMULA
 * Gross Salary = Hours Worked × Hourly Rate
 */

public class SalaryCalculator {

    /**
     * METHOD: computeSalary
     *
     * Calculates gross salary using hours worked
     * and hourly rate.
     */

    public static double computeSalary(double hoursWorked, double hourlyRate) {

        if (hoursWorked < 0 || hourlyRate < 0) {

            throw new IllegalArgumentException(
                    "Hours worked and hourly rate must be positive values."
            );
        }

        return hoursWorked * hourlyRate;
    }
}