package com.arielaustria.refactor;

import java.text.NumberFormat;

public class Calculator {

    private final int mPrincipal;
    private final float mInterestRate;//Actual = Annual Interest Rate
    private final int mNumberOfPayments;

    public Calculator(int principal, float annualInterestRate, int period) {
        mPrincipal = principal;
        mInterestRate = setActualInterest(annualInterestRate);
        mNumberOfPayments = setNumberOfPayments(period);
    }

    /*
        Suppose you take out a 30 year mortgage for $100,000 at 7% interest ,
        and want to know the monthly payments. To do that, you divide the interest
        rate by 12 to get (.07/12) = .00583; and multiply 30 x 12 = 360 to get the
        number of payments. Then the formula gives you:
        payment = [$100,000(1 + .00583)360 x .00583] / [(1 + .00583)360 - 1] = $665

     */

    private float setActualInterest(float annualInterestRate) {
        return (annualInterestRate / 100) / 12;
    }

    private int setNumberOfPayments(int period) {
        return (period * 12);
    }

    public double getTotalMortgage() {
        return mPrincipal * ((Math.pow(1 + mInterestRate, mNumberOfPayments) * mInterestRate)
                / (Math.pow(1 + mInterestRate, mNumberOfPayments) - 1));
    }

    public void showPaymentSchedule() {
        double mortgage = getTotalMortgage();
        int payment_made = 0;
        if (mortgage >= 0) {
            while (mortgage != 0) {
                mortgage = mPrincipal * ((Math.pow(1 + mInterestRate, mNumberOfPayments)
                        - Math.pow(1 + mInterestRate, ++payment_made))
                        / (Math.pow(1 + mInterestRate, mNumberOfPayments) - 1));

                System.out.println(getCurrencyInstance(mortgage));
            }
        }
    }

    private static String getCurrencyInstance(double mortgage) {
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }


}
