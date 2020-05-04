package com.arielaustria.oop.inheritance.inheritance.access;

public class TextBox extends UIControl {

    private String text = "";

    public TextBox() {//looking for value to pass to its parent
        super(true);//value to pass to its parent
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
