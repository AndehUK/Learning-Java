public class Main {
    // Switch Statement

    public static void main(String[] args) {
        int ranking = 1;

        switch (ranking) {
            case 1:
                System.out.println("Congrats! You got a GOLD MEDAL!");
                break;
            case 2:
                System.out.println("Congrats! You got a SILVER MEDAL!");
                break;
            case 3:
                System.out.println("Congrats! You got a BRONZE MEDAL!");
                break;
            default:
                System.out.println("Sorry! You didn't receive a medal for this competition");
                break;
        }
    }
}