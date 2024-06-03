package com.java.intermediateLevel.ClassesAndObject;

import java.util.Random;

public class Characters {
    String character;
    String behaviour;
    int usage;

    public Characters(String character, String behaviour, int usage) {
        this.character = character;
        this.behaviour = behaviour;
        this.usage = usage;
    }

    public void usage()
    {
        Random randomNumberGenerator = new Random();
        if ((randomNumberGenerator.nextDouble()) < usage)
        {
            System.out.println("ITS ALWAYS GOOD TO THE SOCIETY TO PREFERS "+character);
        }
        else{
            System.out.println("MOST OF THE SOCIETY PREFERS TO BE "+character);
        }
    }

}
