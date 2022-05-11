package com.design.patterns.structural.facade;

import com.design.patterns.structural.facade.paymentlibrary.*;

import java.math.BigDecimal;

public class PaymentProcessor {
    private final SenderDetailsProvider senderDetailsProvider;
    private final ReceiverDetailsProvider receiverDetailsProvider;

    public PaymentProcessor() {
        this.senderDetailsProvider = new SenderDetailsProvider();
        this.receiverDetailsProvider = new ReceiverDetailsProvider();
    }

    public void payUsingUPI(BigDecimal amount, String sender, String receiver) {
        var upiPaymentGateway = new UPIPaymentGateway(senderDetailsProvider, receiverDetailsProvider);
        upiPaymentGateway.makePayment(amount, sender, receiver);
    }

    public void payUsingCard(BigDecimal amount, String sender, String receiver) {
        var cardDetailsProvider = new CardDetailsProvider();
        var cardPaymentGateway = new CardPaymentGateway(senderDetailsProvider, receiverDetailsProvider, cardDetailsProvider);
        cardPaymentGateway.makePayment(amount, sender, receiver);
    }

    public void payUsingWallet(BigDecimal amount, String sender, String receiver) {
        var walletDetailsProvider = new WalletDetailsProvider();
        var walletPaymentGateway = new WalletPaymentGateway(senderDetailsProvider, receiverDetailsProvider, walletDetailsProvider);
        walletPaymentGateway.makePayment(amount, sender, receiver);
    }
}
