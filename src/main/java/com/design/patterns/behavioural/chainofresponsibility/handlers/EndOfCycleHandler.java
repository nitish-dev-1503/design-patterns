package com.design.patterns.behavioural.chainofresponsibility.handlers;

import com.design.patterns.behavioural.chainofresponsibility.CycleRequest;

public interface EndOfCycleHandler {
    CycleRequest process(CycleRequest cycleRequest);
}
