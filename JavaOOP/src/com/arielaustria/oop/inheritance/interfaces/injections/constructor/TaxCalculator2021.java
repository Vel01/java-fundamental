package com.arielaustria.oop.inheritance.interfaces.injections.constructor;

public class TaxCalculator2021 implements Calculator {

    private double salary;
    private static final float TAX_2021 = .2F;

    public TaxCalculator2021(double salary) {
        //calculator for year 2020
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double calculateTax() {
        return salary * TAX_2021;
    }
}
