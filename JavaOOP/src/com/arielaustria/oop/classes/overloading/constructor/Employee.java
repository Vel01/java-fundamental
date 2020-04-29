package com.arielaustria.oop.classes.overloading.constructor;

//attributes and behaviours are encapsulated in a single object called Employee.
public class Employee {//blueprint

    //encapsulate or hide.
    private int baseSalary;
    private int hourlyRate;

    //Constructor
    public Employee(int baseSalary, int hourlyRate) {
        //requiring an initial value.
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    //Overloading constructor
    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }


    //Overloading
    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    public int calculateWage() {
        return calculateWage(0);
    }


    //Setters and Getters, and abstraction
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be zero or less.");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly Rate cannot be zero or less.");
        }
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

}
