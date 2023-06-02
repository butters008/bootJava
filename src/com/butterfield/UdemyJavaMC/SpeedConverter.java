package com.butterfield.UdemyJavaMC;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        long result;
        if(kilometersPerHour >= 0){
            result = (long)(1 * (1.69 * kilometersPerHour));
            return result;
        }
        return -1;
    }

    public static void printConversion(double result){
        System.out.println(Math.round(result));
    }
    public SpeedConverter() {
    }
}


