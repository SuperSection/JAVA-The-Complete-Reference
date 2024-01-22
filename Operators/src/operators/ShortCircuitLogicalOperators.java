package operators;

public class ShortCircuitLogicalOperators {
    public static void main(String[] args) {
        int numerator = 200;
        int denominator = 5;

        if (denominator != 0 && numerator / denominator > 10) {
            System.out.println("Quotient = " + numerator/denominator);
        } else {
            System.out.println("Sorry, can't show you the result!");
        }
    }
}
