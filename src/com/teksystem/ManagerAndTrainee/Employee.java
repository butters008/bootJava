package com.teksystem.ManagerAndTrainee;

public class Employee {
    private long employeeID;
    private String employeeName;
    private String emmployeeAddress;
    private long employeePhone;
    private double basicSalary;
    private double specialAllowance = 250.80;
    private double hra = 1000.50;

    public Employee(long employeeID, String employeeName, String emmployeeAddress, long employeePhone) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.emmployeeAddress = emmployeeAddress;
        this.employeePhone = employeePhone;
    }

    public double getBasicSalary(){
        return this.basicSalary;
    }
    public void setBasicSalary(double s){
        basicSalary = s;
    }

    public double calcSalary(){
        return basicSalary + (basicSalary * specialAllowance/100D) + (basicSalary * hra/100D);
    }

    public double calcTransportAllowance(){
        return 10D*basicSalary/100D;
    }
}
