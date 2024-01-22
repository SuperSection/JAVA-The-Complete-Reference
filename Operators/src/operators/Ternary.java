package operators;
/*
General form -
expression1 ? expression2 : expression3

-> expression1 can be any expression that evaluates to a boolean value
-> If expression1 is true, then expression2 is evaluated
-> otherwise, expression3 is evaluated
-> Both  expression2 and expression3 are required to return the same (or compatible) type,
   which can’t be void.
*/

// Demonstrate ?.
class Ternary {
    public static void main(String[] args) {

        int i, k;
        i = 10;
        k = i < 0 ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);
        i = -10;
        k = i < 0 ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);
    }
}
