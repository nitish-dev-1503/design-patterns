package com.design.patterns.behavioural.chainofresponsibility.handlers;

import com.design.patterns.behavioural.chainofresponsibility.CycleRequest;

import java.math.BigDecimal;

import static java.util.Objects.nonNull;

public class LateFeeHandler implements EndOfCycleHandler {
    private EndOfCycleHandler nextHandler;

    public void setNextHandler(EndOfCycleHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public CycleRequest process(CycleRequest cycleRequest) {
        // calculate late fee
        var calculatedLateFee = BigDecimal.TEN;
        cycleRequest.setLateFee(calculatedLateFee);

        if (nonNull(nextHandler)) {
            return nextHandler.process(cycleRequest);
        }
        return cycleRequest;
    }
}
