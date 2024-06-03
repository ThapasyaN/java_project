package com.java.beginnerLevel.array.controlFlow;

public class ControlFlowApp {
    public static void main(String[] args) {
        boolean isDamaged = false;
        String carColour ="purple";
        String ownerOfTheCar = "6";

        if (isDamaged){
            System.out.println("DAMAGED CAR");
        }else {
            System.out.println("ACCIDENT FREE");
            System.out.println();
        }
        if (carColour.equals("red")){
            System.out.println("THE CAR COLOUR IS RED");
        }else if (carColour.equals("green")){
            System.out.println("THE CAR COLOUR IS GREEN");
        }
        else if (carColour.equals("purple")){
            System.out.println("THE CAR COLOUR IS PURPLE");
            System.out.println();
        }
        else{
            System.out.println("I HAVE NO IDEA WHAT'S THE COLOUR OF THIS CAR");
            System.out.println();
        }
        System.out.println("SWITCH");
        switch(ownerOfTheCar){
            case "1":
                System.out.println("THE CAR HAS 1 OWNERS");
                break;
            case "2":
                System.out.println("THE CAR HAS 2 OWNERS");
                break;
            case"3":
                System.out.println("THE CAR HAS 3 OWNERS");
                break;
            case"4":
                System.out.println("THE CAR HAS 4 OWNERS");
                break;
            default:
                System.out.println("CANT FIND THE NUMBER OF OWNERS OF THE CAR");
                System.out.println();
        }

        {
            int numberOfSeats = 5;
            {
                numberOfSeats ++;
            }
            System.out.println("NUMBER OF SEATS: "+numberOfSeats);
        }
    }
}
