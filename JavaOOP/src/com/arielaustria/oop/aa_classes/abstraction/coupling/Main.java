package com.arielaustria.oop.aa_classes.abstraction.coupling;


public class Main {
    public static void main(String[] args) {
        /*
            Coupling
            The level of dependency between classes

            Layman's Term
            How much a class dependent upon or coupled the another
            class.

            The aim is to reduce the coupling.

         */

        var employee = new Employee();//Main is dependent on Employee class
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);

        int wage = employee.calculateWage(10);
        System.out.println(wage);


        //Abstracting class Employee hiding methods that are not
        //Required, making this interface simple with less complexity
        //Reducing coupling to the main method.
//        employee.getBaseSalary();
//        employee.getHourlyRate();

    }
}
