package com.arielaustria.oop.inheritance.Interface;

public class TaxCalculator2019 implements TaxCalculator {

    private final double taxableIncome;

    public TaxCalculator2019(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    //Tax calculator and its unique implementation for this class
    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
