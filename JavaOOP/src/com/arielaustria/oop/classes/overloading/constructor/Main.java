package com.arielaustria.oop.classes.overloading.constructor;


public class Main {
    /*
        Overloading Method
        Creating different implementation of method but different parameters
     */
    public static void main(String[] args) {

        var employee = new Employee(50_000, 20);

        int wage = employee.calculateWage(10);
        System.out.println(wage);

    }
}
