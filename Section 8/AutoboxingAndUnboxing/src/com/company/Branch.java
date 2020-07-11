package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double amount){
        int pos = getCustomerIndex(name);

        if(pos < 0){
            this.customers.add(new Customer(name, amount));
            return true;
        }
        return false;
    }

    private int getCustomerIndex(String customerName){
        int i=0;
        for (Customer customer: this.customers) {
            if(customer.getName().equals(customerName)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean addCustomerTransaction(String customerName, Double transactionAmount){
        int pos = getCustomerIndex(customerName);
        if(pos >= 0){
            Customer customer = this.customers.get(pos);
            customer.addTransaction(transactionAmount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
