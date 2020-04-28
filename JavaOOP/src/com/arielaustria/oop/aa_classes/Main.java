package com.arielaustria.oop.aa_classes;

public class Main {

    /**
     * Class and Object
     * <p>
     * Class - A blueprint for creating objects
     * Attributes - Fields
     * Behaviours - Methods
     * Object - An instance/example of a class
     * <p>
     * Class TV
     * State - on/off, currentChannel, currentVolume
     * Behaviour - turnOn/Off, changeChannel, increase/decrease volume
     */

    public static void main(String[] args) {

        //textBoxOne is an example of this TextBox class.
        //Using var keyword is letting the java compiler determine the type of this variable base on the
        //initialized value.
        var textBoxOne = new TextBox();//textBoxOne is a type of TextBox
        textBoxOne.setText("Box 1");
        System.out.println(textBoxOne.text.toUpperCase());

        var textBoxTwo = new TextBox();
        textBoxTwo.setText("Box 2");
        System.out.println(textBoxTwo.text);

        /*
            Memory Allocation
            Memory Area:
            Heap - Stores objects
            Stack - Primitives and short-lived variables

            Object variable stores reference/address of an object on the heap.
            Primitive-types when declared an integer that is stored on the stack and the value
            that we have on that variable will be stored in that memory location.
         */

        //both are referencing the same object
        var textBoxThree = textBoxOne;
        textBoxThree.setText("Hello, World!");
        System.out.println(textBoxThree.text);


        /**
         * Memory De-allocation
         * Java will automatically take care of de-allocation
         * When exit in a method java run time immediately removed
         * all the variables that are stored on the stack.
         *
         * Garbage Collection
         * If an object is unused for a certain period of time that process
         * is going to automatically removed that object on the heap.
         */

    }

}
