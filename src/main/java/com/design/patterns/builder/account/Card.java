package com.design.patterns.builder.account;

import java.time.LocalDate;

public class Card {
    private final Long cardNumber;
    private final LocalDate expiry;
    private final String cvv;
    private final Boolean isActive;
    private final String cardType;

    public Card(Long cardNumber, LocalDate expiry, String cvv, Boolean isActive, String cardType) {
        this.cardNumber = cardNumber;
        this.expiry = expiry;
        this.cvv = cvv;
        this.isActive = isActive;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", expiry=" + expiry +
                ", cvv='" + cvv + '\'' +
                ", isActive=" + isActive +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}