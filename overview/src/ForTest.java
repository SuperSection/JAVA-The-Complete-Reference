/*
 Demonstrate the for loop.
 Call this file "ForTest.java".
*/
class ForTest {
    public static void main(String[] args) {
        int x;
        for(x = 0; x<10; x = x+1) // USUALLY LOOKS LIKE: for(x = 0; x<10; x++)
            System.out.println("This is x: " + x);
    }
}
