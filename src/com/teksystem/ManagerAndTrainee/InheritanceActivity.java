package com.teksystem.ManagerAndTrainee;

public class InheritanceActivity {
    public static void main(String[] args) {
        Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);

        System.out.println("Manager total salary " + manager.calcSalary());
        System.out.println("Trainee total salary " + trainee.calcSalary());
        System.out.println("Trainee transport allowance: " + trainee.calcTransportAllowance());
        System.out.println("Manager transport allowance: " + manager.calcTransportAllowance());
    }
}
