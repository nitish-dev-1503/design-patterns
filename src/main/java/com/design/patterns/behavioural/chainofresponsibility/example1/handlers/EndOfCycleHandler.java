package com.design.patterns.behavioural.chainofresponsibility.example1.handlers;

import com.design.patterns.behavioural.chainofresponsibility.example1.CycleRequest;

public interface EndOfCycleHandler {
    CycleRequest process(CycleRequest cycleRequest);
}
