package com.design.patterns.structural.facade.paymentlibrary;

import java.math.BigDecimal;

public interface PaymentGateway {

    void makePayment(BigDecimal amount, String sender, String receiver);

}
