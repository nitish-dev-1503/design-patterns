package com.design.patterns.creational.builder;

import com.design.patterns.creational.builder.account.Account;
import com.design.patterns.creational.builder.account.Card;
import com.design.patterns.creational.builder.account.Checkbook;
import com.design.patterns.creational.builder.account.Nominee;

import java.time.LocalDate;

public class AccountBuilder {
    private String name;
    private Long accountNumber;
    private LocalDate dateOfBirth;

    private Nominee nominee;
    private Card card;
    private Checkbook checkbook;

    public AccountBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AccountBuilder withAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public AccountBuilder withDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public AccountBuilder withNominee(Nominee nominee) {
        this.nominee = nominee;
        return this;
    }

    public AccountBuilder withCard(Card card) {
        this.card = card;
        return this;
    }

    public AccountBuilder withCheckbook(Checkbook checkbook) {
        this.checkbook = checkbook;
        return this;
    }

    public Account build() {
        return new Account(name, accountNumber, dateOfBirth, nominee, card, checkbook);
    }
}
