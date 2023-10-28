import java.util.Scanner;

public class Main {
    // Trivia Game Exercise

    // Create a Simple Trivia Game

    /*
     *
     * Define (at least) three questions with 3 answers.
     * Prompt the user to type in their answer using Scanner.
     * Then use if/else statements to check if the answer from the user is correct, and output that result.
     * If they were wrong, tell the user and output the correct answer.
     *
     * BONUS: Increment a points total each time the user is correct and at the end make a unique output for each score
     * the user might have (0 to 3)
     *
     * Important Tips:
     * 1. When reading Strings from the user use scanner.next() (NOT scanner.nextLine())
     * 2. When you have an answer and input that are both strings you will have to use:
     *       userInput.equals(answer) instead of userInput == answer
     *
     */


    public static int isCorrect(int score, String userAnswer, String correctAnswer) {
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The answer is " + correctAnswer + ".");
        }
        System.out.println();
        return score;
    }

    public static void main(String[] args) {
        String question1 = "How many states does the USA have?";
        String question2 = "What is the capital of the United Kingdom?";
        String question3 = "What is the chemical symbol for Iron?";

        int answer1 = 50;
        String answer2 = "London";
        String answer3 = "Fe";

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        // Question 1
        System.out.println(question1);
        String userAnswer1 = scanner.next();
        score = isCorrect(score, userAnswer1, Integer.toString(answer1));

        // Question 2
        System.out.println(question2);
        String userAnswer2 = scanner.next();
        score = isCorrect(score, userAnswer2, answer2);

        // Question 3
        System.out.println(question3);
        String userAnswer3 = scanner.next();
        score = isCorrect(score, userAnswer3, answer3);

        System.out.println("----------");
        switch (score) {
            case 3:
                System.out.println("Congrats! You answered all 3 questions correctly!");
                break;
            case 2:
                System.out.println("Good Job! You answered 2 of the 3 questions correctly!");
                break;
            case 1:
                System.out.println("Nice try! You answered 1 of the 3 questions correctly!");
                break;
            case 0:
                System.out.println("Unlucky! You didn't answer any questions correctly. Better luck next time!");
                break;
            default:
                System.out.println("That's not possible... You got an invalid score of " + score + "!?!?");
        }

    }

}
