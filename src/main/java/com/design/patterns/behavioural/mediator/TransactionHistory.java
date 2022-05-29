package com.design.patterns.behavioural.mediator;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    private final List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public BigDecimal totalTransactionAmount() {
        var totalAmount = BigDecimal.ZERO;
        for (var transaction : transactions) {
            totalAmount = totalAmount.add(transaction.getAmount());
        }
        return totalAmount;
    }

    public LocalDate getLastTransactionDate() {
        var lastTransDate = LocalDate.MIN;
        for (var transaction : transactions) {
            var transactionDate = transaction.getDate();
            if (transactionDate.isAfter(lastTransDate)) {
                lastTransDate = transactionDate;
            }
        }
        return lastTransDate;
    }
}
