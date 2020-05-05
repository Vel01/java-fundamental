package com.arielaustria.oop.polymorphism;

public class Main {

    public static void main(String[] args) {
        /*
            Poly means many and morph means form
            Polymorphism is a concept by which we can perform a single action in different ways
         */

        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (UIControl control : controls) {
            //algorithm without polymorphism
            // if control is TextBox
            //     renderTextBox
            // else if it is a CheckBox
            //     renderCheckBox

            //with polymorphism
            control.render(); // UIControl has two forms that render data.
        }

    }


}
