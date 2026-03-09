/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph;

/**
 * DeductionCalculator
 * ---------------------------------------------------------
 * PURPOSE
 * Computes government deductions from gross salary.
 *
 * DEDUCTIONS INCLUDED
 * - SSS
 * - PhilHealth
 * - Pag-IBIG
 * - Income Tax
 */

public class DeductionCalculator {

    public static double computeSSS(double grossSalary) {
        return grossSalary * 0.04;
    }

    public static double computePhilHealth(double grossSalary) {
        return grossSalary * 0.02;
    }

    public static double computePagIbig(double grossSalary) {
        return grossSalary * 0.01;
    }

    public static double computeIncomeTax(double grossSalary) {
        return grossSalary * 0.10;
    }
}