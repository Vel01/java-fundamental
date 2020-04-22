package com.austria.language.masteral.ac_strings;

public class Main {

    public static void main(String[] args) {

        /**
         * Strings are reference in java
         * Strings are immutable, you cannot changed the value
         */
        String message = "  Hello, World!" + "!!";
        //Useful methods in String class
        //message.endsWith("!!")
        //message.startsWith("!!")
        //message.length()
        //message.indexOf("H"))
        //message.replace("!", "*"))
        //message.toLowerCase()
        //message.toUpperCase()
        //message.trim()
        System.out.println(message.trim());
        System.out.println(message);//original value

    }
}
