package com.design.patterns.behavioural.command.example1;

public class CloseAccountCommand implements AccountCommand {
    @Override
    public void execute(Account account) {
        account.close();
    }
}
