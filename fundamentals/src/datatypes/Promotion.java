package datatypes;

public class Promotion {
    public static void main(String[] args) {
        /*
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        System.out.println(d);

        byte e = 50;
        e = 50 * 2; // Error! Cannot assign an int to a byte! -> previously in JAVA
        System.out.println(e); // yields correct result
        */

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
