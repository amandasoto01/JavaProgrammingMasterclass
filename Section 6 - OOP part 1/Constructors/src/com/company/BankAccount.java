package com.company;

public class BankAccount {

    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount(){
        this("56789", 2.50, "Default name", "Default address", "Default pone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String name, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(String name, String email, String phone) {
        this("99999", 100.55, name,email,phone);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositFunds (double n){
        this.balance += n;
        System.out.println("Deposit of " + n +  " made. New balance is " + this.balance);
    }

    public void withdrawFunds (double n){
        if(this.balance - n < 0 ){
            System.out.println("Only "+this.balance + " available. Withdrawal not processed");
        }else{
            this.balance-=n;
            System.out.println("Withdrawal of " + n + " processed. Remaining balance = " + this.balance);
        }

    }
}
