package com.java.intermediateLevel.inheritance.pizza;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.resultOfThePizza();
        pizza.getDescription();

        System.out.println("------------------------------------------------------");
        Pizza cottagePizza = new Pizza(" cottage ", 6, 10, 8, 5, false);
        cottagePizza.getDescription();
        System.out.println(cottagePizza.flavour.toUpperCase());
        cottagePizza.resultOfThePizza();
    }
    //note-never give a feature to an empty object ,example row-5,6,7. it gives an error.//
}


