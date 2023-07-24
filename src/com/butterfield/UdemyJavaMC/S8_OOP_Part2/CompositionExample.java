package com.butterfield.UdemyJavaMC.S8_OOP_Part2;

import com.teksystem.cafe.Product;

public class CompositionExample {
    private String model;
    private String manfacturer;
    private int width;
    private int height;
    private int depth;

    public CompositionExample(String model, String manfacturer) {
        this.model = model;
        this.manfacturer = manfacturer;
    }
}

class Monitor extends CompositionExample {

    private int size;
    private String resolution;

    public Monitor(String model, String manfacturer) {
        super(model, manfacturer);
    }

    public Monitor(String model, String manfacturer, int size, String resolution) {
        super(model, manfacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format("Drawing pixel at %d,%d in color %s ", x, y, color));
    }
}

class Motherboard extends CompositionExample {

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manfacturer) {
        super(model, manfacturer);
    }

    public Motherboard(String model, String manfacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manfacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadPrograms(String programName){
        System.out.println("Program " + programName + " is now loading... ");
    }
}

class ComputerCase extends CompositionExample {

    private String powerSupply;

    public ComputerCase(String model, String manfacturer) {
        super(model, manfacturer);
    }

    public ComputerCase(String model, String manfacturer, String powerSupply) {
        super(model, manfacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
