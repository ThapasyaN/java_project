package com.java.intermediateLevel.ClassesAndObject;

public class CharacterApp {
    public static void main(String[] args) {
        Characters characters1 = new Characters("HAPPY","POLITE",6);
        Characters characters2= new Characters("SAD","ANNOYED",2);
        Characters characters3= new Characters("MOODY","CRAZY",9);

        Characters[] character = new Characters[3];
        character[0]=characters1;
        character[1]=characters2;
        character[2]=characters3;

        for (Characters characters : character){
            characters.usage();
        }
    }
}
