package com.arielaustria.oop.aa_classes;

public class TextBox {

    //Field
    public String text = "";//initialized default value to avoid null.

    //Methods
    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }


}
