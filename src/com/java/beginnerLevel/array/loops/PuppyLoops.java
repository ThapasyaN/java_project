package com.java.beginnerLevel.array.loops;

public class PuppyLoops
{
    public static void main(String[] args)
    {
        int t = 1;

        System.out.println();
        System.out.println("while");
        while (t <= 5) {
            System.out.println(t + ".HI LITTLE PUPPY ^-^");
            t++;
        }
        System.out.println("THE VALUE OF t:" + t);
        System.out.println();

        int s = 1;
        System.out.println("do while");
        do {
            System.out.println(s + ".*-*");
            s++;
        }
        while (s <= 5);
        System.out.println("THE VALUE OF s:" + s);
        System.out.println();

        int p;
        System.out.println("for");
        for (p = 1; p <= 5; p++) {
            System.out.println(p + ".^_^");
        }
        System.out.println("THE VALUE OF s:" + s);
        System.out.println();

        int n;
        System.out.println("continue");
        for (n = 1; n <= 5; n++)
        {
            if (n == 3)
            {
                continue;
            }
            {
                System.out.println(n + ".(~_~)");
                System.out.println();
            }

                int a;
                System.out.println();
                System.out.println("break");
                for (a = 1; a <= 6; a++) {
                    if (a == 3) {
                        break;
                    }
                    System.out.println(a+".*_*");
                    System.out.println();
                }
        }
    }
}
