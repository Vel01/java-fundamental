package com.arielaustria.oop.inheritance.Interface;

public class TaxReport {


    private final TaxCalculator mCalculator;

    //Constructor Injection
    public TaxReport(TaxCalculator taxCalculator) {
        this.mCalculator = taxCalculator;
        //tightly couple
//        mTaxCalculator2019 = new TaxCalculator2019(100_000);
    }

    public void show() {
        double tax = mCalculator.calculateTax();
        System.out.println(tax);
    }

}
