package com.design.patterns.creational.builder;

import com.design.patterns.creational.builder.account.Account;
import com.design.patterns.creational.builder.account.Card;
import com.design.patterns.creational.builder.account.Checkbook;
import com.design.patterns.creational.builder.account.Nominee;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        var accountHolderName = "Mr. Account Holder";
        var accountNumber = 1234567812345678L;
        var dateOfBirth = LocalDate.of(1996, 12, 1);

        var accountWithCard = getAccountWithCardDetails(accountHolderName, accountNumber, dateOfBirth);
        var accountWithNomineeAndCardDetails = getAccountWithNomineeAndCardDetails(accountHolderName, accountNumber, dateOfBirth);
        var accountWithNomineeCardAndCheckbookDetails = getAccountWithNomineeCardAndCheckbookDetails(accountHolderName, accountNumber, dateOfBirth);

        System.out.println("ACCOUNT WITH CARD: " + accountWithCard);
        System.out.println("ACCOUNT WITH NOMINEE & CARD: " + accountWithNomineeAndCardDetails);
        System.out.println("ACCOUNT WITH NOMINEE, CARD & CHECKBOOK: " + accountWithNomineeCardAndCheckbookDetails);

    }

    private static Account getAccountWithNomineeCardAndCheckbookDetails(String accountHolderName, long accountNumber, LocalDate dateOfBirth) {
        return new AccountBuilder()
                .withName(accountHolderName)
                .withAccountNumber(accountNumber)
                .withDateOfBirth(dateOfBirth)
                .withCard(getDebitCard())
                .withNominee(getNominee())
                .withCheckbook(getCheckbook())
                .build();
    }

    private static Account getAccountWithNomineeAndCardDetails(String accountHolderName, long accountNumber, LocalDate dateOfBirth) {
        return new AccountBuilder()
                .withName(accountHolderName)
                .withAccountNumber(accountNumber)
                .withDateOfBirth(dateOfBirth)
                .withCard(getDebitCard())
                .withNominee(getNominee())
                .build();
    }

    private static Account getAccountWithCardDetails(String accountHolderName, long accountNumber, LocalDate dateOfBirth) {
        return new AccountBuilder()
                .withName(accountHolderName)
                .withAccountNumber(accountNumber)
                .withDateOfBirth(dateOfBirth)
                .withCard(getDebitCard())
                .build();
    }

    private static Nominee getNominee() {
        return new Nominee("Nominee Name", "Father", 50);
    }

    private static Checkbook getCheckbook() {
        return new Checkbook("CHK12345678", LocalDate.of(2025, 4, 1));
    }

    private static Card getDebitCard() {
        var cardNumber = 9988776655443322L;
        var expiry = LocalDate.of(2024, 4, 12);
        var cvv = "123";
        var cardType = "DEBIT";
        return new Card(cardNumber, expiry, cvv, true, cardType);
    }
}
