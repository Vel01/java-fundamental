package com.austria.language.masteral.ab_control_flow.project;

import java.util.Scanner;

public class Main {

    /*
    Write a program that outputs the string representation of numbers from 1 to n.

    But for multiples of three it should output “Fizz” instead of the number and for
    the multiples of five output “Buzz”. For numbers which are multiples of both three
    and five output “FizzBuzz”.

       IF input is divisible by 3
            PRINT "Fizz"
       ELSE IF input is divisible by 5
            PRINT "Buzz"
       ELSE IF input is divisible by 3 and 5
            PRINT "FizzBuzz"
       ELSE
            PRINT input
     */

    private static final Scanner getInput = new Scanner(System.in);

    public static void main(String[] args) {

        final byte DIVISIBLE = 0;
        System.out.print("Number: ");
        int input = getInput.nextInt();
        if ((input % 3) == DIVISIBLE && (input % 5) == DIVISIBLE) {
            System.out.println("FizzBuzz");
        } else if ((input % 3) == DIVISIBLE) {
            System.out.println("Fizz");
        } else if ((input % 5) == DIVISIBLE) {
            System.out.println("Fuzz");
        } else {
            System.out.println(input);
        }


    }
}
