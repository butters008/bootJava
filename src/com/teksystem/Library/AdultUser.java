package com.teksystem.Library;

public class AdultUser implements LibraryUser{
    @Override
    public void registerAccount(int age) {
        if (age >= 12 ){
            System.out.println("You have successfully made an adult account");
        }
        else{
            System.out.println("Sorry, you must be older than 12 years old to make an adult account");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if(bookType.equals("Fiction")){
            System.out.println("Book issues successful, please return book within 7 days. ");
        }
        else{
            System.out.println("Opps you are only allowed to take adult fiction books!");
        }

    }

    private int age;
    private String bookType;

}
