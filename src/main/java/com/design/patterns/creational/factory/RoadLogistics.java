package com.design.patterns.creational.factory;

import com.design.patterns.creational.factory.transport.Transport;
import com.design.patterns.creational.factory.transport.Truck;

public class RoadLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
