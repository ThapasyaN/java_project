package com.java.intermediateLevel.inheritance.pizza;

public class Pizza extends pzz{

        Pizza(){
                System.out.println();
                System.out.print("PIZZA GETS READY IN FIVE MINUTES. WE REQUEST YOU TO WAIT.");
        }

        Pizza(String flavour,int priceOfPizza,int moneyInTheBank, int increasedPrice,int decreasedPrice,
              boolean isDamaged){
                super("MADE BY THAPASYA",flavour,priceOfPizza,moneyInTheBank,increasedPrice,decreasedPrice,isDamaged);
        }

        @Override
        public void resultOfThePizza() {
                super.resultOfThePizza();
        }
}
