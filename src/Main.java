import java.util.Scanner;

public class Main {
    // Trivia Game Exercise

    // Re-create the Trivia Game from before.

    /*
     *
     * Define (at least) five questions with five answers.
     * use arrays to save the Qs and As
     * Create at least 2 methods that make the code more readable and easier to follow
     * BONUS: use an endless while loop with if statements so the user can play until they no longer want to.
     *
     */

    public static void main(String[] args) {
        String[] questions = new String[5];
        String[] answers = new String[5];

        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the Capital of the United Kingdom?";
        questions[2] = "What is the chemical symbol for Iron?";
        questions[3] = "How high is Mount Everest? (Answer in km)";
        questions[4] = "What is the Answer to Life, the Universe and Everything?";

        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";
        answers[3] = "8848";
        answers[4] = "42";

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        while (true) {
            displayTitle();

            for (int i = 0; i < questions.length; i++) {
                displayQuestion(i + 1, questions[i]);
                String userAnswer = scanner.next();

                if (isCorrectAnswer(userAnswer, answers[i])) {
                    displaySuccess(userAnswer);
                    score = addToScore(score, 1);
                    displayScore(score);
                } else {
                    displayFailed(userAnswer, answers[i]);
                }
            }

            displayEndScore(score);
            displayPlayAgain();
            if (scanner.next().equalsIgnoreCase("y")) {
                score = 0;
            } else {
                break;
            }
        }

        goodbye();
    }

    public static void displayTitle() {
        System.out.println("TRIVIA GAME");
        System.out.println("-----------");
    }

    public static int addToScore(int score, int points) {
        return score + points;
    }

    public static void displayScore(int score) {
        System.out.println("You currently have " + score + " points!");
    }

    public static void displayPlayAgain() {
        System.out.println("Would you like to play again? (y/n)");
    }

    public static void displayEndScore(int score) {
        System.out.println("You finished the game with " + score + " points!");
    }

    public static void goodbye() {
        System.out.println("Thanks for playing the TRIVIA GAME!");
    }

    public static void displayQuestion(int questionNum, String question) {
        System.out.println("Question " + questionNum + ": " + question);
    }

    public static boolean isCorrectAnswer(String userAnswer, String correctAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

    public static void displaySuccess(String userAnswer) {
        System.out.println("'" + userAnswer + "' was the correct answer, good job!");
    }

    public static void displayFailed(String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer + "' was NOT the correct answer, the correct answer was: '" + correctAnswer + "'!");
    }
}
