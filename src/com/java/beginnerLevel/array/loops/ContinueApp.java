package com.java.beginnerLevel.array.loops;

public class ContinueApp
{
    public static void main(String[] args)
    {
        int x;
        int a=0,b=1,c=0;
        System.out.println(a);
        System.out.println(b);
        for(x=1;x<=15;x++)
        {
            c=a+b;
            a=b; b=c;
            System.out.println(c);
           // a=b; b=c;
          }
          System.out.println(x+".omg");
        }
          //System.out.println("omg");
    }


