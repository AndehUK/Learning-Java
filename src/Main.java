import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] questions = new String[3];
        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the capital of the United Kingdom?";
        questions[2] = "What is the chemical symbol for Iron?";

        String[] answers = new String[3];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";

        // int = i (Variable declaration)
        // i < 5 (The condition for the for loop to keep running)
        // i++ (What to do after every iteration)
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
        }

        // forEach
        for (String question : questions) {
            System.out.println(question);
        }

        // While Loop, ends when break is called
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to continue?");
            if (scanner.next().equalsIgnoreCase("yes")) {
                continue;
            } else {
                break;
            }
        }
    }
}
