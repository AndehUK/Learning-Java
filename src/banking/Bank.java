package banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
    public static final int MAX_WITHDRAW = 500;
    private final int MIN_INITIAL_DEPOSIT = 150;
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<Account>();
    }

    public boolean withdrawAmount(int amount, Person person) {
        Account account = getAccountByPerson(person);
        if (account.getBalance() - amount <= -MAX_WITHDRAW) {
            System.out.printf("Cannot withdraw over the limit of %s!\n", Bank.MAX_WITHDRAW);
            return false;
        }

        account.withdrawAmount(amount);
        return true;
    }

    public boolean openBankAccount(Person person, int initialDeposit) {
        boolean bankOpened = canBankAccount(person, initialDeposit);

        if (bankOpened) {
            accounts.add(new Account(getRandomID(), initialDeposit, person));
        }

        return bankOpened;
    }

    private String getRandomID() {
        int id = new Random().nextInt(4124124);
        return this.name.charAt(0) + ":" + id;
    }

    public Account getAccountByPerson(Person person) {
        for (Account account : accounts) {
            if (account.isAccountHolder(person)) {
                return account;
            }
        }

        return null;
    }

    private boolean canBankAccount(Person person, int initialDeposit) {
        boolean bankOpened = false;
        if (!person.isOlderThan(16)) {
            System.out.printf("%s is not old enough to open a Bank Account!\n", person.getFullName());
        } else {
            bankOpened = true;
        }

        if (initialDeposit < MIN_INITIAL_DEPOSIT) {
            System.out.printf(
                    "The Deposit of %s is not enough. Deposit must be a minimum of %s\n",
                    initialDeposit,
                    MIN_INITIAL_DEPOSIT
            );
        } else {
            bankOpened = true;
        }

        return bankOpened;
    }
}
