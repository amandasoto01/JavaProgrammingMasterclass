package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
        Account somsAccount = new Account("Som");
        somsAccount.deposit(1000);
        somsAccount.withdraw(500);
        somsAccount.withdraw(-200);
        somsAccount.deposit(-20);
        somsAccount.calculateBalance();

        //somsAccount.balance = 5000;
        System.out.println("Balance on account is "+somsAccount.getBalance() );
        //somsAccount.transactions.add(4500);
        somsAccount.calculateBalance();
    }
}
