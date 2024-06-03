package com.java.intermediateLevel.inheritance.backers;

public class BackeryApp {
    public static void main(String[] args) {
        Backers Sahasra = new Backers("Sahasra","Satvika",2009,10,
                "SWACK HOOP");
        System.out.println();
        Backers Dhanishka = new Backers("Dhanishka","Dhanu",2008,8,
                "DEPRESSED SWEETS MAKES YOUR LIFE A DESSERT");
        System.out.println();
        Backers Sujasri = new Backers("Sujasri","Suju Buju",2010,2,
                "SWEET A DAY KEEPS YOUR SUGAR LEVELS AWAY AND DIRECTLY OPEN TICKET TO YOUR WAY (SUM)");
        System.out.println();
        Backers Ananya = new Backers("Ananya","Annu",2009,7,
                "MILKEY");
        Backers SUSHMA = new Backers("SUSHMA","TINA",1939,9,
                "ROBUST");

        //ARRAY//
        Backers[] backer = new Backers[5];
        backer[0]=Sahasra;
        backer[1]=Dhanishka;
        backer[2]=Sujasri;
        backer[3]=Ananya;
        backer[4]=SUSHMA;




        for (Backers backers : backer){
            backers.starsByTheCustomers();
        }

       // Backers backers :backers;//
        


    }
}
