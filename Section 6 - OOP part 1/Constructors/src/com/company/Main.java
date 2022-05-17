package com.company;

public class Main {

    public static void main(String[] args) {

      /* BankAccount account = new BankAccount();
        account.setBalance(12345);
        account.withdrawFunds(100.0);
        account.depositFunds(100.0);
        account.withdrawFunds(50.0);
        BankAccount account2 = new BankAccount("tim", "correo", "1245");
        System.out.println(account2.getNumber() + " name " + account2.getName());
       */

        VipCustomer customer = new VipCustomer();
        System.out.println(customer.getName());

        VipCustomer customer1 = new VipCustomer("amanda", 1234);
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("bob", 100, "email");
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmail());
    }
}
