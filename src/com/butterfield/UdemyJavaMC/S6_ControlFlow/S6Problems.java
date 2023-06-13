package com.butterfield.UdemyJavaMC.S6_ControlFlow;

public class S6Problems {
    public static void main(String[] args) {
        codeExercise13(1);
        System.out.println(codeExercise14(-1600)); //expect false
        System.out.println(codeExercise14(1600)); //expect true
        System.out.println(codeExercise14(2017)); //expect false
        System.out.println(codeExercise14(2000)); //expect true
        System.out.println(codeExercise14(2016)); //expect true

        //test - all should be -1
        System.out.println(codeExercise14Part2(-1, 2000));
        System.out.println(codeExercise14Part2(1, -2000));
        System.out.println(codeExercise14Part2(13, 2000));
        System.out.println(codeExercise14Part2(1, 12000));

        //Test
        System.out.println(codeExercise14Part2(1, 2020)); //31
        System.out.println(codeExercise14Part2(2, 2020)); //29
        System.out.println(codeExercise14Part2(2, 2018)); //28
        System.out.println(codeExercise14Part2(4, 2000)); //30
        System.out.println(codeExercise14Part2(5, 2000)); //31


    }

    private static void codeExercise13(int number){
        switch(number){
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }

    private static boolean codeExercise14(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0 && year % 100 != 0){
                return true;
            }
            else if (year % 400 == 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    private static int codeExercise14Part2(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        else{
            boolean isLeapYear = codeExercise14(year);
            int day;
            switch (month){
                case 1, 3, 5, 7, 8, 10, 12 -> day = 31;
                case 2 -> { if(isLeapYear)
                    day = 29;
                else
                    day = 28;
                }
                case 4, 6, 9, 11 -> day = 30;
                default -> day = -1;
            }
            return day;
        }
    }
}
