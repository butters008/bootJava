package com.teksystem.Library;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kidUser = new KidUser();
        AdultUser adultUser = new AdultUser();

        kidUser.registerAccount(10);
        kidUser.registerAccount(18);
        kidUser.requestBook("Kids");
        kidUser.requestBook("Fiction");

        adultUser.registerAccount(5);
        adultUser.registerAccount(23);
        adultUser.requestBook("Kids");
        adultUser.requestBook("Fiction");

    }
}
