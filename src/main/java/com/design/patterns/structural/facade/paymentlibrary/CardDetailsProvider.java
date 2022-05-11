package com.design.patterns.structural.facade.paymentlibrary;

public class CardDetailsProvider {

    public String getCardDetails(String accountDetails) {
        // fetch and return account's card details
        return accountDetails + "'s debit card";
    }
}
