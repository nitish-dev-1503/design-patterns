package com.design.patterns.behavioural.mediator;

public class Account {
    private final String name;
    private final Long accountNumber;

    private AccountMediator accountMediator;

    public Account(String name, Long accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public void setAccountMediator(AccountMediator accountMediator) {
        this.accountMediator = accountMediator;
    }

    public void generateStatement() {
        System.out.println("Statement generated for " + name + ". ACCOUNT NUMBER: " + accountNumber);
        accountMediator.generateStatement();
    }
}
