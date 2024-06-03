package com.java.intermediateLevel.ClassesAndObject;

public class Pizza {

        int priceOfPizza = 105;
        int moneyInTheBank = 2100;
        boolean isDamaged = false;
        int increasedPrice = priceOfPizza+50;
        int decreasedPrice = priceOfPizza-50;

        String flavour;
        Pizza(){
                System.out.println();
                System.out.print("PIZZA GETS READY IN FIVE MINUTES. WE REQUEST YOU TO WAIT.");
        }

        Pizza(String flavour,int priceOfPizza,int moneyInTheBank, int increasedPrice,int decreasedPrice,
              boolean isDamaged){
                this.flavour=flavour;
                this.priceOfPizza=priceOfPizza;
                this.moneyInTheBank=moneyInTheBank;
                this.increasedPrice=increasedPrice;
                this.decreasedPrice=decreasedPrice;
        }

        public void resultOfThePizza()
        {
                System.out.println();
                System.out.println("IT IS THE BEST PIZZA I NEVER HAD. THANK YOU ^_^. ");
        }

        public void getDescription(){
                System.out.print("A" + flavour + "PIZZA GETS READY IN FIVE MINUTES. WE REQUEST YOU TO WAIT.");
                System.out.println("Price Of Pizza: $ " + priceOfPizza);
                System.out.println("moneyInTheBank: $ " +  moneyInTheBank );
                System.out.println("IsDamaged: " +isDamaged);
                System.out.println("Increased Price: $" +increasedPrice);
                System.out.println("Decreased Price: $" +decreasedPrice);
        }
}
