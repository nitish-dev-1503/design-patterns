package com.design.patterns.creational.factory;

import com.design.patterns.creational.factory.transport.Transport;

public abstract class Logistics {

    abstract Transport createTransport();

    public void planDelivery() {

        // create transport
        var transport = createTransport();

        // deliver using transport
        transport.deliver();
    }
}
