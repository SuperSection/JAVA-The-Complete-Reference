package datatypes;

/* "automatic type conversion" takes place if two conditions are met
      • The two types are compatible.
      • The destination type is larger than the source type.
*/
// explicit type conversion -> (target-type) value

// Demonstrate casts.
class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversion of int to byte.");
        b = (byte) i; // integer value % 256
        System.out.println("i and b " + i + " " + b);

        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);

        System.out.println("\nConversion of double to byte.");
        b = (byte) d; // integer part % 256
        System.out.println("d and b " + d + " " + b);
    }
}
