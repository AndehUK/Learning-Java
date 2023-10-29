package banking;

public class Account {
    private final String accountID;
    private final Person accountHolder;
    private int balance;

    public Account(String id, int balance, Person person) {
        this.accountID = id;
        this.balance = balance;
        this.accountHolder = person;
    }

    protected void depositAmount(int amount) {
        this.balance += amount;
    }

    protected int withdrawAmount(int amount) {
        this.balance -= amount;
        return amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public boolean isAccountID(String id) {
        return this.accountID.equalsIgnoreCase(id);
    }

    public boolean isAccountHolder(Person person) {
        return accountHolder == person;
    }
}
