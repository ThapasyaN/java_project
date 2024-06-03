package Sample_Practice.school;

public class JavaStatements {
    public static void main(String[] args) {
        int a = 4, b = 27,e=2;
        double c = 32.8, d = 63.7,f=-33.86,g=-66.4;
        System.out.println("SQUARE ROOT= "+Math.sqrt(a));
        System.out.println("CUBE ROOT= "+Math.cbrt(b));
        System.out.println("CUBE ROOT2= "+Math.cbrt(9.261));
        System.out.println("ROUND OF= "+Math.round(d));
        System.out.println("ROUND OF2= "+Math.round(f));
        System.out.println("POWERS= "+Math.pow(a,e));
        System.out.println("MAXIMUM NUMBER= "+Math.max(f,g));
        System.out.println("MINIMUM NUMBER= "+Math.min(f,g));
        System.out.println("ABSOLUTE VALUE= "+Math.abs(g));
        System.out.println("UPPER VALUE OR CEIL= "+Math.ceil(f));
        System.out.println("LOWER VALUE OR FLOOR= "+Math.floor(d));
        System.out.println("LOWER VALUE OR FLOOR2= "+Math.floor(f));
        System.out.println("RANDOM= "+Math.random()*4);
        System.out.println("UPPER VALUE OR CEIL= "+Math.ceil(9.9)+Math.ceil(9.0));
        System.out.println("UPPER VALUE OR CEIL= "+Math.ceil(-6.35));
    }
}