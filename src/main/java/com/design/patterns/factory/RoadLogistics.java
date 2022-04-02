package com.design.patterns.factory;

import com.design.patterns.factory.transport.Transport;
import com.design.patterns.factory.transport.Truck;

public class RoadLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
