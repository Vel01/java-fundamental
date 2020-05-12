package com.arielaustria.oop.inheritance.interfaces;

import java.util.Scanner;

public class Main {

    /*
        When to use Interface
        When you want to decouple a class from its dependencies
        Benefits
        1. Easy to swap implementation from one to another
        2. Easy to extend your applications
        3. Test classes in isolation
     */

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your salary: ");
        double userSalary = scan.nextDouble();

        //My salary for deduction
        TaxReport report = new TaxReport(userSalary);
        report.show();

    }
}
