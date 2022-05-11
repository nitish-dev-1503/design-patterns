package com.design.patterns.structural.facade.paymentlibrary;

public class SenderDetailsProvider {

    public String fetchSenderDetails(String sender) {
        // verify sender's basic information
        verify(sender);
        // fetch sender's complete details and return
        return fetchCompleteDetails(sender);
    }

    private String fetchCompleteDetails(String sender) {
        // sender's complete details
        return sender;
    }

    private void verify(String sender) {
        // verify if sender's basic information are valid
        System.out.println("verify sender's basic details " + sender);
    }
}
