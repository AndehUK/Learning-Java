import java.util.Scanner;

public class Main {
    // Exceptions and Try-Catch

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();

        try {
            // This section runs normally, the catch block is triggered if this code throws an exception
            checkForZero(z);
            System.out.println("Valid number!");
        } catch (Exception e) {
            // This is called if a piece of code fails in the try block
            System.out.printf("Caught Exception: %s\n", e.getMessage());
        } finally {
            // Finally is called whether the try-catch fails or not
            System.out.println("Finished!");
        }

        System.out.println("End of program");
    }

    private static void checkForZero(int number) throws TestException {
        if (number == 0) {
            throw new TestException("Number is 0!");
        }
    }
}