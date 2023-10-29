import java.util.Scanner;

public class Main {
    // Input and Output

    public static void main(String[] args) {
        // Outputting Things with println

        System.out.println("Hello World!");

        int x = 10;
        System.out.println(x);

        System.out.println("Outputting a value: " + x);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your Username: ");
        String input = scanner.nextLine();
        System.out.println("Hello, " + input + "!");
    }
}