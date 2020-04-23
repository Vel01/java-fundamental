package com.austria.language.masteral.ab_control_flow.ab_logical;

public class Main {

    public static void main(String[] args) {
        //and operator
        int temperature = 12;
        //evaluate from left to right...
        boolean isWarm = temperature > 20 && temperature < 30;//both condition must both be true
        System.out.println(isWarm);

        //or operator
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        //not operator revert the real value...
        boolean isEligible = hasHighIncome || hasGoodCredit && !hasCriminalRecord;//must at least have true


    }
}
