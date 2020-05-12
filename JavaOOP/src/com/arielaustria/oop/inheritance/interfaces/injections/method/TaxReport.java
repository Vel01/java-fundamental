package com.arielaustria.oop.inheritance.interfaces.injections.method;

public class TaxReport {

    public void show(Calculator calculator) {
        double deducted = calculator.calculateTax();
        System.out.println(String.format("Total deduction: P%,.2f", deducted));
        System.out.println(String.format("Net salary: P%,.2f", (calculator.getSalary() - deducted)));
    }
}
