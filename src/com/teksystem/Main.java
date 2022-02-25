package com.teksystem;

import java.util.Scanner;

import static java.lang.Math.floor;

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



    public static void main(String[] args) {
        System.out.println("This is from slide 44 on conidtional");
        System.out.println(bmi(350, 3));
        System.out.println(bmi(250, 3));
        System.out.println(bmi(200, 3));
        System.out.println(bmi(150, 3));

        System.out.println("\n\nThis is from slide 63 on conidtional");
        System.out.println(computeTaxes("Single", 8000));
        System.out.println(computeTaxes("Married", 174000));
        System.out.println(computeTaxes("Married Filing Seperate", 143221));
        System.out.println(computeTaxes("Head of House", 212323));
        System.out.println(computeTaxes("Opps", 212323));

    }//END of MAIN
}// End of Class


