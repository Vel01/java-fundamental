package com.arielaustria.oop.encapsulation;

//attributes and behaviours are encapsulated in a single object called Employee.
public class Employee {//blueprint

    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

}
