package com.austria.language.masteral.aa_types.ak_project;

      /*
          Mortgage - Monthly payments
          M = monthly payments
          P = principal
          r = rate
          n = number of payments

          M = ?
          P = 100,000
          r = 0.005
          n = 180

        Mortgage Example

        http://www.moneychimp.com/articles/finworks/fmmortgage.htm
        Suppose you take out a 30 year mortgage for $100,000 at 7% interest,
        and want to know the monthly payments. To do that, you divide the interest
        rate by 12 to get (.07/12) = .00583; and multiply 30 x 12 = 360 to get the
        number of payments. Then the formula gives you:
        payment = [$100,000(1 + .00583)360 x .00583] / [(1 + .00583)360 - 1] = $665
         */

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    private static Scanner getInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("### Mortgage Calculator ###");
        System.out.println("Mortgage: " + getMortgage());
    }

    private static String getMortgage() {
        final byte MONTHS_IN_YEAR = 12;

        System.out.print("Principal: ");
        int principal = getInput.nextInt();
        System.out.print("Annual Interest Rate: ");
        float interestRate = getInterestRate(getInput.nextFloat());
        System.out.print("Period (YEARS): ");
        int numberOfPayments = getInput.nextInt() * MONTHS_IN_YEAR;
        return getMortgage(principal, interestRate, numberOfPayments);
    }

    private static float getInterestRate(float annualInterestRate) {
        if (annualInterestRate != 0 && annualInterestRate < 0)
            return -1;

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float actualInterest = annualInterestRate / PERCENT;
        return actualInterest / MONTHS_IN_YEAR;
    }


    private static String getMortgage(int principal, float interestRate, int numberOfPayments) {
        if (interestRate < 0 && principal < 0 && interestRate < 0 && numberOfPayments < 0)
            return "Invalid Input!";
        float numerator = (float) (interestRate * Math.pow(1 + interestRate, numberOfPayments));
        float denominator = (float) (Math.pow(1 + interestRate, numberOfPayments) - 1);
        return NumberFormat.getCurrencyInstance().format(principal * (numerator / denominator));
    }
}
