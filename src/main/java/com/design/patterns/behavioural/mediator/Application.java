package com.design.patterns.behavioural.mediator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        var statement = new Statement();
        var transactionHistory = new TransactionHistory();

        var accountMediator = new AccountMediator(statement, transactionHistory);

        statement.setAccountMediator(accountMediator);

        var transaction = new Transaction(BigDecimal.TEN, LocalDate.now());
        transactionHistory.addTransaction(transaction);
        transactionHistory.addTransaction(transaction);

        var account = new Account("Ram", 99887766L, accountMediator);
        account.generateStatement();
    }
}
