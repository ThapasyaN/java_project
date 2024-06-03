package com.java.intermediateLevel.ClassesAndObject;

public class athlete {
    public static void main(String[] args) {
        Athletes athletes1 = new Athletes("THAPASYA", "THAP", "S3T", 5, 10, 15);
        Athletes athletes2 = new Athletes("Dhanishka", "Dhanu", "DST", 6, 8, 0);
        Athletes athletes3 = new Athletes("Sushma", "Tina", "SSS", 4, 9, 12);

        Athletes[] athletes = new Athletes[3];
        athletes[0] = athletes1;
        athletes[1] = athletes2;
        athletes[2] = athletes3;

        for (Athletes characters : athletes){
            characters.getDescription();
        }


    }
}

