package com.design.patterns.structural.facade.paymentlibrary;

public class WalletDetailsProvider {

    public String getWalletDetails(String accountDetails) {
        // fetch and return complete wallet details
        return accountDetails + "'s Paytm wallet";
    }
}
