package com.company;

public class BaseBurger {
    private String bread;
    private String meat;
    private double totalPrice;
    private String name;

    private Addition addition1 = new Addition();
    private Addition addition2 = new Addition();
    private Addition addition3 = new Addition();
    private Addition addition4 = new Addition();

    public BaseBurger(String bread, String meat, double totalPrice, String name) {
        this.bread = bread;
        this.meat = meat;
        this.totalPrice = totalPrice;
        this.name = name;
    }

    public void setAddition1(String name, Double price){
        addition1.setName(name);
        addition1.setPrice(price);
    }
    public void setAddition2(String name, Double price){
        addition2.setName(name);
        addition2.setPrice(price);
    }
    public void setAddition3(String name, Double price){
        addition3.setName(name);
        addition3.setPrice(price);;
    }
    public void setAddition4(String name, Double price){
        addition4.setName(name);
        addition4.setPrice(price);
    }

    public double getTotalPrice() {
        double total = this.totalPrice;
        System.out.println(this.name + " hamburger on a " + this.bread + " roll "+
                "price is " + this.totalPrice);
        if(addition1.getName() != null){
            total+= addition1.getPrice();
            System.out.println("Added "+addition1.getName() + " for an extra " + addition1.getPrice());
        }
        if(addition2.getName()!=null){
            total+= addition2.getPrice();
            System.out.println("Added "+addition2.getName() + " for an extra " + addition2.getPrice());
        }
        if(addition3.getName()!=null){
            total+= addition3.getPrice();
            System.out.println("Added "+addition3.getName() + " for an extra " + addition3.getPrice());
        }
        if(addition4.getName()!=null){
            total+= addition4.getPrice();
            System.out.println("Added "+addition4.getName() + " for an extra " + addition4.getPrice());
        }
        return total;
    }

}
