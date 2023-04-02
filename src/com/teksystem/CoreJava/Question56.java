package com.teksystem.CoreJava;
/*
*
* Combing Slide 56 and Slide 52 onto on class file so we are not making multiple files
* */

public class Question56 {

    public static String convertTime(int seconds){
        String result = "";
//        int minutes, days, leftoverSeconds;
        //Day consists of 24 hours which is 1440 minutes which is 86,400
//        leftoverSeconds = (days = 86400/seconds);
        int sec = seconds % 60;
        int minutes = seconds % 3600 / 60;
        int hours = seconds % 86400 / 3600;
        int days = seconds / 86400;
        result = ("Total seconds " + seconds + " equates to Days: " + days + " Hours: " + hours + " Minutes: " + minutes + " Seconds " + sec);
        return result;
    }

    public static double converting(int fair){
        double result;
        double division = (5D/9D);
        result = division * (fair - 32);
        return result;
    }

    public static void main(String[] args) {
        double cel = converting(59);
        String s = String.format("The converted temp is %4.1f", cel);
        System.out.println(s);
        System.out.println(convertTime(8239210));

    }

}
