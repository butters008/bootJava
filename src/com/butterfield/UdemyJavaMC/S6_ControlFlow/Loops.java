package com.butterfield.UdemyJavaMC.S6_ControlFlow;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //Simple for loop
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        String name = getInputFromScanner();
        System.out.println(name);
        //Just remember to do while and do-while loops as well, skipping these videos
    }

    //You can get input from the console itself with System.console().readline
    // Example String dateOfBirth = System.console().readline("What year where you were born?")
    /**
     * If I remember correctly, there is a issue with Scanner when you use nextInt and nextDouble and need to
     * have an empty nextLine to flush the scanner. Could be fixed but if weird behavior happened, this could be the
     * reason
     */
    public static String getInputFromScanner(){
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine(); //Also, .nextDouble, and nextInt

        return response;
    }
}
