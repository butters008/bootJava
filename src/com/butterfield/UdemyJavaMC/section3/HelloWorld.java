package com.butterfield.UdemyJavaMC.section3;

public class HelloWorld {
    public static void main(String[] args) {

        /**
         * I am not going to make multiple classes for section 3 since this is all basic information.
         *
         * notes
         * -Jshell in terminal
         *  |-> To exit, /exit
         *
         *  You can put in _ in literal numbers ex int test = 4_444 (4,444)
         */

        //printing out to build/terminal
        System.out.println("Hello World - He used JShell");

        //Variables
        int myFirstVar = 10;
        int mySecondVar = 10 + 5;
        int myThirdVar = (10 * 2) + (10 + 5);
        System.out.println(myFirstVar);
        System.out.println(mySecondVar);
        System.out.println(myThirdVar + "\n");

        //Expressions
        myFirstVar = (10 * 2) + (10 + 5);
        mySecondVar = 12;
        myThirdVar = 6;

        System.out.println(myFirstVar);
        System.out.println(mySecondVar);
        System.out.println(myThirdVar);

        int total = myFirstVar + mySecondVar + myThirdVar;
        System.out.println("total " + total);

        myThirdVar =  myFirstVar * 2;
        total = myFirstVar + mySecondVar + myThirdVar;
        System.out.println("total " + total + "\n");

        //Primitive Types - This is going to hold everything in the next 4 or 5 videos
        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;

        String printOutIntValue = "Interger Values (Min - Max) => (" + intMinValue + " - " + intMaxValue + ")";
        System.out.println(printOutIntValue);

        //Primitive Types - Example of Overflow and underflow
        //If you assign a literal number bigger than value, it will error out
        int bustedMaxValue = intMaxValue + 1;
        System.out.println("Busted Max value " + bustedMaxValue);

        int bustedMinValue = intMinValue - 1;
        System.out.println("Busted Min value " + bustedMinValue);


    }
}
