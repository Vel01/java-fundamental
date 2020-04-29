package com.arielaustria.oop.classes.encapsulation.getset;

//attributes and behaviours are encapsulated in a single object called Employee.
public class Employee {//blueprint

    //encapsulate or hide.
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }


    //Setters and Getters
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be zero or less.");
        }
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly Rate cannot be zero or less.");
        }
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

}
