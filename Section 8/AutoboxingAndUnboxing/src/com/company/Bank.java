package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addNewBranch (String branchName){
        int pos = indexBranch(branchName);

        if(pos >= 0){
            return false;
        }
        this.branches.add(new Branch(branchName));
        return true;
    }

    private int indexBranch(String branchName){
        int i=0;
        for (Branch branch: this.branches) {
            if(branch.getName().equals(branchName)){
                return i;
            }
            i++;
        }
        return -1;
    }



    public boolean addBranchCustomer(String branchName, String customerName, double amount){
        int pos = indexBranch(branchName);

        if(pos<0){
          return false;
        }
        return this.branches.get(pos).addCustomer(customerName,amount);

    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        int pos = indexBranch(branchName);

        if(pos<0){
            return false;
        }

        return this.branches.get(pos).addCustomerTransaction(customerName,amount);

    }

    public boolean customersList(String branchName, boolean showTransactions){
        int pos = indexBranch(branchName);
        if(pos<0){
            return false;
        }
        Branch branch = this.branches.get(pos);
        System.out.println("Customers for branch "+branch.getName());
        ArrayList<Customer> branchCustomers = branch.getCustomers();
        for (int i=0; i < branchCustomers.size(); i++){
            Customer customer = branchCustomers.get(i);
            System.out.println("Customer: " + customer.getName() + "["+(i+1)+"]");

            if(showTransactions){
                System.out.println("Transactions: ");
                ArrayList<Double> transactions = customer.getTransactions();
                for(int j=0; j<transactions.size(); j++){
                    System.out.println( "[" + (j+1) + "] Amount: " + transactions.get(j) );
                }
            }
            System.out.println();
        }
        return true;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", branches=" + branches +
                '}';
    }
}
