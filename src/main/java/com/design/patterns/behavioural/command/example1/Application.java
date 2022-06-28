package com.design.patterns.behavioural.command.example1;

public class Application {
    public static void main(String[] args) {
        var account = new Account("Ram", 99887766L);

        var openAccountCommand = new OpenAccountCommand();
        openAccountCommand.execute(account);

        var closeAccountCommand = new CloseAccountCommand();
        closeAccountCommand.execute(account);
    }
}
