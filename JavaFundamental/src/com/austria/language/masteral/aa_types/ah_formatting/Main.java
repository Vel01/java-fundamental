package com.austria.language.masteral.aa_types.ah_formatting;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = NumberFormat.getPercentInstance().format(0.1);

        System.out.println(result);
    }
}
