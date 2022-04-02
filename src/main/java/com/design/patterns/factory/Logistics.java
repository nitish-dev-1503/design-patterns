package com.design.patterns.factory;

import com.design.patterns.factory.transport.Transport;

public abstract class Logistics {

    abstract Transport createTransport();

    public void planDelivery() {

        // create transport
        var transport = createTransport();

        // deliver using transport
        transport.deliver();
    }
}
