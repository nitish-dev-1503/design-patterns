package com.design.patterns.structural.facade.paymentlibrary;

public class ReceiverDetailsProvider {
    public String fetchReceiverDetails(String receiver) {
        // verify receiver's basic information
        verify(receiver);

        // fetch receiver's complete information and return
        return fetchCompleteDetails(receiver);
    }

    private String fetchCompleteDetails(String receiver) {
        // receiver's complete details
        return receiver;
    }

    private void verify(String receiver) {
        System.out.println("Verifying receiver's basic information " + receiver);
    }
}
