package arrays;

public class AlternativeArrayDeclaration {
    // the following two declarations are equivalent:
    int a1[] = new int[3];
    int[] a2 = new int[3];

    // the following declarations are also equivalent:
    char twoDArray1[][] = new char[3][4];
    char[][] twoDArray2 = new char[3][4];
}

/* This alternative declaration form offers convenience when converting code from C/C++ to Java.
   Both forms of array declaration are legal in Java.
*/