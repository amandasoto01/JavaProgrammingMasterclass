package com.company;

public class DeluxeBurger extends BaseBurger {
    private Addition addition1;
    private Addition addition2;

    public DeluxeBurger() {
        super("White", "Sausage & Bacon", 15, "Deluxe");
        addition1 = new Addition("chips", 5);
        addition2 = new Addition("drinks", 5);
    }

    @Override
    public double getTotalPrice() {
        Double total = super.getTotalPrice();
        System.out.println("Added "+addition1.getName()+" price "+ addition1.getPrice());
        System.out.println("Added "+addition2.getName()+" price "+ addition2.getPrice());
        total += addition1.getPrice();
        total += addition2.getPrice();
        return total;
    }
}
