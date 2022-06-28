package com.design.patterns.behavioural.command.example1;

public class OpenAccountCommand implements AccountCommand {
    @Override
    public void execute(Account account) {
        account.open();
    }
}
