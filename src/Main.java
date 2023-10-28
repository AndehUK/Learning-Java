public class Main {
    // Data Types

    public static void main(String[] args) {
        // Numerical Types

        // Commonly Used
        int aNumber = 42; // Integer (Whole Number) [-2,147,483,648 to 2,147,483,647]
        float aFloatingNumber = 13.37f; // Floating point number (7 decimal point precision)
        double aDoubleNumber = 420.0005f; // Double number (15 decimal point precision)
        // 1.412 * 10^4 = 14120

        // Sometimes Used
        byte aTinyNumber = 100; // One byte (or 8 bits) stores numbers from -128 to 127
        short aSmallNumber = 30000; // shorts store numbers from -32,768 to 32,767
        long aLongNumber = 50000000; // longs store numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // Booleans (Logic)

        boolean aTruthyValue = true;
        boolean aFalsyValue = false;

        // Characters and Strings

        char aSingleCharacter = 'A'; // Stores a single character. Can also include special characters like punctuation
        // Must use single quotes, not double, for a char value

        String message = "Hello World!";
        String test = null; // null is not 0, but is literally empty. It has no value. Also, a falsy value.
    }
}