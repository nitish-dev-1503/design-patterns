package com.design.patterns.behavioural.command;

public class OpenAccountCommand implements AccountCommand {
    @Override
    public void execute(Account account) {
        account.open();
    }
}
