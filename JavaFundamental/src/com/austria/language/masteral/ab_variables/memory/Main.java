package com.austria.language.masteral.ab_variables.memory;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        /**
         * Primitive vs Reference in memory
         * HERE: (PRIMITIVE)
         * x and y are in different memory location
         * because they are independent.
         *
         * To prove:
         * If you changed the value of x that is initialized in y,
         * if y is printed it shows the same value as before you change
         * x.
         */
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        /**
         * HERE: (REFERENCE)
         * new Point() - holds the address of point1 allocated in memory
         * so if you refer point1 to point2 and change the value, everyone
         * is affected because they hold the same reference address.
         *
         * Meaning they don't hold the store the actual values.
         * Reference is not independent.
         */

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 12;
        System.out.println(point2);


    }
}
