package com.austria.language.masteral.aa_types.ad_arrays.multi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /**
         * Multi-dimensional array
         */
        // 2 x 3 matrix
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};//new int[2][3];
//        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
    }
}
