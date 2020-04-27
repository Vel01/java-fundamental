package com.austria.language.masteral.ab_control_flow.ag_while;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (i > 0) {
            System.out.println("Hello, World! " + i);
            i--;
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
