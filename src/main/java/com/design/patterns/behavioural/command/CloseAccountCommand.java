package com.design.patterns.behavioural.command;

public class CloseAccountCommand implements AccountCommand {
    @Override
    public void execute(Account account) {
        account.close();
    }
}
