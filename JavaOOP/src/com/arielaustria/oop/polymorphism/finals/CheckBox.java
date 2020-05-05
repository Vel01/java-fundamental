package com.arielaustria.oop.polymorphism.finals;

public final class CheckBox extends UIControl {

    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }


}

//public class MyCheckBox extends CheckBox {} cannot extend final class