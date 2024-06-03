package com.java.intermediateLevel.inheritance.backers;

import java.util.Random;

public class bcc {
    String name;
    String nickName;
    int yearOfBorn;
    int starsByTheCustomers;
    String teamName;
    String teamLeader;

    public bcc(String teamLeader, String name, String nickName, int yearOfBorn, int starsByTheCustomers, String teamName) {
        this.teamLeader=teamLeader;
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.starsByTheCustomers = starsByTheCustomers;
        this.teamName = teamName;
    }

    public void starsByTheCustomers()
    {
        System.out.println("THIS BACKERY IS TAKEN INTO CHARGE BY " +teamLeader);
        Random randomNumberGenerator = new Random();
        if (randomNumberGenerator.nextDouble() > starsByTheCustomers)
        {
            //THE USE OF INNER BRACKETS IS THAT--IT FIRST SOLVES THE PROBLEM IN THE BRACKETS AND THEN COMES TO OTHERS.//
            System.out.println(name+" FAILED TO ACHIEVE TARGET AT GIVEN TIME >_<");
        }
        else{
            System.out.println(name+ " ACHIEVED THE TARGET BY GIVEN TIME ^~^");
        }
    }
}
