package com.arielaustria.oop.inheritance.interfaces.injections.constructor;

import java.util.Scanner;

/*
    Sample Dependency injection constructor
    This uses constructor injection with the help of interface,
    It help's decoupled the object TaxReport and TaxCalculator2020
 */

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your salary: ");
        double userSalary = scan.nextDouble();

        Calculator calculator = new TaxCalculator2020(userSalary);//new TaxCalculator2020(userSalary);
        //My salary for deduction
        TaxReport report = new TaxReport(calculator);//calculator injected
        report.show();

    }
}
