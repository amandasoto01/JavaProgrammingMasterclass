package com.company;

public class HealthyBurger  extends BaseBurger{
    private Addition addition1 = new Addition();
    private Addition addition2 = new Addition();

    public HealthyBurger( String meat, double totalPrice) {
        super("Brown rye", meat, totalPrice, "Healthy burger");
    }

    public void setHealthAdditon1(Addition additon1) {
        this.addition1 = additon1;
    }

    public void setHealthAddition2(Addition addition2) {
        this.addition2 = addition2;
    }

    @Override
    public double getTotalPrice() {
        Double total = super.getTotalPrice();
        if(addition1.getName() != null){
            total += this.addition1.getPrice();
            System.out.println("Added "+addition1.getName() + " for an extra " + addition1.getPrice());
        }

        if(addition2.getName() != null){
            total += this.addition2.getPrice();
            System.out.println("Added "+addition1.getName() + " for an extra " + addition1.getPrice());
        }
        return total;
    }

}
