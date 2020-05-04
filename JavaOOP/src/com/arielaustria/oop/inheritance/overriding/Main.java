package com.arielaustria.oop.inheritance.overriding;

public class Main {

    public static void main(String[] args) {

        /*
            Method Overriding means changing the implementation of the
            inherited member method of the subclass.
         */

        TextBox control = new TextBox();
        control.setText("Hello, World!");
        System.out.println(control);

    }

}
