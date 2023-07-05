package com.butterfield.UdemyJavaMC.S7_OOP_Part1;

public class BankAccountChallenge79 {
    String bankAccountNumber;
    double accountBalance;
    String customerName;
    String email;
    int phoneNumber;

    public BankAccountChallenge79(){

    }

    public BankAccountChallenge79(String bankAccountNumber, double accountBalance, String customerName, String email, int phoneNumber) {
        this.bankAccountNumber = bankAccountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Getters and Setters
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double withdraw(double amountTakeOut){
        if(accountBalance - amountTakeOut <= 0 ){
            System.out.println("Account does not have that much");
            return -1;
        }else{
            //This is dumb.... (T_T)
            setAccountBalance(accountBalance - amountTakeOut);
            System.out.println("New Account balance " + getAccountBalance());
            return amountTakeOut;
        }
    }

    public void deposit(double amountPutIn){
        setAccountBalance(accountBalance + amountPutIn);
        System.out.println("New Account balance " + getAccountBalance());
    }
}
