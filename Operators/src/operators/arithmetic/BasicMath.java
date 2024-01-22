package operators.arithmetic;

// Demonstrate the basic arithmetic operators.
class BasicMath {
    public static void main(String[] args) {
        // arithmetic using integers
        System.out.println("Integer Arithmetic");
        int a = 1 + 1; // Addition
        int b = a * 3; // Multiplication
        int c = b / 4; // Division
        int d = c - a; // Subtraction
        int e = -d; // unary minus operator negates its single operand.
        int f = +d; // unary plus operator simply returns the value of its operand.
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        // arithmetic using doubles
        System.out.println("\nFloating Point Arithmetic");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }
}
