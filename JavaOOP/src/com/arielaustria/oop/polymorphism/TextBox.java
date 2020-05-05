package com.arielaustria.oop.polymorphism;

public class TextBox extends UIControl {

    private String text = "";

//    public TextBox() {//looking for value to pass to its parent
//        super(true);//value to pass to its parent
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

    @Override
    public String toString() {
        return text;
    }
}
