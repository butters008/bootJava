package com.butterfield.UdemyJavaMC.S7_OOP_Part1;

public class BankAccountDriver79 {
    public static void main(String[] args) {
        BankAccountChallenge79 account = new BankAccountChallenge79();
//        BankAccountChallenge79 account = new BankAccountChallenge79("k1234", 123.23, "Keith", "email@email.com", 1234567890);

        //Doing this long way (T_T)
        account.setBankAccountNumber("k1234");
        account.setCustomerName("Keith");
        account.setEmail("email@email.com");
        account.setPhoneNumber(1234567890);
        account.setAccountBalance(1234.23);

        account.withdraw(5000);
        account.withdraw(500);
        account.deposit(500);
    }

}
