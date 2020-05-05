package com.arielaustria.oop.polymorphism.abstracts;

public class Main {

    public static void main(String[] args) {
        /*
            Abstract classes and methods
            Reason to Use
            1. We want to declare a class but not to instantiate it
            2. To provide common code to its subclasses
         */

        UIControl[] controls = { new TextBox(), new CheckBox()};
        for (UIControl control : controls) {
            control.render();
        }
    }

}
