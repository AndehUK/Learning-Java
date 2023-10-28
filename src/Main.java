public class Main {
    // Boolean and Comparison Operators

    public static void main(String[] args) {

        boolean aTruthyValue = true;
        boolean aFalsyValue = false;

        System.out.println("This is a Truthy boolean value: " + aTruthyValue);
        System.out.println("This is a Falsy boolean value: " + aFalsyValue);

        // Comparison Operators

        int score = 98;

        boolean passed = score >= 50; // true
        System.out.println("You passed: " + passed + " with " + score + " points!");

        boolean hasPerfectScore = score == 100; // False, 98 is not equal to 100
        System.out.println("Perfect Score? " + hasPerfectScore);

        boolean failedClass = !passed; // Turns a true into false, and false into true (Inverts the boolean value)
    }
}