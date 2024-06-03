package com.java.intermediateLevel.ClassesAndObject;

public class BackeryApp {
    public static void main(String[] args) {
        Backers Sahasra = new Backers("Sahasra","Satvika",2009,5,
                "SWACK HOOP");
        System.out.println();
        Backers Dhanishka = new Backers("Dhanishka","Dhanu",2008,4,
                "DEPRESSED SWEETS MAKES YOUR LIFE A DESSERT");
        System.out.println();
        Backers Sujasri = new Backers("Sujasri","Suju Buju",2010,3,
                "SWEET A DAY KEEPS YOUR SUGAR LEVELS AWAY AND DIRECTLY OPEN TICKET TO YOUR WAY (SUM)");
        System.out.println();
        Backers Ananya = new Backers("Ananya","Annu",2009,3,
                "MILKEY");

        Backers[] backers = new Backers[4];
        backers[0]=Sahasra;
        backers[1]=Dhanishka;
        backers[2]=Sujasri;
        backers[3]=Ananya;

       // Backers backers :backers;
        


    }
}
