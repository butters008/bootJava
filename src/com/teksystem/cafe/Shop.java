package com.teksystem.cafe;

public abstract class Shop{
    final double SALES_TAX = .12; //Making this protected since it is final and should not be changed
    public abstract void menu();
    public abstract String reciept();
    public abstract double calcTax(double subtotal);
}
