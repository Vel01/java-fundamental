package com.arielaustria.oop.polymorphism.finals;

public class Main {

    public static void main(String[] args) {
        /*
            Final Classes
            Use it in situation where we are 100% sure about the implementation
            of the class, and to prevent other classes from extending that class

            Final Method
            Meaning you cannot override a method
         */

        UIControl[] controls = { new TextBox(), new CheckBox()};
        for (UIControl control : controls) {
            control.render();
        }
    }

}
