package com.butterfield.UdemyJavaMC.S7_OOP_Part1;

public class OOP_Inheritance_Parent {
    //Changed this to protected, so that any class within the same package can access this variable
    //This is a form of encapsulation
    protected String type;
    private String size;
    private double weight;

    public OOP_Inheritance_Parent() {}

    public OOP_Inheritance_Parent(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "OOP_Inheritance{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void noise(){
        System.out.println(type + " makes some kind of noise");
    }
}
