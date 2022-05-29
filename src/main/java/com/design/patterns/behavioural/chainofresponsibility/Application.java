package com.design.patterns.behavioural.chainofresponsibility;

import com.design.patterns.behavioural.chainofresponsibility.handlers.BaseEOCHandler;
import com.design.patterns.behavioural.chainofresponsibility.handlers.FinanceChargeHandler;
import com.design.patterns.behavioural.chainofresponsibility.handlers.LateFeeHandler;
import com.design.patterns.behavioural.chainofresponsibility.handlers.MinimumPaymentHandler;

public class Application {
    public static void main(String[] args) {
        var baseEOCHandler = new BaseEOCHandler();
        var financeChargeHandler = new FinanceChargeHandler();
        var lateFeeHandler = new LateFeeHandler();
        var minimumPaymentHandler = new MinimumPaymentHandler();

        lateFeeHandler.setNextHandler(minimumPaymentHandler);
        financeChargeHandler.setNextHandler(lateFeeHandler);
        baseEOCHandler.setNextHandler(financeChargeHandler);

        var processedRequest = baseEOCHandler.process(new CycleRequest());

        System.out.println("PROCESSING COMPLETE");
        System.out.println("Finance Charge: " + processedRequest.getFinanceCharge());
        System.out.println("Late Fee: " + processedRequest.getLateFee());
        System.out.println("Minimum Payment Due: " + processedRequest.getMinimumPaymentDue());

    }
}
