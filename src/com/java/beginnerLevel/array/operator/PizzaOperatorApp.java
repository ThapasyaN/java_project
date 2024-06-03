package com.java.beginnerLevel.array.operator;

public class PizzaOperatorApp
{
    public static void main(String[] args)
    {
        System.out.println();
        String pizzaType="Cottage Cheese";
        System.out.println("Pizza Type: " +pizzaType );
        int priceOfPizza = 105;
        System.out.println("Price Of Pizza: $ " + priceOfPizza);
        int moneyInTheBank = 2100;
        System.out.println("moneyInTheBank: $ " +  moneyInTheBank );
        boolean isDamaged = false;
        System.out.println("IsDamaged: " +isDamaged);
        System.out.println();

        int increasedPrice = priceOfPizza+50;
        System.out.println("Increased Price: $" +increasedPrice);
        int decreasedPrice = priceOfPizza-50;
        System.out.println("Decreased Price: $" +decreasedPrice);
        int pizzaWeCanBuy = moneyInTheBank/priceOfPizza;
        System.out.println("Pizza We Can Buy: " +pizzaWeCanBuy );
        int moneyLeftInTheBank =  priceOfPizza%moneyInTheBank;
        System.out.println("Money left in the bank: $" +moneyLeftInTheBank);
        System.out.println();

        int priceNegative = -priceOfPizza;
        System.out.println("Price Negative: $" +priceNegative);
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Price Negative With Plus Sign: $" +priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Price Negative With Minus Sign: $" +priceNegativeWithMinusSign);
        System.out.println();

        int priceIncreasedByOne = ++priceOfPizza;
        System.out.println("price Increased By One: $" +priceIncreasedByOne );
        int priceDecreasedByOne = --priceOfPizza;
        System.out.println("Price Decreased By One: " +priceDecreasedByOne);
        System.out.println();

        System.out.println("IS THE PIZZA DAMAGED: " + !isDamaged);
        System.out.println();

        System.out.println("PRICE OF PIZZA IS EQUAL TO THE MONEY IN THE BANK: " + (priceOfPizza == moneyInTheBank));
        System.out.println("PRICE OF PIZZA IS not EQUAL TO THE MONEY IN THE BANK: " + (priceOfPizza != moneyInTheBank));
        System.out.println("PRICE OF PIZZA IS greater than EQUAL TO THE MONEY IN THE BANK: " + (priceOfPizza >= moneyInTheBank));
        System.out.println("PRICE OF PIZZA IS lesser than EQUAL TO THE MONEY IN THE BANK: " + (priceOfPizza <= moneyInTheBank));
        System.out.println("PRICE OF PIZZA IS lesser TO THE MONEY IN THE BANK: " + (priceOfPizza < moneyInTheBank));
        System.out.println("PRICE OF PIZZA IS greater TO THE MONEY IN THE BANK: " + (priceOfPizza > moneyInTheBank));
        System.out.println();

        String damagedText = !isDamaged? "the pizza is damaged": "the pizza is not damaged";
        System.out.println("damagedText: " +damagedText);
        System.out.println();

        int price = 105;
        price +=5;
        System.out.println("increasedPrice: $" +price);
        price -=5;
        System.out.println("decreasedPrice: $" +price);
        price *=5;
        System.out.println("multipliedPrice: $" +price);
        price /=5;
        System.out.println("dividedPrice: $" +price);
        price %=5;
        System.out.println("remainedPrice: $" +price);
    }

}
