public class Main {
    // Arithmetic Operators

    public static void main(String[] args) {
        // Integers, Math and Arithmetic Operators

        int x = 100;
        int y = 20;

        // Addition (+)
        int result = x + y;
        System.out.println(result);

        // Subtraction (-)
        // We're also reassigning a variable here
        result = x - y;
        System.out.println(result);

        // Multiplication (*)
        result = x * y;
        System.out.println(result);

        // Division (/)
        result = x / y;
        System.out.println(result);

        // Remainder (%)
        result = 20 % 2;
        System.out.println(result);

        // Math methods
        System.out.println("---------");
        System.out.println(Math.max(x, y));
        System.out.println(Math.abs(-500)); // |-500| = 500
    }
}