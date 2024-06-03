package com.java.intermediateLevel.ClassesAndObject;

public class Robot {

    String theRobotType = "Dogs";
    int priceOfDog = 10;
    int priceInTheBank = 105;
    boolean isDamaged = false;
    int increasedPrice = priceOfDog + 50;
    int decreasedPrice = priceOfDog - 50;
    int twoDogPrice = priceOfDog * 2;
    byte moneyInTheBank=105;
    int moneyLeftInTheBank = (priceInTheBank % priceOfDog);
    int dogsYouCanBuy = priceInTheBank / priceOfDog;
    String colour;
   Robot(){
       System.out.println("ROBOT IS CREATED");
      // System.out.println("A "+colour+" COLOUR ROBOT IS MADE ");
   }
   Robot(String colour){
       System.out.println("A "+colour+" COLOUR ROBOT IS MADE ");
   }
    public void startTheBattery()
    {
        System.out.println("THE ROBOT STARTED WORKING");
    }
    public void getDescription(){
        System.out.println("the price of the dog" + theRobotType + ":$" + priceOfDog);
        System.out.println("isDamaged" + isDamaged);
        System.out.println("incresedPrice: "+ theRobotType + increasedPrice + "$");
        System.out.println("decreasedPrice: " +theRobotType + priceOfDog+ "$");
        System.out.println("dogsYouCanBuy: " +theRobotType+ dogsYouCanBuy +   "  $" );
        System.out.println("moneyLeftInTheBank: " + theRobotType  + moneyLeftInTheBank+"  $");
        System.out.println("twoDogPriceL: " + theRobotType + priceOfDog*2 + " $");
    }
}
