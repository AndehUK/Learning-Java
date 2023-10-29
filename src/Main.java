public class Main {
    public static void main(String[] args) {
        // Ternary Operator

        int exam = 65;
        int gift = 0;

        // If statement version:
        if (exam >= 50) {
            gift = 10;
        } else {
            gift = 0;
        }
        System.out.println(gift);

        gift = (exam >= 50) ? 10 : 0;
        System.out.println(gift);
    }

}
