package operators.relational;

class RelationalOperators {
    public static void main(String[] args){
        int a = 4;
        int b = 1;
        boolean c = a < b;
        System.out.println("c = " + c);

        int done = 1;
        // if(done) or if(!done) --> valid in C/C++ but not in Java.
        if (done == 0) {
            System.out.println("The work is not done.");
        }
        if (done != 0) {
            System.out.println("The work is done.");
        }
        /*
        In C/C++, true is any nonzero value and false is zero.
        In Java, true and false are non-numeric values that do not relate to zero or nonzero.
        Therefore, to test for zero or nonzero, you must explicitly employ one or more of the relational operators.
        */
    }
}
