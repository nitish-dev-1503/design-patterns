package com.design.patterns.structural.adapter;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        var paymentGateway = new QuickPayAdapter(new QuickPay());

        var amountInRupees = BigDecimal.valueOf(120.00);
        paymentGateway.sendPayment(amountInRupees);
    }
}
