package com.arielaustria.oop.inheritance.interfaces;

import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your salary: ");
        double userSalary = scan.nextDouble();

        //My salary for deduction
        TaxReport report = new TaxReport(userSalary);
        report.show();

    }
}
