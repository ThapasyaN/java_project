package com.java.beginnerLevel.array.mixed;

public class EndLevelTask {
    public static void main(String[] args) {
        nameOfTheActor("SANDEEP");
        dateOfBirth("7th september 2007");
        movieTitles("IF YOU THINK YOU ARE RIGHT THEN STAND FOR IT NO MATTER WHAT EVERY ONE THINK");
        ratingsForTheFirstMovie(8.5);
        peopleRatingOnTheMovie('E');
    }
    static void nameOfTheActor(String name)
    {
        System.out.println("THE NAME OF THE ACTOR IS "+name);
    }
    static void dateOfBirth(String date)
    {
        System.out.println("HE WAS BORN ON "+date);
    }
    static void movieTitles(String title)
    {
        System.out.println("ONE OF THE BEST TITLE IS "+title);
    }
    static void ratingsForTheFirstMovie(double ratings )
    {
        System.out.println("THIS MOVIES RATING IS ABOUT "+ratings);
    }
    static void peopleRatingOnTheMovie (char category){
        switch (category){
            case'A':
             System.out.println("bad");
             break;
            case 'B':
                System.out.println("average");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("very good");
                break;
            case 'E':
                System.out.println("amazing");
                break;
            default:
                System.out.println("not able to calculate the rating given by the people ");
        }
    }
}
