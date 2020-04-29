package com.arielaustria.oop.aa_classes.constructor;


public class Main {
    /*
        Constructor
        Is a special method to initialized field to there default value.
     */
    public static void main(String[] args) {

        var employee = new Employee(50_000, 20);
//        employee.setBaseSalary(50_000);
//        employee.setHourlyRate(20);

        int wage = employee.calculateWage(10);

    }
}
