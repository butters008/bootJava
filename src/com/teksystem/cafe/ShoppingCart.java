package com.teksystem.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart extends Shop{
    ArrayList<Product> arr = new ArrayList<Product>();
    Coffee coffee = new Coffee();
    Cappuccino cappuccino = new Cappuccino();
    Espresso espresso = new Espresso();
    double subtotal = 0;
    double total;
    double tax;


    @Override
    public void menu() {
        int menuItems = 1;
        Scanner input = new Scanner(System.in);
        while(menuItems != 4){
            System.out.println(printMenuOptions());
            menuItems = input.nextInt();
            switch(menuItems) {
                case 1:
                    coffee = new Coffee("Coffee", 2.99, "The ususal drink for customers", false, false);
                    System.out.println(coffee.printOptions());
                    int optionChoice = input.nextInt();
                    coffee.addOptions(optionChoice);
                    arr.add(coffee);
                    break;
                case 2:
                    Espresso espressoInCart = new Espresso("Espresso", 4.50, "The Nice drink full of caffine", false, false);
                    System.out.println(espressoInCart.printOptions());
                    optionChoice = input.nextInt();
                    espressoInCart.addOptions(optionChoice);
                    arr.add(espressoInCart);
                    break;
                case 3:
                    Cappuccino cappuccinoInCart = new Cappuccino("Cappuccino", 7.99, "The most expensive", false, false);
                    System.out.println(cappuccinoInCart.printOptions());
                    optionChoice = input.nextInt();
                    cappuccinoInCart.addOptions(optionChoice);
                    arr.add(cappuccinoInCart);
                    break;
                case 4:
                    System.out.println("Finished Checking Out");
                    break;
                default:
                    System.out.println("Invalid Option");
            }//end of switch
        }//end of while

        for (Product product: arr) {
            if(product.getName().equals("Coffee")){
                coffee.setQuantity(coffee.getQuantity()+1);
                subtotal += calcSubTotal(product);
            }
            if(product.getName().equals("Espresso")){
                espresso.setQuantity(espresso.getQuantity()+1);
                subtotal +=  calcSubTotal(product);
            }
            if(product.getName().equals("Cappuccino")){
                cappuccino.setQuantity(cappuccino.getQuantity()+1);
                subtotal +=  calcSubTotal(product);
            }
        }

        tax = calcTax(subtotal);
        total = subtotal + tax;
    }

    public String printMenuOptions(){
        return "Select from the following menu:\n1: Coffee\n2: Espresso\n3: Cappuccino\n4: Checkout";
    }

    public double calcSubTotal(Product product) {
        return product.calcProductTotal(product.getPrice(), 1);
    }

    @Override
    public String reciept() {
        String output = "";
        for (Product product: arr) {
            output += product.printRecipt(product);
        }
        output += String.format("Subtotal %8.2f\nTax: %12.2f\nTotal: %10.2f", subtotal, tax, total);

        return output;
    }

    @Override
    public double calcTax(double subtotal) {
        return subtotal * SALES_TAX;
    }


}
