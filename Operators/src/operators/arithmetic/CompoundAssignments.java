package operators.arithmetic;
/*
any statement of the form
    var = var op expression;
can be rewritten as
    var op= expression;
*/

// Demonstrate several assignment operators.
public class CompoundAssignments {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
