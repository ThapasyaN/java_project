package com.java.intermediateLevel.ClassesAndObject;

public class RobotApp {
    public static void main(String[] args)
    {
        Robot robot = new Robot();
        //robot.getDescription();
        robot.startTheBattery();


        System.out.println("--------------------------------------------");
        Robot brownRobot = new Robot("BORWN");
       // System.out.println(brownRobot.colour.toLowerCase());
        //brownRobot.getDescription();
        brownRobot.startTheBattery();

    }
}
