package com.teksystem;

public class Trainee extends Employee{
    public Trainee(long employeeID, String employeeName, String emmployeeAddress, long employeePhone, double salaray) {
        super(employeeID, employeeName, emmployeeAddress, employeePhone);
        setBasicSalary(salaray);
    }
}
