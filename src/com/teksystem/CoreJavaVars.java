package com.teksystem;


/*
* Author: Keith Butterfield
* Assignment: Core Java - Exercises - Variables
* */
public class CoreJavaVars {

//    Write a program that declares 2 integer variables,
//    assigns an integer to each, and adds them together.
//    Assign the sum to a variable. Print out the result.
    public static int problem1(int var1, int var2){
        int result = var1 + var2;
        return result;
    }

//    Write a program that declares 2 double variables,
//    assigns a number to each, and adds them together.
//    Assign the sum to a variable. Print out the result.
    public static double problem2(double var1, double var2){
    double result = var1 + var2;
    return result;
}

//    Write a program that declares an integer variable and a double variable,
//    assigns numbers to each, and adds them together. Assign the sum to a variable.
//    Print out the result. What variable type must the sum be?
    public static void problem3(){
        int p3Var1 = 5;
        double p3Var2 = 12.2;
        p3Var2 = p3Var2 + p3Var1;
        System.out.println(p3Var2 + " Double");
    }

//    Write a program that declares 2 integer variables, assigns an integer to each,
//    and divides the larger number by the smaller number. Assign the result to a variable. Print out the result.
//    Now change the larger number to a decimal. What happens? What corrections are needed?
    public static void problem4(){
        int result;
        int var1 = 10;
        int var2 = 2;
        double var3 = 10.5;

        result = var1/var2;
        System.out.print("First part, divide ints " + result);
        //Inorder to not set types, using the double var as the result.
        var3 = var3/var2;
        System.out.print(" second part, divide double with int " + var3 + "\n");
        System.out.println("P4(explain) - If I used the result var, then it gives a error because I cannot go from\n" +
                "double to int without casting or assigning the result var to double");
    }

//    Write a program that declares 2 double variables, assigns a number to each,
//    and divides the larger by the smaller. Assign the result to a variable.
//    Print out the result. Now, cast the result to an integer. Print out the result again.
    public static void problem5(){
        double var1 = 4.4;
        double var2 = 14.3;
        double result = var2/var1;
        System.out.print("result var is double " + result);
        System.out.print(" result var is cast to int " + (int)result + "\n");
    }

//    Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
//    Declare a variable q and assign y/x to it and print q.
//    Now, cast y to a double and assign to q. Print q again.
    public static void problem6(){
        int x = 5, y = 6;
        int q = y/x;
        System.out.print("printing result as int " + q);
//        (double)q = y/x; //Does not work when cast and assign
        System.out.println(" printing the result, casting as double " + (double)q);
    }

//    Write a program that declares a named constant and uses it in a calculation. Print the result.
    public static int problem7(int var1){
        int result;
        final int consVar = 2;
        return result = consVar * var1;
    }

//    Write a program where you create 3 variables that represent products at a cafe.
//    The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
//    Assign prices to each product.
//    Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product,
//    4 items of the second product, and 2 items of the third product.
//    Add them all together to calculate the subtotal. Create a constant called SALES_TAX
//    and add sales tax to the subtotal to obtain the totalSale amount.
//    Be sure to format the results to 2 decimal places.
    public static void problem8(){
        double coffee = 3.24;
        double capp = 5.55;
        double tea = 2.21;
        final double SALESTAX = .1;
        double subtotal;
        double totalSale;

        subtotal = coffee + capp + tea;
        totalSale = (SALESTAX * subtotal) + subtotal;
        System.out.println("Sale for coffee " + coffee + " \ncapp " + capp +  " \ntea " + tea +
                " \nsubtotal " + subtotal + "\nSales Tax " + String.format("%.2f", (SALESTAX * subtotal)) + " \ntotal sale " + String.format("%.2f", totalSale) + "\n");

        subtotal = coffee + coffee + coffee + coffee;
        totalSale = (SALESTAX * subtotal) + subtotal;
        System.out.println("Sale for coffee " + coffee + " \ncoffee " + coffee +  " \ncoffee " + coffee +   " \ncoffee " + coffee +
                " \nsubtotal " + subtotal + "\nSales Tax " + String.format("%.2f", (SALESTAX * subtotal)) + " \ntotal sale " + String.format("%.2f", totalSale) + "\n");

        subtotal = capp + tea;;
        totalSale = (SALESTAX * subtotal) + subtotal;
        System.out.println("Sale for capp " + capp + " \ntea " + tea + " \nsubtotal " + subtotal + "\nSales Tax " +
                String.format("%.2f", (SALESTAX * subtotal)) + " \ntotal sale " + String.format("%.2f", totalSale) + "\n");
    }

    public static void main(String[] args) {
        System.out.println("Problem 1: " + problem1(3,5));
        System.out.println("Problem 2: " + problem2(3.9,10.5));
        System.out.print("Problem 3: ");
        problem3();
        System.out.print("Problem 4: ");
        problem4();
        System.out.print("Problem 5: ");
        problem5();
        System.out.print("Problem 6: ");
        problem6();
        System.out.println("Problem 7-1: " + problem7(2));
        System.out.println("Problem 7-2: " + problem7(3));
        System.out.println("Problem 7-3: " + problem7(4));
        System.out.println("Problem 7-4: " + problem7(5));
        System.out.println("Not the greatest example or code for constant, but the idea is that the code set for the constant\n" +
                "will never change no matter where or how often we use it");
        System.out.println("______Problem 8:________ ");
        problem8();
    }
}
