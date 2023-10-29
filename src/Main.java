public class Main {
    // Enums and Advanced Enums

    public static void main(String[] args) {
        Difficulty gameDifficulty = Difficulty.MEDIUM;
        gameDifficulty = Difficulty.HARD;

        ToolTier tier = ToolTier.DIAMOND;
        System.out.println(tier.getAttackMultiplier());
        System.out.println(tier.getAttackSpeed());
    }
}