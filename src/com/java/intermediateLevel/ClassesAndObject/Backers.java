package com.java.intermediateLevel.ClassesAndObject;

import java.util.Random;

public class Backers {
    String name;
    String nickName;
    int yearOfBorn;
    int starsByTheCustomers;
    String teamName;

    public Backers(String name, String nickName, int yearOfBorn, int starsByTheCustomers, String teamName) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.starsByTheCustomers = starsByTheCustomers;
        this.teamName = teamName;
    }
    public void starsByTheCustomers()
    {
        Random randomNumberGenerator = new Random();
        if (randomNumberGenerator.nextDouble()*100 > starsByTheCustomers)
        {
            //THE USE OF INNER BRACKETS IS THAT--IT FIRST SOLVES THE PROBLEM IN THE BRACKETS AND THEN COMES TO OTHERS.//
            System.out.println(name+" FAILED TO ACHIEVE TARGET AT GIVEN TIME >_<");
        }
        else{
            System.out.println(name+ "ACHIEVED THE TARGET BY GIVEN TIME ^~^");
        }
    }

}
