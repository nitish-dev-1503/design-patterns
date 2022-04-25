package com.design.patterns.structural.adapter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class QuickPayAdapter implements PaymentGateway {
    private final QuickPay quickPay;

    public QuickPayAdapter(QuickPay quickPay) {
        this.quickPay = quickPay;
    }

    @Override
    public void sendPayment(BigDecimal amountInRupees) {
        var amountInDollar = convertToDollar(amountInRupees);
        quickPay.doPayment(amountInDollar);
    }

    private BigDecimal convertToDollar(BigDecimal amountInRupees) {
        // considered $1 = Rs.70.00 (just for example)
        return amountInRupees.divide(BigDecimal.valueOf(70), RoundingMode.HALF_DOWN);
    }
}
