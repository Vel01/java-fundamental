package com.arielaustria.oop.inheritance.interfaces.injections.setter;

import java.util.Scanner;

/*
    Sample Dependency injection setter
    This app uses setter injection with the help of interface
    It help's decoupled the object TaxReport and TaxCalculator2020

    Benefit using setter injection.
    You can change the dependency throughout a life time of the program
 */

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your salary: ");
        double userSalary = scan.nextDouble();

        Calculator calculator = new TaxCalculator2020(userSalary);//new TaxCalculator2020(userSalary);
        //My salary for deduction
        TaxReport report = new TaxReport(calculator);
        report.show();

        //Changing the dependency
        calculator = new TaxCalculator2021(userSalary);
        report.setCalculator(calculator);//setter injection
        report.show();


    }
}
