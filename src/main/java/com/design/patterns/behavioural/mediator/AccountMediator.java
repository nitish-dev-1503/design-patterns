package com.design.patterns.behavioural.mediator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AccountMediator {
    private final Statement statement;
    private final TransactionHistory transactionHistory;

    public AccountMediator(Statement statement, TransactionHistory transactionHistory) {
        this.statement = statement;
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
