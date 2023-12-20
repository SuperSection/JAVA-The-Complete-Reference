package variables;

public class Literals {

    // Integer Literals
    int octalValue = 0176;

    long hexadecimalValue = 0x7ffffffffffffffL;
    long longValue = 9223372036854775807L;

    int binaryOf10 = 0b1010;

    int readability = 123_456_789;
    int moreSeparated = 123___456___789;
    int visualGroupingOfBinaryNumber = 0b1101_0101_0001_1010;


    // Floating-Point Literals
    float floatLiteral = 2.6667f;
    double defaultPrecisionOfJava = 3.14159;

    double moreReadable = 9_423_497_862.0;
    double moreUnderscoresSeparated = 9___423___497.1__0__9;


    // Boolean Literals -> only two logical values
    boolean trueValue = true;
    boolean falseValue = false;
    /* the 'true' literal in Java does not equal 1, nor does the 'false' literal equal 0 */


    // Character Literals
    char newline = '\n';
    char at_sign = '@';
    char single_quote = '\'';
    char octal_a = '\141';
    char hexadecimal_a = '\u0061';
    char japaneseKatana_char = '\ua432';


    // String Literals
    String lineInQuotes = "\"This is in quotes\"";
    String octalCharacter = "\27";
    String hexadecimalCharacter = "\u8FA6";
    String backspace = "LoveU\b";

}
