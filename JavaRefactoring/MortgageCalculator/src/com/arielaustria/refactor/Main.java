package com.arielaustria.refactor;

public class Main {

    public static void main(String[] args) {

        Console console = new Console();
        MortgageCalculator calculator = new MortgageCalculator(console);
        MortgageReport mortgageReport = new MortgageReport(calculator);
        mortgageReport.showResult();
    }
}
