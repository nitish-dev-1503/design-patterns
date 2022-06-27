package com.design.patterns.behavioural.mediator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AccountMediator {
    private Account account;
    private Statement statement;
    private TransactionHistory transactionHistory;

    public AccountMediator() {
    }

    public void setAccount(Account account) {
        this.account = account;
        account.setAccountMediator(this);
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
        statement.setAccountMediator(this);
    }

    public void setTransactionHistory(TransactionHistory transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public void generateStatement() {
        statement.generate();
    }

    public BigDecimal getTotalTransactionAmount() {
        return transactionHistory.totalTransactionAmount();
    }

    public LocalDate getPaymentDueDate() {
        return transactionHistory.getLastTransactionDate().plusDays(15);
    }
}
