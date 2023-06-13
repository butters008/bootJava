package com.butterfield.UdemyJavaMC.S7_OOP_Part1;

//Going to treat this as a "Car object"
public class OOP_Basic {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    //Constructors
    public OOP_Basic(){} //This should not have errored, should have empty constructor by default - IDK

    public OOP_Basic(String make, String model, String color){
        this.make = make;
        this.model = model;
        this.color = color;
    }

    //Getters and Setters
    public String getMake() {

        /**
         * This is what he did, good to keep note of incase I need to think outside of the box
         *
         *         if (make == null) make = "Unknown";
         *         String lowercaseMake = make.toLowerCase();
         *         switch (lowercaseMake) {
         *             case "holden", "porsche", "tesla" -> this.make = make;
         *             default -> {
         *                 this.make = "Unsupported ";
         *             }
         *         }
         */

        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    //This could have been auto generated as a ToString()
    public void describeCar(){
        System.out.println(doors + "-Doors\n " + make + "-make\n " + color + "-color\n " + model + "-model\n " + convertible + "-convertible\n");
    }
}
