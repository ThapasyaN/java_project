package com.java.beginnerLevel.array.method;

public class MethodCoodingPractice {
    public static void main(String[] args) {
        sayHello();
        puppyName();
        featuresOfThePuppy('B');
        birthday(5);
        puppyDiscription("white with black spots",4,"the puppy of thapasya","B");
    }
    static void sayHello()
    {
        System.out.println();
        System.out.println("hello ^_^ !!");
    }
    static void puppyName()
    {
        System.out.println("HI Punny!! *_*");
    }
    static void featuresOfThePuppy(int category){
        switch (category){
            case'A':
                System.out.println("Lab");
                break;
            case'B':
                System.out.println("Huskey");
                break;
            case 'C':
                System.out.println("Golden Retrever");
            case'D':
                System.out.println("Rot Wheeler");
            default:
                System.out.println("not defined category");
        }
    }
    static void birthday(int repeat){
        for (int i=1;i<=5;i++){
            System.out.println("HI.. I WAS BORN ON 10TH SEPTEMBER 2009 >_<");
        }
    }
    static void puppyDiscription (String colour,int numberOfLegs,String identity,String category){
        System.out.println("THE COLOUR OF PUPPY IS  "+colour+"colour");
        System.out.println("THE PUPPY HAS "+numberOfLegs+"legs");
        System.out.println("THE PUPPYS IDENTITY IS "+identity);
        System.out.println("THE TYPE OF PUPPY "+category);
    }
}
