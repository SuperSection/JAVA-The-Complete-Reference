package variables;

class LocalVariableTypeInference {
    public static void main(String[] args) {
        double explicitlyDeclaredVariable = 1.17;

        /* Use type inference to determine the type of the variable
           In this case, double is inferred. */
        var localVariableTypeInference = 10.5;
        System.out.println("Value of the variable: " + localVariableTypeInference);

        /* In the following context, var is not a predefined identifier.
           It is simply a user-defined variable name. */
        int var = 5;
        System.out.println("Value of var: " + var);

        /* Interestingly, in the following sequence,
        'var' is used as both the type of the declaration and as a variable name in the initializer. */
        var k = -var;
        System.out.println("Value of k: " + k);


        /* you can also use 'var' to declare an array */
        var myArray = new int[10]; // This is valid.

        // var[] myArray = new int[10]; // Wrong
        // var myArray[] = new int[10]; // Wrong
        /* In both cases, the use of the brackets is wrong
        because the type is inferred from the type of the initializer */

        /* Although you can declare an array type using var,you cannot use var with an array initializer. */
        // var myArray = { 1, 2, 3 }; // Wrong


        /*
        1. 'var' cannot be used as the name of a class
        2. It also cannot be used as the name of other reference types, including an interface, enumeration, or annotation, or as the name of a generic type parameter.
        2. Local variable type inference cannot be used to declare the exception type caught by a catch statement.
        2. Neither lambda expressions nor method references can be used as initializers.
        */
    }
}
