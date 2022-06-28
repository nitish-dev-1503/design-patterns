package com.design.patterns.behavioural.chainofresponsibility.example2.handler;

import com.design.patterns.behavioural.chainofresponsibility.example2.SupportRequest;

public interface RequestHandler {

    void setNext(RequestHandler nextHandler);

    void handle(SupportRequest request);
}
