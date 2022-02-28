package com.teksystem;

public class CoreJavaLoops {

    public static void problem1(){
        for(int i = 0; i < 10; i++){
            System.out.println(i+1);
        }
    }

    public static void problem2(){
        int x = 0;
        while(x <= 100){
            System.out.println(x);
            x+=10;
        }
    }

    public static void problem3(){
        int x = 0;
        do{
            System.out.println(x+1);
            x++;
        }while(x < 10);
    }

    public static void problem4(){
        for(int i = 0; i < 101; i++){
            if (i >= 25 && i <= 75){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void problem5(){
        for (int i = 0; i < 100; i++){
            if (i % 5 == 0){
                System.out.println(i);
            }
            else if(i >= 50){
                break;
            }
        }
    }

    public static void problem6(){
        for(int i = 1; i < 3; i++){
            System.out.println("Week: " + i);
            for(int k = 1; k < 8; k++){
                System.out.println("Day " + k);
            }
        }
    }

    //problem 7
//    public static void problem7(){
//        for(int i = 10; i < 201; i++){
//            if (i)
//            if(i % 11 == 0){
//                System.out.println(i);
//            }
//            else if (i == 101){
//                System.out.println(i);
//            }
//        }
//    }

    public static void problem8(){
        int x = 0;
        int y = 0;
        int z = 0;
        while(z <= 51){
            System.out.println(z);
            if (y == 0 ){
                y = 1;
            }
            z = x + y;
            x = y;
            y = z;

        }
    }

    public static void problem9(){
        for(int i = 0; i < 3; i++){
            for (int k = 0; k < 3; k++){
                System.out.println("Outer Loop i: " + i + " Inner Loop k: " + k);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Problem 1: ");
        problem1();
        System.out.println("\nProblem 2: ");
        problem2();
        System.out.println("\nProblem 3: ");
        problem3();
        System.out.println("\nProblem 4: ");
        problem4();
        System.out.println("\nProblem 5: ");
        problem5();
        System.out.println("\nProblem 6: ");
        problem6();
//        System.out.println("\nProblem 7: ");
//        problem7();
        System.out.println("\nProblem 8: ");
        problem8();
        System.out.println("\nProblem 9: ");
        problem9();
    }
}
