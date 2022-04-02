package com.design.patterns.factory;

import com.design.patterns.factory.transport.Ship;
import com.design.patterns.factory.transport.Transport;

public class SeaLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
