package com.design.patterns.structural.facade;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        var paymentProcessor = new PaymentProcessor();

        var sender = "Ram";
        var receiver = "Big Bazaar";
        var amount = BigDecimal.valueOf(599.00);

        var selectedPaymentMethod = PaymentMethod.CARD;
        switch (selectedPaymentMethod) {
            case CARD -> paymentProcessor.payUsingCard(amount, sender, receiver);
            case UPI -> paymentProcessor.payUsingUPI(amount, sender, receiver);
            case WALLET -> paymentProcessor.payUsingWallet(amount, sender, receiver);
        }
    }
}
