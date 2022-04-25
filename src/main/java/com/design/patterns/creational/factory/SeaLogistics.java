package com.design.patterns.creational.factory;

import com.design.patterns.creational.factory.transport.Ship;
import com.design.patterns.creational.factory.transport.Transport;

public class SeaLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
