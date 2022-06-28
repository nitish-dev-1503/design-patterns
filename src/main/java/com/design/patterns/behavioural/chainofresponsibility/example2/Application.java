package com.design.patterns.behavioural.chainofresponsibility.example2;

import com.design.patterns.behavioural.chainofresponsibility.example2.handler.CriticalRequestHandler;
import com.design.patterns.behavioural.chainofresponsibility.example2.handler.MajorRequestHandler;
import com.design.patterns.behavioural.chainofresponsibility.example2.handler.MinorRequestHandler;

public class Application {

    public static void main(String[] args) {
        var criticalRequestHandler = new CriticalRequestHandler();
        var majorRequestHandler = new MajorRequestHandler();
        var minorRequestHandler = new MinorRequestHandler();

        criticalRequestHandler.setNext(majorRequestHandler);
        majorRequestHandler.setNext(minorRequestHandler);

        var request = new SupportRequest(RequestType.MINOR, "Unable to login to the system", "Ram");
        criticalRequestHandler.handle(request);
    }
}
