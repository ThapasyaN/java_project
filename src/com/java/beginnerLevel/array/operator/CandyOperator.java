package com.java.beginnerLevel.array.operator;

public class CandyOperator
{
    public static void main(String[] args)
    {

        System.out.println();
        String theFlavourOfCandy  = " marinda";
        System.out.println("theFlavourOfCandy: " + theFlavourOfCandy );

        int thePriceOfCandy= 10;
        System.out.println("thePriceOfCandy" + theFlavourOfCandy + " :$" + thePriceOfCandy);

        int moneyInTheBank= 105;
        System.out.println("moneyInTheBank" + ":$" + moneyInTheBank);

        boolean isFresh = true;
        System.out.println("isFresh " + isFresh);
        System.out.println();

        int increasedPrice = thePriceOfCandy+4;
        System.out.println("increasedPrice "+ theFlavourOfCandy  + " :$"+ increasedPrice );

        int decerasedPrice = thePriceOfCandy-4;
        System.out.println("decreasedPrice" + theFlavourOfCandy + " :$" + decerasedPrice);

        int candyWeCanBuy = moneyInTheBank / thePriceOfCandy;
        System.out.println("candyWeCanBuy" +theFlavourOfCandy + " :$" +candyWeCanBuy);

        int moneyLeftInThebank = moneyInTheBank % thePriceOfCandy;
        System.out.println("moneyLeftInTheBank" + ":$" + moneyLeftInThebank );

        System.out.println();

        int priceNegative = -2;
        System.out.println("priceNegative: " + priceNegative);

        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("priceNegativeWithPlusSign "+ " :$" + priceNegativeWithPlusSign );

        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("priceNegativeWithMinusSign" + " :$" + priceNegativeWithMinusSign);

        System.out.println();

        int price = 10;
        System.out.println("price: " + price );

        int priceIncreasedByOne = ++price;
        System.out.println("priceIncreased: " + priceIncreasedByOne);

        int priceDecreasedByOne = --price;
        System.out.println("priceDecreased: " + priceDecreasedByOne);

        System.out.println();

        System.out.println("the candy is fresh: " + !isFresh);
        System.out.println();

        System.out.println("priceOfCandyIsEqualToTheMoneyInTheBank: " +(price == moneyInTheBank));
        System.out.println("priceOfCandyIsNotEqualToTheMoneyInTheBank: " +(price != moneyInTheBank));
        System.out.println("priceOfCandyIsGreaterThanTheMoneyInTheBank: " +(price > moneyInTheBank));
        System.out.println("priceOfCandyIsLesserThanTheMoneyInTheBank: " +(price < moneyInTheBank));
        System.out.println("priceOfCandyIsLesserThanEqualsToTheMoneyInTheBank: " +(price <= moneyInTheBank));
        System.out.println("priceOfCandyIsGreaterThanEqualsToTheMoneyInTheBank: " +(price >= moneyInTheBank));
        System.out.println();

       String damageText = isFresh? "the candy is fresh" :"the candy is not fresh";
       System.out.println("damageText: " +damageText);
       System.out.println();

       String worthBuyingTheCandy = isFresh || price >= 1000 ? "itsWorthBuyingTheCandy" : "itisNotWorthBuyingTheCandy";
       System.out.println(worthBuyingTheCandy);
       String worthBuyingCandy = !isFresh && price >= 1000 ? "itsWorthBuyingTheCandy" : "itisNotWorthBuyingTheCandy";
       System.out.println(worthBuyingTheCandy);
       System.out.println();

       price=10;
       price += 2;
       System.out.println("increasedPrice: $" +price);
       price -= 4;
       System.out.println("decreasedPrice: $" +price);
        price *= 4;
        System.out.println("priceMultiplied: $" +price);
        price /= 8;
        System.out.println("priceDivied: $" +price);
        price %= 8;
        System.out.println("priceRemained: $" +price);
    }

}