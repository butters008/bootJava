package com.butterfield.UdemyJavaMC.S7_OOP_Part1;

public class Driver {
    public static void main(String[] args) {
        OOP_Basic car = new OOP_Basic();
        OOP_Basic car2 = new OOP_Basic("Ford", "Truck", "Blue");
        car2.describeCar();

        car.setColor("red");
        car.setConvertible(true);
        car.setDoors(2);
        car.setMake("Dodge");
        car.setModel("car");
        car.describeCar();

        OOP_Record oopR = new OOP_Record("Record", 1, "Programming");
        System.out.println(oopR);
        System.out.println(oopR + " taking " + oopR.classList());
    }
}
