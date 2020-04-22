package com.austria.language.masteral.ak_project;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        /**
         * Mortgage - Monthly payments
         * M = monthly payments
         * P = principal
         * r = rate
         * n = number of payments
         *
         * M = ?
         * P = 100,000
         * r = 0.005
         * n = 180
         */

        int principal = 100000;
        double annualInterestRate = 3.92;
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        System.out.println(monthlyInterestRate);
        int period = 30;
        double numOfPayments = period / 12;
        double numerator = monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numOfPayments));
        double denominator = Math.pow(1 + monthlyInterestRate, numOfPayments) - 1;
        System.out.println(principal * (numerator / denominator));
//        double mortgage = principal * (numerator / denominator);
//        System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
