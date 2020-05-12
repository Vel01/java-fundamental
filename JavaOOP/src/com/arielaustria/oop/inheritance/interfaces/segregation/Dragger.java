package com.arielaustria.oop.inheritance.interfaces.segregation;

public class Dragger {

    public void drag(UIWidget widget) {
        widget.drag();
        System.out.println("Dragging done.");
    }
}
