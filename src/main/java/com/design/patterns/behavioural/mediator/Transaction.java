package com.design.patterns.behavioural.mediator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private final BigDecimal amount;
    private final LocalDate date;

    public Transaction(BigDecimal amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}
