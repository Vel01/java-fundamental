package com.arielaustria.refactor;

import java.util.Scanner;

public class Console {

    //variables
    private int mPrincipal;
    private double mAnnualInterestRate;
    private int mPeriod;

    private Scanner getInput() {
        return new Scanner(System.in);
    }

    public Console() {
        setPrincipal();
        setAnnualInterestRate();
        setPeriod();
    }

    private void setPrincipal() {
        mPrincipal = (int) validator("Principal: ",
                1000, 1_000_000);
    }

    private void setAnnualInterestRate() {
        mAnnualInterestRate = validator("Annual Interest Rate: ",
                1, 30);
    }

    private void setPeriod() {
        mPeriod = (int) validator("Period: ",
                1, 30);
    }

    public int getPrincipal() {
        return mPrincipal;
    }

    public double getAnnualInterestRate() {
        return mAnnualInterestRate;
    }

    public int getPeriod() {
        return mPeriod;
    }

    private double validator(String message, int minimum, int maximum) {
        double input;
        while (true) {
            System.out.print(message);
            input = getInput().nextDouble();

            if (input < minimum || input > maximum) {
                System.out.println("Enter a number between " + minimum + " and " + maximum + " (inclusive)");
                continue;
            }
            break;
        }
        return input;
    }


}
