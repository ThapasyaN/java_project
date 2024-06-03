package com.java.beginnerLevel.array.operator;

public class TheMinyRobots
{
    public static void main(String[] args)
    {
        String theRoboteType = "Dogs";
        int priceOfDog = 10 ;
        int priceInTheBank = 105 ;
        boolean isDamaged = false ;

        System.out.println("the price of the dog" + theRoboteType + ":$" + priceOfDog);

          int increasedPrice = priceOfDog + 50 ;
          System.out.println("incresedPrice: "+ theRoboteType + increasedPrice + "$");

          int decreasedPrice = priceOfDog - 50;
          System.out.println("decreasedPrice: " +theRoboteType + priceOfDog+ "$");

          int twoDogPrice = priceOfDog*2;
          System.out.println("twoDogPriceL: " + theRoboteType + priceOfDog*2 + " $");

        byte  moneyInTheBank;
        int  moneyLeftInTheBank = (priceInTheBank%priceOfDog);
        System.out.println("moneyLeftInTheBank: " + theRoboteType  + moneyLeftInTheBank+"  $");

        int dogsYouCanBuy = priceInTheBank/priceOfDog;
        System.out.println("dogsYouCanBuy: " +theRoboteType+ dogsYouCanBuy +   "  $" );

        System.out.println("isDamaged" + isDamaged);
    }
}
