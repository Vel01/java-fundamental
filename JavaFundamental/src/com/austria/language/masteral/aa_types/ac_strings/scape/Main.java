package com.austria.language.masteral.aa_types.ac_strings.scape;

public class Main {

    public static void main(String[] args) {
        //Scape Sequence

        // c:\Windows\...
        String message = "Hello, \"World!\"";
        System.out.println(message);

        String directory = "\nc:\t\\Windows\\...";
        System.out.println(directory);
    }
}
