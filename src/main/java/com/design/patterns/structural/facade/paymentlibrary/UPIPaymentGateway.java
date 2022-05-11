package com.design.patterns.structural.facade.paymentlibrary;

import java.math.BigDecimal;

public class UPIPaymentGateway implements PaymentGateway {

    private final SenderDetailsProvider senderDetailsProvider;
    private final ReceiverDetailsProvider receiverDetailsProvider;

    public UPIPaymentGateway(SenderDetailsProvider senderDetailsProvider, ReceiverDetailsProvider receiverDetailsProvider) {
        this.senderDetailsProvider = senderDetailsProvider;
        this.receiverDetailsProvider = receiverDetailsProvider;
    }

    @Override
    public void makePayment(BigDecimal amount, String sender, String receiver) {
        var senderDetails = senderDetailsProvider.fetchSenderDetails(sender);
        var receiverDetails = receiverDetailsProvider.fetchReceiverDetails(receiver);

        System.out.println("Payment of Rs. " + amount + " SUCCESSFUL using UPI. " +
                "Sender: " + senderDetails + ". Receiver: " + receiverDetails);
    }
}
