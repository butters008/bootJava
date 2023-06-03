package com.butterfield.UdemyJavaMC.S4_IntelliJBasics;

public class HelloWorldPart2 {
    public static void main(String[] args) {
        System.out.println("Hello World...again... (-_-) ");

        // If else statement
        boolean isAlien = false;
        if(!isAlien){
            System.out.println("Is not an alien (T_T) ");
        }

        // Logical AND
        int testScore = 100;
        if(!isAlien && testScore > 1){
            System.out.println("I am human and not number 1! (T_T) ");
        }

        // Logical OR
        if(isAlien || testScore > 1){
            System.out.println("What happened (>.<) ");
        }

        /**
         *  = is assignment
         *  == is a logical check, to make sure if left equals right. (basic explanation
         */

        //Ternary Operator
        /**
         * boolean varName = incomingValue == ("The check") ? value1 : value2;
         *
         * The incoming value, makeOfCar is being brought into this Operator and we are checking it as a bool
         * We are checking if makeOfCar == Ford,
         * If the value does equal makeOfCar, we assign it value1, if not value2
         *
         * This can be shown by swapping true and false.
         */
        String makeOfCar = "Ford";
        boolean isDomestic = makeOfCar == "Ford" ? true : false ;

        if(isDomestic){
            System.out.println("America!");
        }
    }
}
