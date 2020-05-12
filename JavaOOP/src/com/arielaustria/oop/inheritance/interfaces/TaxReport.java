package com.arielaustria.oop.inheritance.interfaces;

public class TaxReport {

    private TaxCalculator2020 mCalculator;

    private double empSalary;

    public TaxReport(double salary) {
        mCalculator = new TaxCalculator2020(salary);
        this.empSalary = salary;
    }

    public void show() {
        double deducted = mCalculator.calculateTax();
        System.out.println(String.format("Total deduction: P%,.2f", deducted));
        System.out.println(String.format("Net salary: P%,.2f", (empSalary - deducted)));
    }
}
