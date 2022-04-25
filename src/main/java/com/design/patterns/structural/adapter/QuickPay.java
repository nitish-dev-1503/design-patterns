package com.design.patterns.structural.adapter;

import java.math.BigDecimal;

public class QuickPay {
    public void doPayment(BigDecimal amountInDollar) {
        System.out.println("Payment of $" + amountInDollar + " : SUCCESSFUL");
    }

}
