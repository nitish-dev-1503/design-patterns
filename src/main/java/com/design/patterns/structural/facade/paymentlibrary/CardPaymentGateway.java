package com.design.patterns.structural.facade.paymentlibrary;

import java.math.BigDecimal;

public class CardPaymentGateway implements PaymentGateway {

    private final SenderDetailsProvider senderDetailsProvider;
    private final ReceiverDetailsProvider receiverDetailsProvider;
    private final CardDetailsProvider cardDetailsProvider;

    public CardPaymentGateway(SenderDetailsProvider senderDetailsProvider, ReceiverDetailsProvider receiverDetailsProvider, CardDetailsProvider cardDetailsProvider) {
        this.senderDetailsProvider = senderDetailsProvider;
        this.receiverDetailsProvider = receiverDetailsProvider;
        this.cardDetailsProvider = cardDetailsProvider;
    }

    @Override
    public void makePayment(BigDecimal amount, String sender, String receiver) {
        var senderDetails = senderDetailsProvider.fetchSenderDetails(sender);
        var receiverDetails = receiverDetailsProvider.fetchReceiverDetails(receiver);
        var cardDetails = cardDetailsProvider.getCardDetails(senderDetails);

        System.out.println("Payment of Rs. " + amount + " SUCCESSFUL using " + cardDetails + ". " +
                "Sender: " + senderDetails + ". Receiver: " + receiverDetails);
    }
}
