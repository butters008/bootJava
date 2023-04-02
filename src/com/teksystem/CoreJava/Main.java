package com.teksystem.CoreJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.random;

public class Main {

    //This is from slide number 44 - Condictional Slide  -------------------------------------------
    public static String bmi(int weightKG, int heightM){
        int result =0;
        result = weightKG/(heightM*heightM);

        if(result < 18.5){
            return "Underweight - " + result;
        }
        if(result >= 18.5 && result < 25){
            return "Normal - " + result;
        }
        if(result >=25 && result < 30){
            return "Overweight - " + result;
        }
        else {
            return "Obese - " + result;
        }

    }
// END OF 44 --------------------------------------------------------------------------------------------------------

    //Side number 63 - conditional slides ------------------------------------------------------------------------------
    public static String computeTaxes(String filingStatus, int income){
        double result = 0;
        String message = null;
        double tax;

        switch(filingStatus){
            case "Single":
                tax = getTaxRateSingle(income);
                result = (tax * income);
                message = "Your Income " + income + " will result in " +  result + " for taxes";
                break;
            case "Married":
                tax = getTaxRateMFJ(income);
                result = (tax * income);
                message = "Your Income " + income + " will result in " +  result + " for taxes";
                break;
            case "Married Filing Seperate":
                tax = getTaxRateMFS(income);
                result = (tax * income);
                message = "Your Income " + income + " will result in " +  result + " for taxes";
                break;
            case "Head of House":
                tax = getTaxRateHoH(income);
                result = (tax * income);
                message = "Your Income " + income + " will result in " +  result + " for taxes";
                break;
            default:
                 message = "Invalid Option";
        }

        return message;
    }

    // Syntax spaced differently to save space
    public static double getTaxRateSingle(int income){
        double result;
        if(income >= 0 && income <= 8350){ result = .1; }
        else if(income >= 8350 && income <= 33950){ result = .15; }
        else if(income >= 33950 && income <= 82250){ result = .25; }
        else if(income >= 82251 && income <= 171520){ result = .28; }
        else if(income >= 171521 && income <= 3725950){ result = .33; }
        else{ result = .35; }
        return result;
    }

    public static double getTaxRateMFJ(int income){
        double result;
        if(income >= 0 && income <= 16700){ result = .1; }
        else if(income >= 16701 && income <= 67000){ result = .15; }
        else if(income >= 67001 && income <= 137050){ result = .25; }
        else if(income >= 137051 && income <= 171520){ result = .28; }
        else if(income >= 171521 && income <= 3725950){ result = .33; }
        else{ result = .35; }
        return result;
    }

    public static double getTaxRateMFS(int income){
        double result;
        if(income >= 0 && income <= 8350) { result = .1;}
        else if(income >= 8351 && income <= 33950){ result = .15; }
        else if(income >= 33951 && income <= 68525){ result = .25; }
        else if(income >= 68526 && income <= 104425){ result = .28; }
        else if(income >= 104426 && income <= 186475){ result = .33; }
        else{ result = .35; }
        return result;
    }

    public static double getTaxRateHoH(int income){
        double result;
        if(income >= 0 && income <= 11950) { result = .1;}
        else if(income >= 11951 && income <= 44500){ result = .15; }
        else if(income >= 44501 && income <= 117450){ result = .25; }
        else if(income >= 117451 && income <= 190200){ result = .28; }
        else if(income >= 190201 && income <= 372950){ result = .33; }
        else{ result = .35; }
        return result;
    }

//    END OF 63 -------------------------------------------------------------------------------------------------------


//    Side 22, Loops Slides -------------------------------------------------------------------------------------------
    public static void guessTheNumber(){
        int gameNumber = (int)(Math.random() * 101);
        int guessNumber = -1;
        Scanner scanGame = new Scanner(System.in);
        while(gameNumber != guessNumber){
            System.out.println("Please input a number from 0 - 100 ");
            guessNumber = scanGame.nextInt();
            if(gameNumber == guessNumber) {
                System.out.println("You Won");
            }
            else if(gameNumber > guessNumber){
                System.out.println("Guess higher");
                System.out.println(gameNumber); //Debugging purpose
            }
            else if(gameNumber < guessNumber){
                System.out.println("Guess lower");
                System.out.println(gameNumber); //Debugging purpose
            }
            else{
                System.out.println("Out of Bounds guess");
            }
        }
        System.out.println("Exited game loop");
    }
//    END OF 22 ------------------------------------------------------------------------------------------------------

//    Slide 61 , Loop Slides ------------------------------------------------------------------------------------------
    public static void multiplicationTable(int x){
        for(int i = 0; i < x;  i++){
            for(int k = 0; k <= x; k++){
                if (k == x){
                    System.out.print("\n");
                }else{
                    System.out.printf(String.format("%4d", ((k+1) * (i+1))));
//                    System.out.print(((k+1) * (i+1)) + "\t " + "(i = " + i + " )" + " " + "(k = " + k + " )\t");
                }

            }
        }
    }
//    END OF 61 --------------------------------------------------------------------------------------------------------

//    Question 62 GCD --------------------------------------------------------------------------------------------------
//    Got an example from: "https://www.baeldung.com/java-greatest-common-divisor"
    public static void gcd(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
//    END 62 -----------------------------------------------------------------------------------------------------------

//    Question 63 Predict Tuition Future ------------------------------------------------------------------------------
    public static void predictFutureTuition(int x){
        int years = 0;
        int total = x;
        while (total <= (x*2)){
            years++;
            total *= 1.07;
        }
        System.out.println("It takes " + years + " for " + x + " to now equal " + total);
    }
    //    END 63 -------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        // Conditionals -----------------------------------------------------------------------------
//        System.out.println("This is from slide 44 on conidtional");
//        System.out.println(bmi(350, 3));
//        System.out.println(bmi(250, 3));
//        System.out.println(bmi(200, 3));
//        System.out.println(bmi(150, 3));
//
//        System.out.println("\n\nThis is from slide 63 on conidtional");
//        System.out.println(computeTaxes("Single", 8000));
//        System.out.println(computeTaxes("Married", 174000));
//        System.out.println(computeTaxes("Married Filing Seperate", 143221));
//        System.out.println(computeTaxes("Head of House", 212323));
//        System.out.println(computeTaxes("Opps", 212323));
        // Conditionals -----------------------------------------------------------------------------

        // Loops ------------------------------------------------------------------------------------
//        System.out.println("\n\nThis is from slide 22 on Loops");
//        guessTheNumber();
//        System.out.println("\n\nThis is from slide 61 on Loops");
//        multiplicationTable(12);
//        gcd(10, 5);
//        predictFutureTuition(10000);
        // Loops ------------------------------------------------------------------------------------



    }//END of MAIN

//    private static void evilQuestion10(String s) {
//        System.out.println(s);
//    }
//    private static void evilQuestion10(int i) {
//        System.out.println(i);
//    }


}// End of Class














//        print out csv into java using printf in this format ex
//        Course Code: xxxx     |Course Name: xxxxxxxxxxxx      |Course Instructor: xxxxxx xxxxxx       |
//        Course Code: xxxx     |Course Name: xxxxxxxxxxxx      |Course Instructor: xxxxxx xxxxxx       |
//        Course Code: xxxx     |Course Name: xxxxxxxxxxxx      |Course Instructor: xxxxxx xxxxxx       |
//        Course Code: xxxx     |Course Name: xxxxxxxxxxxx      |Course Instructor: xxxxxx xxxxxx       |
//        File file = new File("courses.txt");
//        if(file.exists()){
//            System.out.println("File Exists " + file.exists());
//Not sure why the try is not working
//            try {
//                Scanner input = new Scanner(System.in);
//                while (input.hasNextLine()) {
//                    String[] names = input.nextLine().split(",");
//                    System.out.printf("Course Code: %s|Course Name: %s|Course Instructor: %s", names[0], names[1], names[2]);
//                }
//            } catch(FileNotFoundException e){
//                e.printStackTrace();
//            }

//        }else{
//            System.out.println("If does NOT exist: " + file.exists());
//        }
//        int x = 5;

//___________________________________________________________________________________________________________________________________________

//        System.out.println("Figuring out the question 10 gotcha");
//        String one = "This";
//        String two = "is";
//        String three = "poop";
//        int i1 = 1;
//        int i2 = 2;
//        int i3 = 3;
//
//        evilQuestion10(one+two+three);
//        evilQuestion10(i1+i2+i3);