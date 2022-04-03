package com.design.patterns.builder.account;

import java.time.LocalDate;

public class Account {
    private final String name;
    private final Long accountNumber;
    private final LocalDate dateOfBirth;

    private final Nominee nominee;
    private final Card card;
    private final Checkbook checkbook;

    public Account(String name, Long accountNumber, LocalDate dateOfBirth, Nominee nominee, Card card, Checkbook checkbook) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.dateOfBirth = dateOfBirth;
        this.nominee = nominee;
        this.card = card;
        this.checkbook = checkbook;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", dateOfBirth=" + dateOfBirth +
                ", nominee=" + nominee +
                ", card=" + card +
                ", checkbook=" + checkbook +
                '}';
    }
}