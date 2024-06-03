package com.java.intermediateLevel.inheritance.pizza;

public class pzz {
    int priceOfPizza = 105;
    int moneyInTheBank = 2100;
    boolean isDamaged = false;
    int increasedPrice = priceOfPizza+50;
    int decreasedPrice = priceOfPizza-50;

    String flavour;
    String pizzaName;

    pzz(){
        System.out.println();
        System.out.print("PIZZA GETS READY IN FIVE MINUTES. WE REQUEST YOU TO WAIT.");
    }

    pzz(String pizzaName,String flavour,int priceOfPizza,int moneyInTheBank, int increasedPrice,int decreasedPrice,
          boolean isDamaged){
        this.pizzaName=pizzaName;
        this.flavour=flavour;
        this.priceOfPizza=priceOfPizza;
        this.moneyInTheBank=moneyInTheBank;
        this.increasedPrice=increasedPrice;
        this.decreasedPrice=decreasedPrice;
        this.isDamaged=isDamaged;
    }

    public void resultOfThePizza()
    {
        System.out.println();
        System.out.println("IT IS THE BEST PIZZA I NEVER HAD. THANK YOU ^_^. ");
    }

    public void getDescription(){
        System.out.print("A" + flavour + " "+ pizzaName +" GETS READY IN FIVE MINUTES. WE REQUEST YOU TO WAIT.");
        System.out.println("Price Of Pizza: $ " + priceOfPizza);
        System.out.println("moneyInTheBank: $ " +  moneyInTheBank );
        System.out.println("IsDamaged: " +isDamaged);
        System.out.println("Increased Price: $" +increasedPrice);
        System.out.println("Decreased Price: $" +decreasedPrice);
    }
}
