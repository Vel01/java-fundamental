package com.arielaustria.refactor;

import java.text.NumberFormat;

public class MortgageReport {
    
    //reference
    private final MortgageCalculator mMortgageCalculator;

    public MortgageReport(MortgageCalculator calculator) {
        mMortgageCalculator = calculator;
    }

    public void showResult() {
        System.out.println("\nMORTGAGE\n---------\nMonthly Payments: "
                + getMortgage()
                + "\n\nPAYMENT SCHEDULE\n----------------");
        mMortgageCalculator.showPaymentSchedule();
    }

    private String getMortgage() {
        return NumberFormat.getCurrencyInstance().format(mMortgageCalculator.getTotalMortgage());
    }

}
