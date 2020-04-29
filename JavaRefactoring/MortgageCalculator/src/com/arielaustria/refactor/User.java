package com.arielaustria.refactor;

import java.text.NumberFormat;

public class User {

    //variables
    private int mPrincipal;
    private float mAnnualInterestRate;
    private int mPeriod;
    private double mMortgage;

    //references
    private Calculator mCalculator;
    private Validator mValidator;

    private String getMortgage() {
        return NumberFormat.getCurrencyInstance().format(mMortgage);
    }

    public void controller() {
        mValidator = new Validator();

        enterPrincipal();
        enterAnnualInterestRate();
        enterPeriod();

        mCalculator = new Calculator(mPrincipal, mAnnualInterestRate, mPeriod);
        mMortgage = mCalculator.getTotalMortgage();
        showResult();
    }

    private void showResult() {
        System.out.println("\nMORTGAGE\n---------\nMonthly Payments: "
                + getMortgage()
                + "\n\nPAYMENT SCHEDULE\n----------------");
        mCalculator.showPaymentSchedule();
    }

    private void enterPrincipal() {
        mPrincipal = mValidator.validator("Principal: ",
                1000, 1_000_000,
                "Enter a number between 1,000 and 1,000,000 (inclusive)");
    }

    private void enterAnnualInterestRate() {
        mAnnualInterestRate = mValidator.validator("Annual Interest Rate: ",
                1, 30,
                "Enter a value greater than 0 and less than or equal to 30 (inclusive)");
    }

    private void enterPeriod() {
        mPeriod = mValidator.validator("Period: ",
                1, 30,
                "Enter a value between 1 and 30 (inclusive)");
    }

}
