package com.design.patterns.behavioural.chainofresponsibility.example2.handler;

import com.design.patterns.behavioural.chainofresponsibility.example2.RequestType;
import com.design.patterns.behavioural.chainofresponsibility.example2.SupportRequest;

import static java.util.Objects.nonNull;

public class MinorRequestHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void setNext(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(SupportRequest request) {
        if (RequestType.MINOR.equals(request.getRequestType())) {
            System.out.println("Handling a MINOR request.");
        } else if (nonNull(nextHandler)) {
            nextHandler.handle(request);
        } else {
            System.out.println("Request cannot be handled.");
        }
    }
}
