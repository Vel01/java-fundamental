package com.arielaustria.refactor;

import java.util.Scanner;

public class Validator {

    private Scanner getInput() {
        return new Scanner(System.in);
    }

    public int validator(String message, int minimum, int maximum, String error) {
        int input;
        while (true) {
            System.out.print(message);
            input = getInput().nextInt();

            if (input < minimum || input > maximum) {
                System.out.println(error);
                continue;
            }
            break;
        }
        return input;
    }

    public float validator(String message, byte minimum, byte maximum, String error) {
        float input;
        while (true) {
            System.out.print(message);
            input = getInput().nextFloat();

            if (input < minimum || input > maximum) {
                System.out.println(error);
                continue;
            }
            break;
        }
        return input;
    }

}
