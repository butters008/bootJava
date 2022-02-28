package com.teksystem.Library;

public class KidUser implements LibraryUser{
    @Override
    public void registerAccount(int age) {
        if (age < 12 ){
            System.out.println("You have successfully made a kids account");
        }
        else{
            System.out.println("Sorry, you must be younger than 12 years old to make an account");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if(bookType.equals("Kids")){
            System.out.println("Book issues successful, please return book within 10 days. ");
        }
        else{
            System.out.println("Opps you cannot check out this book since you are only a kid!");
        }
    }

    private int age;
    private String bookType;
}
