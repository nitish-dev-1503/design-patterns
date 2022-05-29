package com.design.patterns.behavioural.mediator;

public class Account {
    private final String name;
    private final Long accountNumber;

    private final AccountMediator accountMediator;

    public Account(String name, Long accountNumber, AccountMediator accountMediator) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountMediator = accountMediator;
    }

    public void generateStatement() {
        System.out.println("Statement generated for " + name + ". ACCOUNT NUMBER: " + accountNumber);
        accountMediator.generateStatement();
    }
}
