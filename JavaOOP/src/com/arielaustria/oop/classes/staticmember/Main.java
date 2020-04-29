package com.arielaustria.oop.classes.staticmember;


public class Main {

    /*
        Class can have 2 types of members
        Instance member - It belongs to object
        Static member - It belongs to a class

        When?
        Use instance variables when : Every variable has a different value for different object. E.g. name of student, roll number etc..
        Use static variables when : The value of the variable is independent of the objects (not unique for each object). E.g. number of students.
     */

    public static void main(String[] args) {

        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployee();
        int wage = employee.calculateWage(10);
        System.out.println(wage);

    }
}
