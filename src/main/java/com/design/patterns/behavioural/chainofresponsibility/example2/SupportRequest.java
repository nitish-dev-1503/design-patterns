package com.design.patterns.behavioural.chainofresponsibility.example2;

public class SupportRequest {
    private final RequestType requestType;
    private final String message;
    private final String sender;

    public SupportRequest(RequestType requestType, String message, String sender) {
        this.requestType = requestType;
        this.message = message;
        this.sender = sender;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }
}
