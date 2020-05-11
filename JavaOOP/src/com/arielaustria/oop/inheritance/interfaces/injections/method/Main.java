package com.arielaustria.oop.inheritance.interfaces.injections.method;

import java.util.Scanner;

/*
    Sample Dependency injection method
    This app uses method injection with the help of interface
    It help's decoupled the object TaxReport and TaxCalculator2020

    Benefit using setter injection.
    Able to use it direct if needed
 */

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your salary: ");
        double userSalary = scan.nextDouble();

        Calculator calculator = new TaxCalculator2020(userSalary);//new TaxCalculator2020(userSalary);
        //My salary for deduction
        TaxReport report = new TaxReport();
        report.show(calculator);//method injection
        //new dependency
        report.show(new TaxCalculator2021(userSalary));


    }
}
