package com.austria.language.masteral.ac_clean_code;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {


    private static Scanner getInput = new Scanner(System.in);

    public static void main(String[] args) {
        /*
            Principal = 1000 and 1000000 (inclusive)
            Annual Interest Rate = greater than 0 and less than or equal to 30
            Period = between 1 to 30

                    Mortgage Example

        http://www.moneychimp.com/articles/finworks/fmmortgage.htm
        Suppose you take out a 30 year mortgage for $100,000 at 7% interest ,
        and want to know the monthly payments. To do that, you divide the interest
        rate by 12 to get (.07/12) = .00583; and multiply 30 x 12 = 360 to get the
        number of payments. Then the formula gives you:
        payment = [$100,000(1 + .00583)360 x .00583] / [(1 + .00583)360 - 1] = $665


        WHILE principal is not equal to 1000 OR less than or equal to 1000000
            PRINT Enter a number between 1,000 and 1,000,000 (inclusive)
        WHILE annual interest rate is not greater than 0 and not less than or equal to 30
            PRINT Enter a value greater than 0 and less than or equal to 30 (inclusive)
        WHILE period is not greater or equal to 1 and less than or equal to 30
            PRINT Enter a value between 1 and 30 (inclusive)
        IF inputs are valid
            calculate, and use those values to get the total mortgage
        END OF IF
        PRINT total mortgage
         */


        getMortgage();
    }


    private static void getMortgage() {

        System.out.print("Principal ($1K - $1M): ");
        int principal = validation("Principal ($1K - $1M): ", getInput.nextInt(), 1_000, 1_000_000);
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = validation("Annual Interest Rate: ", getInput.nextFloat(), 1, 30);
        System.out.print("Period (Years): ");
        byte period = (byte) validation("Period (Years): ", getInput.nextByte(), 1, 30);

        getMortgage(principal, annualInterestRate, period);

    }

    private static void getMortgage(int principal, float annualInterestRate, int period) {

        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        float interestRate = ((annualInterestRate / PERCENT) / MONTHS_IN_YEAR);
        int number_of_payments = period * MONTHS_IN_YEAR;

        float mortgage = principal * (float) (interestRate * (Math.pow(1 + interestRate, number_of_payments))
                / (Math.pow(1 + interestRate, number_of_payments) - 1));

        System.out.println("\nMORTGAGE\n---------\nMonthly Payments: "
                + NumberFormat.getCurrencyInstance().format(mortgage)
                + "\n\nPAYMENT SCHEDULE\n----------------");
        paymentSchedule(mortgage, principal, interestRate, number_of_payments);

    }

    private static void paymentSchedule(double mortgage, int principal, float interestRate, int number_of_payments) {

        double remaining_payment = mortgage;
        int payment_made = 0;
        while (remaining_payment != 0) {

            remaining_payment = principal * ((Math.pow(1 + interestRate, number_of_payments) -
                    Math.pow(1 + interestRate, ++payment_made)) / (Math.pow(1 + interestRate, number_of_payments) - 1));

            System.out.println(NumberFormat.getCurrencyInstance().format(remaining_payment));
        }

    }

    private static float validation(String message, float input, int minimum, int maximum) {
        while (true) {
            if (input >= minimum && input <= maximum) {
                return input;
            }
            System.out.print(message);
            input = getInput.nextFloat();
        }
    }

    private static int validation(String message, int input, int minimum, int maximum) {
        while (true) {
            if (input >= minimum && input <= maximum) {
                return input;
            }
            System.out.print(message);
            input = getInput.nextInt();
        }
    }

}
