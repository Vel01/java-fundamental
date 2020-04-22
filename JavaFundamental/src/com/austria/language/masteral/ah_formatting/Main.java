package com.austria.language.masteral.ah_formatting;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Main {
    public static void main(String[] args) {
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = NumberFormat.getPercentInstance().format(0.1);

        System.out.println(result);
    }
}
