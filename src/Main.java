import banking.Bank;
import banking.Person;
import trivia.TriviaGame;

public class Main {
    // Trivia Game 3

    /*
     * Exercise 3:
     * a) Trivia Game with CLASSES and Objects:
     * Modify the Trivia Game we have made in the previous two exercises in such a way to use Classes as well.
     * Imagine possible making custom classes for Question Answer Pairs, using Lists to save them
     *
     * b) Bank Management System:
     * Create a Bank Management System which has the following components:
     * Person (which saves first, middle and last name, age and a "social security number")
     * Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)
     * Checking Account (should have a current value, methods for taking and depositing money)
     * Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.
     */

    public static void main(String[] args) {
        // Uncomment one to play it

        //startBanking();
        playTrivia();
    }

    private static void startBanking() {
        Person andrew = new Person("Andrew", "Mason", 20);
        Person john = new Person("John", "Alex", "Doe", 18);
        Person jane = new Person("Jane", "Doe", 16);

        Bank barclays = new Bank("Barclays");

        barclays.openBankAccount(jane, 200); // Not old Enough

        barclays.openBankAccount(andrew, 2000); // Will work
        barclays.openBankAccount(john, 10); // Initial Deposit too small

        System.out.println(barclays.getAccountByPerson(andrew).getBalance());
        barclays.withdrawAmount(3000, andrew); // Withdrawal amount too high
    }

    private static void playTrivia() {
        TriviaGame game = new TriviaGame();
        game.startGame();
    }
}