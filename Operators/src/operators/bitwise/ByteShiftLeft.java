package operators.bitwise;

// Left shifting a byte value.
class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}


// Left shifting as a quick way to multiply by 2.
class MultiplyByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for(i=0; i<4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}