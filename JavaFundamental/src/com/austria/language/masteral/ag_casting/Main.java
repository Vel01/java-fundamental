package com.austria.language.masteral.ag_casting;

public class Main {

    public static void main(String[] args) {
        //Implicit casting or automatically converted. no data loss
        //byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        double a = 1.1;
        double b = a + 2;//2.0
        System.out.println(b);

        //Explicitly casting
        y = (int) (a + 2);
        System.out.println(y);

        //Wrapper classes and method
        /**
         * String to primitive casting
         * Integer.parseInt()
         * Short.parseShort()
         */

        String number = "1";
        y = Integer.parseInt(number);
        System.out.println(y);
    }
}
