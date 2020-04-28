package com.arielaustria.oop.aa_classes.abstraction.coupling.reduce;

public class Main {

    public static void main(String[] args) {

        var browser = new Browser();
        browser.navigate("facebook");

        //These are unnecessary in our application
        //They are polluting the interface of main class
//        browser.findIpAddress("");
//        browser.sendHttpRequest("");

    }
}
