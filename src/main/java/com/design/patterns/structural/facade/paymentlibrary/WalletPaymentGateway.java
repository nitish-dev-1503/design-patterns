package com.design.patterns.structural.facade.paymentlibrary;

import java.math.BigDecimal;

public class WalletPaymentGateway implements PaymentGateway {
    private final SenderDetailsProvider senderDetailsProvider;
    private final ReceiverDetailsProvider receiverDetailsProvider;
    private final WalletDetailsProvider walletDetailsProvider;

    public WalletPaymentGateway(SenderDetailsProvider senderDetailsProvider, ReceiverDetailsProvider receiverDetailsProvider, WalletDetailsProvider walletDetailsProvider) {
        this.senderDetailsProvider = senderDetailsProvider;
        this.receiverDetailsProvider = receiverDetailsProvider;
        this.walletDetailsProvider = walletDetailsProvider;
    }

    @Override
    public void makePayment(BigDecimal amount, String sender, String receiver) {
        var senderDetails = senderDetailsProvider.fetchSenderDetails(sender);
        var receiverDetails = receiverDetailsProvider.fetchReceiverDetails(receiver);
        var walletDetails = walletDetailsProvider.getWalletDetails(senderDetails);

        System.out.println("Payment of Rs. " + amount + " SUCCESSFUL using " + walletDetails + ". " +
                "Sender: " + senderDetails + ". Receiver: " + receiverDetails);
    }
}
