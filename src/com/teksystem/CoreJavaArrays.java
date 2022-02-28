package com.teksystem;

import java.util.Arrays;

public class CoreJavaArrays {

    public static void problem1(){
        int[] arr = {1, 2, 3};
        for(int i =  0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void problem2(){
        int[] arr = {13, 5, 7, 68, 2};
        for(int i =  0; i < arr.length; i++){
            if(i == arr.length/2){
                System.out.println(arr[i]);
            }
        }
    }

    public static void problem3(){
        String[] arr = {"Red", "Green", "Blue", "Yellow"};
        System.out.println(arr.length);
        String[] arrTemp = arr.clone();
        System.out.println(Arrays.toString(arrTemp));

    }

    public static void problem4(){
        int[] arr = {2, 4, 1, 3, 7};
        int index = arr.length;
        int index4 = 5;
        int index3 = 0;
        int index2 = arr.length-1;
//        System.out.println(arr[index]); //Spits out error of out of bounds
        System.out.println(arr[index2]);
        System.out.println(arr[index3]);
//        System.out.println(arr[index4]); //Spits out error of out of bounds
    }

    public static void problem5(){
        int[] arr = {2, 4, 1, 3, 7};
        for(int i = 0; i < arr.length; i++){
            System.out.println("\ni before assigned to element " + i);
            System.out.println("Array Element: "+arr[i]);
            i = arr[i];
            System.out.println("i assigned to element " + i);

        }
    }

    public static void problem6(){
        int[] arr = {2, 4, 1, 3, 7};
        for(int i = 0; i < arr.length; i++){
            System.out.println("Array Element: "+arr[i]*2);
        }
    }

    public static void problem7(){
        int[] arr = {2, 4, 1, 3, 7};
        for(int i = 0; i < arr.length; i++){
            if (i == arr.length/2)
                continue;
            System.out.println("Array Element: "+arr[i]*2);
        }
    }

    public static void problem8(){

        String[] arr = {"Red", "Green", "Blue", "Yellow", "tommy"};

        //I don't think that this is how you wanted it done.....but it would pass the test case
//        String x = arr[0];
//        int arrayIndex = arr.length/2;
//        String y = arr[arrayIndex];
//
//        for(int i = 0; i < arr.length; i++){
//            if(i == 0)
//                arr[i] = y;
//            if (i == arr.length/2)
//                arr[i] = x;
//        }

        String x1, x2;
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                x1 = arr[i];
                for (int k = 0; k < arr.length; k++){
                    if(k == arr.length/2){
                        x2 = arr[k];
                        arr[k] = x1;
                        arr[0] = x2;
                        break;
                    }
                }//end of inner
            }//end of if
        }//end of outter

        System.out.println(Arrays.toString(arr));
    }

    public static void problem9(){
        int[] arr = {4, 2, 9, 13, 1, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void problem10(){
        Object[] arr = {4, "text", "job", "dumb", 4.4};
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println("Problem 1 ");
        problem1();
        System.out.println("\nProblem 2 ");
        problem2();
        System.out.println("\nProblem 3 ");
        problem3();
        System.out.println("\nProblem 4 ");
        problem4();
        System.out.println("\nProblem 5 ");
        problem5();
        System.out.println("\nProblem 6 ");
        problem6();
        System.out.println("\nProblem 7 ");
        problem7();
        System.out.println("\nProblem 8 ");
        problem8();
        System.out.println("\nProblem 9 ");
        problem9();
        System.out.println("\nProblem 10 ");
        problem10();

    }
}
