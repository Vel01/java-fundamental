package com.austria.language.masteral.ab_control_flow.ac_if;

public class Main {
    /*
        If temp is greater than 30
            It's a hot day
            Drink plenty of water
        Otherwise, if it's between 20 and 30
            It's a nice day
        Otherwise
            It's cold
     */
    public static void main(String[] args) {

        int temperature = 32;

        if (temperature > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temperature > 20) {//&& temperature <= 30) {
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's cold");
        }

        //simplify if statement

        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);

    }
}
