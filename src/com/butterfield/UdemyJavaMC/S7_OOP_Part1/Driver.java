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

        OOP_Inheritance_Parent parent = new OOP_Inheritance_Parent("Cool Parent", "Big", 300);
        inheritanceTest(parent, "slow");

        OOP_Inheritance_Child child = new OOP_Inheritance_Child("Awesome Child", "little", 30);
        inheritanceTest(child, "fast");

        OOP_Inheritance_Child c2 = new OOP_Inheritance_Child("kid", 40);
        OOP_Inheritance_Child c3 = new OOP_Inheritance_Child("toddle", 20, "Big", "no tails");
        inheritanceTest(c2, "faster");
        inheritanceTest(c3, "fast");

        OOP_Inheritance_OtherChild other = new OOP_Inheritance_OtherChild("Goldie", .025, 2, 4);
        inheritanceTest(other, "fast");
    }

    public static void inheritanceTest(OOP_Inheritance_Parent parent, String speed){
        parent.noise();
        parent.move(speed);
        System.out.println(parent);
        System.out.println("\n---------\n");
    }
}
