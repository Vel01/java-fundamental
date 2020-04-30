package com.arielaustria.refactor;

import java.text.NumberFormat;

public class MortgageCalculator {

    private final Console mConsole;

    public MortgageCalculator(Console console) {
        mConsole = console;
    }

    private double getActualInterest() {
        return (mConsole.getAnnualInterestRate() / 100) / 12;
    }
    private int getNumberOfPayments() {
       return (mConsole.getPeriod() * 12);
    }

    private static String getCurrencyInstance(double mortgage) {
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }

    public double getTotalMortgage() {
        return mConsole.getPrincipal() * ((Math.pow(1 + getActualInterest(), getNumberOfPayments()) * getActualInterest())
                / (Math.pow(1 + getActualInterest(), getNumberOfPayments()) - 1));
    }

    public void showPaymentSchedule() {
        double mortgage = getTotalMortgage();
        int payment_made = 0;
        if (mortgage >= 0) {
            while (mortgage != 0) {
                mortgage = mConsole.getPrincipal() * ((Math.pow(1 + getActualInterest(), getNumberOfPayments())
                        - Math.pow(1 + getActualInterest(), ++payment_made))
                        / (Math.pow(1 + getActualInterest(), getNumberOfPayments()) - 1));

                System.out.println(getCurrencyInstance(mortgage));
            }
        }
    }


}
