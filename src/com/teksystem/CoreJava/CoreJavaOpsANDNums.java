package com.teksystem.CoreJava;

public class CoreJavaOpsANDNums {

//    Write the following integers in binary notation. Do not use any Java functions or online conversion
//    applications to calculate the answer as this will hinder the learning process
//    and your understanding of the concept. However, you may check your answers using Java methods.

    //
    /* Here are the worked out numbers converted to binary
    *  1 = 0001
    *  8 = 1000
    *  33 = 100001
    *  78 = 1001110
    *  787 = 1100010011
    *  33,987 = 1000 0100 1100 0011
    *
    * Converted Binary to Decimal
    *   0010 = 2
        1001 = 9
        0011 0100 = 52
        0111 0010 = 114
        0010 0001 1111 = 543
        0010 1100 0110 0111 = 11,367
    *
    * */

    public static void problem3(int y){
        int x = y;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x << 1));
    }

    public static void problem4(int y){
        int x = y;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x >> 2));
    }

    public static void problem5(){
        int x, y, z;
        x = 7;
        y = 17;
        z = x&y;
        System.out.println("&: "+ z);
        z = x|y;
        System.out.println("|: " + z);
    }

    public static void problem6(int num){
        int x = num;
        System.out.println(x);
        x++;
        System.out.println(x);
    }

    public static void problem7(){
        int x = 5; //for method1
        int y = 5; //for method2
        int z = 5; //for method3

        System.out.println("Postfix Increment");
        for(int i = 0; i < 3; i++ ){
            x++;
            System.out.println(x);

        }

        System.out.println("Prefix Increment");
        for(int i = 0; i < 3; i++ ){
            ++y;
            System.out.println(y);

        }

        System.out.println("Adding one to self");
        for(int i = 0; i < 3; i++ ){
            z += 1;
            System.out.println(z);
        }
    }

    public static void problem8(){
        int x = 5;
        int y = 8;

        int sum = ++x + y;
        System.out.println(sum);

        x = 5;
        sum = x++ + y;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        System.out.println("Problem 3:");
        problem3(3);
        System.out.println();
        problem3(9);
        System.out.println();
        problem3(17);
        System.out.println();
        problem3(88);

        System.out.println("\nProblem 4:");
        problem4(250);
        System.out.println();
        problem4(225);
        System.out.println();
        problem4(1555);
        System.out.println();
        problem4(32456);

        System.out.println("\nProblem 5:");
        problem5();

        System.out.println("\nProblem 6:");
        problem6(6);

        System.out.println("\nProblem 7:");
        problem7();

        System.out.println("\nProblem 8:");
        problem8();


    }
}
