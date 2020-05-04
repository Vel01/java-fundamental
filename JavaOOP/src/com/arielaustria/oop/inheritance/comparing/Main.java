package com.arielaustria.oop.inheritance.comparing;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

//        System.out.println(point1.equals(new TextBox()));// result ClassCastException
        System.out.println(point1.equals(point2));// comparing references
        //change implementation of equals to compare there values.
        System.out.println(point1.hashCode());// compared references
        System.out.println(point2.hashCode());// compared references

    }


}
