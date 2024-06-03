package com.java.beginnerLevel.array.Array;

import java.util.Random;

public class array {
    public static class ArrayApp {
        public static void main(String[] args) {
            int[] lotteryNumbers= new int [5];

            Random randomNumberGenerator =new  Random();

            lotteryNumbers[0]=randomNumberGenerator.nextInt(95)+1;
            lotteryNumbers[1]=33;
            lotteryNumbers[2]=44;
            lotteryNumbers[3]=55;
            lotteryNumbers[4]=66;


            for (int lotteryNumber:lotteryNumbers){
                System.out.println(lotteryNumber);
            }
            System.out.println();
            int[][]weeklrLotteryNumbers={
                    {1,2,3,4,5},
                    {11,22,33,44,55},
                    {66,77,88,99,10},
                    {45,68,44,78,95}
            };
            for (int i = 0; i < weeklrLotteryNumbers.length; i++) {
                for (int j = 0; j < weeklrLotteryNumbers[i].length; j++) {
                    System.out.print(weeklrLotteryNumbers[i][j] + " ");

                }
                System.out.println();
            }
        }
    }
}
