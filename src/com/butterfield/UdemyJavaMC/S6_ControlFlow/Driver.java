package com.butterfield.UdemyJavaMC.S6_ControlFlow;

public class Driver {
    public static void main(String[] args) {
        int x = 4;

        // Basically - use int or String - cannot use boolean or double
        // Old
//        switch(x){
//            case 1:
//                System.out.println("Simple Test 1");
//                break;
//            case 2: case 6:
//                System.out.println("Simple Test 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Simple Test 3");
//                break;
//            default:
//                System.out.println("no value - outside value of cases");
//                break;
//        }

        //New Switch - Only in Java 14+, if you need to be in old Java, use old way
        switch (x) {
            case 1 -> System.out.println("Simple Test 1");
            case 2, 6 -> System.out.println("Simple Test 2");
            case 3, 4, 5 -> System.out.println("Simple Test 3");
            default -> {
                String response = "no value - outside value of cases";
                System.out.println(response);
                // use keyword "yield" to return a value
                //yield response;
            }
        }
    }
}
