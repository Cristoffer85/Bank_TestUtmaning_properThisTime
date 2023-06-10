package org.example;

public class Account {
    private double balance;
    private final int accountNr;

    public Account(double initialCash, int accountNr) {
        this.balance = initialCash;
        this.accountNr = accountNr;
    }

    public void deposit(double cash) {
        if (cash < 0) {
            throw new IllegalArgumentException("Jag är ledsen, du kan inte sätta in endast: " + cash);
        }
        balance += cash;
    }

    public void withdraw(double cash) {
        if (cash < 0) {
            throw new IllegalArgumentException("Jag är ledsen, du kan inte ta ut endast: " + cash);
        }
        if (cash > balance) {
            throw new IllegalStateException("Jag är ledsen, det finns inte så mycket pengar på kontot :( Du kan inte ta ut: " + cash);
        }
        balance -= cash;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNr() {
        return accountNr;
    }
}