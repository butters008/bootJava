package com.teksystem.ManagerAndTrainee;

import com.teksystem.ManagerAndTrainee.Employee;

public class Manager extends Employee {
//    public Manager(long employeeID, String employeeName, String emmployeeAddress, long employeePhone) {
//        super(employeeID, employeeName, emmployeeAddress, employeePhone);
//    }

    public Manager(long employeeID, String employeeName, String emmployeeAddress, long employeePhone, double salary) {
        super(employeeID, employeeName, emmployeeAddress, employeePhone);
        setBasicSalary(salary);
    }

    @Override
    public double calcTransportAllowance() {
        double basicSalary = getBasicSalary();
        return 15* basicSalary /100.;
    }


}
