package com.design.patterns.behavioural.chainofresponsibility.handlers;

import com.design.patterns.behavioural.chainofresponsibility.CycleRequest;

import static java.util.Objects.nonNull;

public class BaseEOCHandler implements EndOfCycleHandler {
    private EndOfCycleHandler nextHandler;

    public void setNextHandler(EndOfCycleHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public CycleRequest process(CycleRequest cycleRequest) {
        // perform some common operations
        if (nonNull(nextHandler)) {
            return nextHandler.process(cycleRequest);
        }
        return cycleRequest;
    }
}
