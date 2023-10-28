public class Main {
    // If and Else statements

    public static void main(String[] args) {
        int firstScore = 51;
        int secondScore = 51;

        if (firstScore >= 50) {
            System.out.println("You have passed exam 1 with a score of " + firstScore + "!");
        } else {
            System.out.println("You have failed exam 1 with a score of " + firstScore + ".");
        }

        if (secondScore >= 50) {
            System.out.println("You have passed exam 2 with a score of " + secondScore + "!");
        } else if (secondScore < 0) {
            System.out.println("How did you get a negative score in exam 2? Points: " + secondScore);
        } else {
            System.out.println("You have failed exam 2 with a score of " + secondScore + ".");
        }

        if (firstScore >= 50 && secondScore >= 50) {
            System.out.println("Congrats! You have passed both exams.");
        } else if (firstScore >= 50 || secondScore >= 50) {
            System.out.println("Good Job! You passed 1 of the 2 exams.");
        } else {
            System.out.println("Unfortunately you didn't pass any of the exams. Better luck next time!");
        }
    }
}