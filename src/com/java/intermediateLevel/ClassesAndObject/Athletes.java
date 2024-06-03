package com.java.intermediateLevel.ClassesAndObject;

import java.util.Random;

public class Athletes {
    String name;
    String nickName;
    String teamName;
    int noOfMedals;
    int noOfMatches;
    int finalPoints;

    public Athletes(String name, String nickName, String teamName, int noOfMedals, int noOfMatches, int finalPoints) {
        this.name = name;
        this.nickName = nickName;
        this.teamName = teamName;
        this.noOfMedals = noOfMedals;
        this.noOfMatches = noOfMatches;
        this.finalPoints = finalPoints;
    }
    public void getDescription() {
        Random randomNumberGenerator = new Random();
        if (randomNumberGenerator.nextDouble()> finalPoints) {
            System.out.println(name + "  dint played much better in her game as her final match points were  " + finalPoints);
        }else {
            System.out.println(name + " was excellent in heer game as her final match points were " + finalPoints);
        }
    }
}