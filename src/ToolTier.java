public enum ToolTier {
    DIAMOND(10, 2),
    NETHERITE(10, 2);

    private final int attackMultiplier;
    private final int attackSpeed;

    ToolTier(int attackMultiplier, int attackSpeed) {
        this.attackMultiplier = attackMultiplier;
        this.attackSpeed = attackSpeed;
    }

    public int getAttackMultiplier() {
        return this.attackMultiplier;
    }

    public int getAttackSpeed() {
        return this.attackSpeed;
    }
}
