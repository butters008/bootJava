package com.teksystem;

import java.util.Scanner;

public class CoreJavaConditional {

//  Write a program that declares 1 integer variable x, and then assigns 7 to it.
//  Write an if statement to print out “Less than 10” if x is less than 10.
//  Change x to equal 15 and notice the result (console should not display anything).
    public static void problem1(int var1){
        int x = var1;
        if (x < 10){
            System.out.println("X is less than 10");
        }
    }

//  Write a program that declares 1 integer variable x, and then assigns 7 to it.
//  Write an if-else statement that prints out “Less than 10” if x is less than 10 and “Greater than 10”
//  if x is greater than 10. Change x to 15 and notice the result.
    public static void problem2(int var1){
        int x = var1;
        if (x < 10){
            System.out.println("X is less than 10");
        }
        else if (x > 10){
            System.out.println("x is greater than 10");
        }

    }

//    Write a program that declares 1 integer variable x, and then assigns 15 to it.
//    Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10,
//    “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20”
//    if x is greater than or equal to 20. Change x to 50 and notice the result
    public static void problem3(){
        int x = 15;
        if (x < 10){
            System.out.println("X is less than 10");
        }
        else if (x >= 10 && x <= 20){
            System.out.println("x is between 10 and 20");
        }else{
            System.out.println("x is greater than 20");
        }
    }

//    Write a program that declares 1 integer variable x, and then assigns 15 to it.
//    Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20
//    and prints “In range” if between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result
    public static void problem4(int var1){
        int x = var1;
        if (x <= 20 && x >= 10){
            System.out.println("x in range");
        }
        else{
            System.out.println("x is out of range");
        }
    }

//    Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
//A: 90-100 - B: 80-89 - C: 70-79 - D: 60-69 - F: <60
//Use the Scanner class to accept a number score from the user to determine the letter grade.
// Print out “Score out of range.” if the score is less than 0 or greater than 100.
    public static void problem5(int var1){
        if (var1 < 60){
            System.out.println("F");
        }
        else if (var1 < 70){
            System.out.println("D");
        }
        else if (var1 < 80){
            System.out.println("C");
        }
        else if (var1 < 90){
            System.out.println("B");
        }
        else if (var1 <= 100){
            System.out.println("A");
        }
        else{
            System.out.println("Out of bounds");
        }
    }

//    Write a program that accepts an integer between 1 and 7 from the user.
//    Use a switch statement to print out the corresponding weekday.
//    Print “Out of range” if the number is less than 1 or greater than 7.
//    Don’t forget to include “break” statements in each of your cases.
    public static void problem6(int x){
        switch(x){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of Bounds");
        }
    }


    public static void main(String[] args) {
        problem1(7);
        problem1(15);
        problem2(7);
        problem2(15);
        problem3();
        problem4(15);
        problem4(5);
        //Testing the conditions w/o scanner
        problem5(60);
        problem5(70);
        problem5(80);
        problem5(90);
        problem5(50);
        problem5(110);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter in a grade");
        problem5(scan.nextInt());

        problem6(1);
        problem6(2);
        problem6(3);
        problem6(4);
        problem6(5);
        problem6(6);
        problem6(7);
        problem6(8);


    }
}
