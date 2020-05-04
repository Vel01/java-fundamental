package com.arielaustria.oop.inheritance.casting;

public class Main {

    public static void main(String[] args) {

        /*
            Upcasting
            Casting an object to one of its super types.

            Downcasting
            Casting an object to one of its sub types.

         */

        UIControl control = new UIControl(true);
        UIControl textBox = new TextBox();
//        show(control);
//        textBox. cant access members of textbox using upcasting to its parent
        show(textBox);//upcasting using is-a-relationship (textbox is a uicontrol)

    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {// to avoid ClassCastException check if parameter is an instance of a TextBox not a UIControl object
            TextBox textBox = (TextBox) control;//downcasting
            textBox.setText("Hello, World!");
            System.out.println(control);
        }
    }

}
