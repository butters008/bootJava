package com.teksystem.cafe;

public class CafeApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.menu();
        System.out.println("\n"+cart.reciept());
    }
}
