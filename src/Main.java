public class Main {
    // Casting (Converting data types between each other)

    public static void main(String[] args) {

        int loan = 750;
        float interestRate = 0.0525f;

        float implicitinterest = loan * interestRate;
        float explicitInterest = (float) loan * interestRate;

        int x = (int) 50.5f + (int) 20.6f; // Rounds down
        System.out.println(x);
    }
}
