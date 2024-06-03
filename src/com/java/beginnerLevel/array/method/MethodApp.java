package com.java.beginnerLevel.array.method;

public class MethodApp {
    public static void main(String[] args)
    {
         sayHellow();
        blackBoardPunishment(5);
        System.out.println("THE PRICE WITH 10% OFF: "+getTenPercentOffDiscountPrice(100));
        System.out.println("THE PRICE WITH 20% OFF: "+getDiscountPrice(200,50));
        System.out.println("THE PRICE WITH 40% OFF: "+getDiscountPrice(400.75,40));
        System.out.println(theEnergyEfficiencyCategory('b'));
        getCarsDiscription("Bence",2010 , "Not Bad");
    }

    static void sayHellow()
    {
        System.out.println();
        System.out.println("helow!!!");
        System.out.println();
    }
        static void blackBoardPunishment ( int repeatNumber){
        for (int i=1;i<=repeatNumber;i++)
            System.out.println("BEING RIGHT SUCKS");
    }
    static double getTenPercentOffDiscountPrice (int price){
        return price*0.9;
    }
    static double getDiscountPrice (int price ,int percent){
        return price*percent/100.0;
    }
    static double getDiscountPrice (double price ,int percent) {
        return price * percent / 100;

    }
   static String theEnergyEfficiencyCategory (char category){
       switch (category)
       {
           case 'A':
           case'a':
              return "very low energy consumption";

           case 'B':
           case 'b':
               return " low energy consumption";

           case 'C':
           case 'c':
               return "normal energy consumption";

           case 'D':
           case 'd':
               return "above normal energy consumption";

           case 'E':
           case'e':
               return "high energy consumption";

           case 'F':
           case'f':
               return "very high energy consumption";

           case 'G':
           case'g':
               return "extremely high energy consumption";

           default:
               return "not defined category";
       }
   }
  static void getCarsDiscription (String carModel , int productionOfTheCar, String condition)
  {
        System.out.println("THE CAR MODEL IS " + carModel);
        System.out.println("THE PRODUCTION OF THE CAR IS "+productionOfTheCar);
        System.out.println("THE CONDITION OF THE CAR IS "+condition);
  }
}

