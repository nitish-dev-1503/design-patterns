package com.design.patterns.structural.adapter;

import java.math.BigDecimal;

public interface PaymentGateway {
    void sendPayment(BigDecimal amountInRupees);
}
