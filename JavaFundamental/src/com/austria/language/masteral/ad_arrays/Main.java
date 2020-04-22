package com.austria.language.masteral.ad_arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /**
         * Storing list of data
         * Arrays is a reference type
         * It has a fixed length.
         */
        int[] numbers = {2, 3, 4, 5, 1};// new int[5];
        System.out.println(numbers.length);
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[10] = 3; this throws an exceptions
//        System.out.println(numbers); print an calculated address
        Arrays.sort(numbers);//sort values
        System.out.println(Arrays.toString(numbers));

    }

}
