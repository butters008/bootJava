package com.butterfield.UdemyJavaMC.S7_OOP_Part1;

public class OOP_Inheritance_OtherChild extends OOP_Inheritance_Parent{
    private int gills;
    private int fins;

    public OOP_Inheritance_OtherChild(String type,  double weight, int gills, int fins) {
        super(type,"small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("muscle Moving");
    }

    private void moveBackFin(){
        System.out.println("Back fin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFin();
        }
    }

    @Override
    public String toString() {
        return "OOP_Inheritance_OtherChild{" +
                "gills=" + gills +
                ", fins=" + fins +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }
}
