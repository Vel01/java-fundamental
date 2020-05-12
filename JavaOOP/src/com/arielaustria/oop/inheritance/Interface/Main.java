package com.arielaustria.oop.inheritance.Interface;

public class Main {

    public static void main(String[] args) {
        /*  Interface
            We use interface to build loosely-coupled, extensible, testable applications.
            interface - What should be done!
            classes - How it should be done

            Dependency Injection
            Our classes should not instantiate their dependencies.
            Constructor Injection
            Method Injection
         */

        TaxCalculator calculator = new TaxCalculator2019(100_000);
        TaxReport report = new TaxReport(calculator);
        report.show();

    }

}
