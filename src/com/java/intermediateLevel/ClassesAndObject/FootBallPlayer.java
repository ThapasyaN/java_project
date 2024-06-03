package com.java.intermediateLevel.ClassesAndObject;

import java.util.Random;

public class FootBallPlayer {
    String name;
    String nickName;
    String groupName;
    int age;
    double freeThrowPercentage;

    public FootBallPlayer(String name, String nickName, String groupName, int age, double freeThrowPercentage) {
        this.name = name;
        this.nickName = nickName;
        this.groupName = groupName;
        this.age = age;
        this.freeThrowPercentage = freeThrowPercentage;
    }
    public void freeThrowPercentage(){
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble()*100)>freeThrowPercentage){
            System.out.println(name+"LOST HIS FREE THROW");
        }
        else
    {
            System.out.println("WAS ABLE TO GAIN FREE THROW");
        }

    }
}
