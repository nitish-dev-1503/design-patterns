package com.design.patterns.behavioural.chainofresponsibility.example1.handlers;

import com.design.patterns.behavioural.chainofresponsibility.example1.CycleRequest;

import java.math.BigDecimal;

import static java.util.Objects.nonNull;

public class FinanceChargeHandler implements EndOfCycleHandler {
    private EndOfCycleHandler nextHandler;

    public void setNextHandler(EndOfCycleHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public CycleRequest process(CycleRequest cycleRequest) {
        // calculate finance charge
        var calculatedFinanceCharge = BigDecimal.ONE;
        cycleRequest.setFinanceCharge(calculatedFinanceCharge);

        if (nonNull(nextHandler)) {
            return nextHandler.process(cycleRequest);
        }
        return cycleRequest;
    }
}
