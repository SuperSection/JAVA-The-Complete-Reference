package operators.bitwise;

class OperatorCompoundAssignments {
    public static void main(String[] args) {
        int a = 1; // 001
        int b = 2; // 010
        int c = 3; // 011
        a |= 4;  // 101
        b >>= 1; // 001
        c <<= 1; // 110
        a ^= c;  // 011
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
