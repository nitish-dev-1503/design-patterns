package com.design.patterns.behavioural.mediator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        var account = new Account("Ram", 99887766L);

        var statement = new Statement();

        var transactionHistory = new TransactionHistory();
        var transaction = new Transaction(BigDecimal.TEN, LocalDate.now());
        transactionHistory.addTransaction(transaction);
        transactionHistory.addTransaction(transaction);

        var accountMediator = new AccountMediator();
        accountMediator.setAccount(account);
        accountMediator.setStatement(statement);
        accountMediator.setTransactionHistory(transactionHistory);

        account.generateStatement();
    }
}
