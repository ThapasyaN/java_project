package com.java.beginnerLevel.array.controlFlow;

public class WhoWantsToBeAMillionaireApp {
    public static void main(String[] args) {
        char answer = 'c';

        System.out.println("1.Who is named as the father of the light bulb?");
        System.out.println();
        System.out.println("YOU MARKED "+answer+".LETS WHETHER YOUR ANSWER IS RIGHT.");
        System.out.println();

        if (answer == 'c'){
            System.out.println("YOUR ANSWER IS RIGHT");
        }
        else {
            System.out.println("SORRY, YOUR ANSWER IS WRONG, THANK YOU FOR COMMING.");
        }
    }
}
