package com.butterfield.UdemyJavaMC.S8_OOP_Part2;

public class Composition_BuildIt_Example extends CompositionExample {
    private ComputerCase compterCase;
    private Monitor monitor;
    private Motherboard motherboard;


    public Composition_BuildIt_Example(String model, String manfacturer, ComputerCase compterCase, Monitor monitor, Motherboard motherboard) {
        super(model, manfacturer);
        this.compterCase = compterCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "Green");
    }

    public void powerUp(){
        compterCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getCompterCase(){
//        return compterCase;
//    }
//
//    public Motherboard getMotherboard(){
//        return motherboard;
//    }
//
//    public Monitor getMonitor(){
//        return monitor;
//    }

}
