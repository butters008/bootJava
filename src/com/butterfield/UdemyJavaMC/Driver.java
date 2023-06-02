package com.butterfield.UdemyJavaMC;

public class Driver {
    public static void main(String[] args) {
        SpeedConverter speedConverter = new SpeedConverter();

        long speed = speedConverter.toMilesPerHour(4);
        speedConverter.printConversion(speed);
    }
}
