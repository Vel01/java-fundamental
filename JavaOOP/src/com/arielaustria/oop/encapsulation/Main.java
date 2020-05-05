package com.arielaustria.oop.encapsulation;

public class Main {

    /*
        Encapsulation
        Bundle the data and methods that operate on the data
        in a single unit/object.
     */

    public static void main(String[] args) {

        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;

        int wage = employee.calculateWage(10);
        System.out.println(wage);

    }
}
