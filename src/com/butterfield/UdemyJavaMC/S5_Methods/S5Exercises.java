package com.butterfield.UdemyJavaMC.S5_Methods;

public class S5Exercises {
    public static void main(String[] args) {
        PosNegZero(5);
    }

    public static void PosNegZero(int test){
        if(test > 0){
            System.out.println("Positive");
        }
        else if(test < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }

    public long toMilesPerHour(double kilometers){
        if(kilometers < 0){
            return -1;
        }
        else{
            return 1;
        }
    }
}
