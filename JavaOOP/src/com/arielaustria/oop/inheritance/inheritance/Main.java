package com.arielaustria.oop.inheritance.inheritance;

public class Main  {

    public static void main(String[] args) {

        /*
            TextBox class inherit the member of its parent class UIControl.
         */
        TextBox control = new TextBox();
        control.enable();
        System.out.println(control.isEnabled());

    }

}
