package trivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TriviaGame {
    private final Scanner scanner = new Scanner(System.in);
    public List<Trivia> questions;
    private int score = 0;
    private int maxScore;

    public void startGame() {
        populateTriviaList();
        gameLoop();
    }

    public void gameLoop() {
        do {
            for (Trivia trivia : questions) {
                trivia.displayQuestion();
                if (trivia.validateAnswer(getUserInput())) {
                    this.score++;
                }

                displayScore();
            }

        } while (!shouldEndGame());

        displayScore();
    }

    public boolean shouldEndGame() {
        askForAbort();
        return endGame(getUserInput());
    }

    private String getUserInput() {
        return scanner.nextLine();
    }

    private boolean endGame(String input) {
        return !input.equalsIgnoreCase("y");
    }

    private void askForAbort() {
        System.out.println("Do you want to play again? (y/n)");
    }

    private void displayScore() {
        System.out.printf("Your score is %s/%s!\n", this.score, this.maxScore);
    }

    private void resetScore() {
        this.score = 0;
    }

    private void populateTriviaList() {
        this.questions = new ArrayList<>();

        this.questions.add(
                new Trivia("How many states does the USA have?", "50")
        );
        this.questions.add(
                new Trivia("What is the Capital of the United Kingdom?", "London")
        );
        this.questions.add(
                new Trivia("What is the chemical symbol for Iron?", "Fe")
        );
        this.questions.add(
                new Trivia("How High is Mount Everest? (Answer in km)", "8848")
        );

        this.questions.add(
                new Trivia("What is the Answer to Life, the Universe and Everything?", "42")
        );
        this.questions.add(
                new Trivia("What is the smallest country in the world?", "Vatican City")
        );
        this.questions.add(
                new Trivia("Who was the first woman to win a Nobel Prize (1903)?", "Marie Curie")
        );
        this.questions.add(
                new Trivia("What is the most prevalent cause of Power Outages in the US?", "Squirrels")
        );

        this.maxScore = this.questions.size();
        Collections.shuffle(this.questions);
    }
}
