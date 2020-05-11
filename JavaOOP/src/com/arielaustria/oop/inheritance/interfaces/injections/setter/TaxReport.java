package com.arielaustria.oop.inheritance.interfaces.injections.setter;

public class TaxReport {

    private Calculator mCalculator;

    public TaxReport(Calculator calculator) {
        this.mCalculator = calculator;
    }

    public void setCalculator (Calculator calculator){
        this.mCalculator = calculator;
    }

    public void show() {
        double deducted = mCalculator.calculateTax();
        System.out.println(String.format("Total deduction: P%,.2f", deducted));
        System.out.println(String.format("Net salary: P%,.2f", (mCalculator.getSalary() - deducted)));
    }
}
