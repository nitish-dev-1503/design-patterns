package com.design.patterns.creational.builder.account;

import java.time.LocalDate;

public class Checkbook {
    private final String checkbookNumber;
    private final LocalDate expiry;

    public Checkbook(String checkbookNumber, LocalDate expiry) {
        this.checkbookNumber = checkbookNumber;
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "Checkbook{" +
                "checkbookNumber='" + checkbookNumber + '\'' +
                ", expiry=" + expiry +
                '}';
    }
}