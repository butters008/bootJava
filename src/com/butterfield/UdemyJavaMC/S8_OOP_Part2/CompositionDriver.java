package com.butterfield.UdemyJavaMC.S8_OOP_Part2;

public class CompositionDriver {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("32 inch dream", "Mine", 32, "1920 x 1080");
        Motherboard theMotherboard = new Motherboard("mani", "factory", 4, 8, "Current");

        Composition_BuildIt_Example computerBuild = new Composition_BuildIt_Example("2022", "Butters", theCase, theMonitor, theMotherboard);

//        computerBuild.getMonitor().drawPixelAt(10, 10, "red");
//        computerBuild.getMotherboard().loadPrograms("Windows");
//        computerBuild.getCompterCase().pressPowerButton();
        computerBuild.powerUp();

    }
}
