package operators.arithmetic;
/*
In the prefix form,
    the operand is incremented or decremented before the value is obtained for use in the expression.
In postfix form,
    the previous value is obtained for use in the expression, and then the operand is modified.
*/

// Demonstrate the increment operator(++).
public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a++;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
