package com.austria.language.masteral.aj_readingin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();//scanner.next();//scanner.nextByte();
        System.out.println("You are " + name);

    }
}
