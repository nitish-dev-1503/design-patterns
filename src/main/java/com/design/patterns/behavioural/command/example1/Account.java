package com.design.patterns.behavioural.command.example1;

import com.design.patterns.behavioural.mediator.AccountMediator;

public class Account {
    private final String name;
    private final Long accountNumber;

    public Account(String name, Long accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public void open() {
        System.out.println("Opening new account. " + "ACCOUNT HOLDER: " + name + ". ACCOUNT NUMBER:" + accountNumber);
    }

    public void close() {
        System.out.println("Closing account. " + "ACCOUNT HOLDER: " + name + ". ACCOUNT NUMBER:" + accountNumber);
    }
}
