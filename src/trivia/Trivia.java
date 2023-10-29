package trivia;

public class Trivia {
    public String question;
    public String answer;

    public Trivia(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public boolean isCorrectAnswer(String userAnswer) {
        return this.answer.equalsIgnoreCase(userAnswer);
    }

    public void displayQuestion() {
        System.out.println(question);
    }

    public void displayAnswer() {
        System.out.println(answer);
    }

    public boolean validateAnswer(String userAnswer) {
        boolean valid = isCorrectAnswer(userAnswer);

        if (valid) {
            printCorrect();
        } else {
            printIncorrect();
        }

        return valid;
    }

    private void printCorrect() {
        System.out.println("Good job! That was the correct answer.");
    }

    private void printIncorrect() {
        System.out.printf("Incorrect. The correct answer was %s.", this.answer);
    }
}
