package com.arielaustria.oop.inheritance.interfaces;

public class TaxCalculator2020 {

    private double salary;
    private static final float TAX_2020 = .3F;

    public TaxCalculator2020(double salary) {
        //calculator for year 2020
        this.salary = salary;
    }

    public double calculateTax() {
        return salary * TAX_2020;
    }
}
