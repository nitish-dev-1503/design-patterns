package com.design.patterns.behavioural.chainofresponsibility.handlers;

import com.design.patterns.behavioural.chainofresponsibility.CycleRequest;

import java.math.BigDecimal;

import static java.util.Objects.nonNull;

public class MinimumPaymentHandler implements EndOfCycleHandler {
    private EndOfCycleHandler nextHandler;

    public void setNextHandler(EndOfCycleHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public CycleRequest process(CycleRequest cycleRequest) {
        // calculate min payment due
        var calculatedMinPayDue = BigDecimal.ONE;
        cycleRequest.setMinimumPaymentDue(calculatedMinPayDue);

        if (nonNull(nextHandler)) {
            return nextHandler.process(cycleRequest);
        }
        return cycleRequest;
    }
}
