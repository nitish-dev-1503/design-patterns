package com.design.patterns.factory.transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        // Deliver Products
        System.out.println("Truck Delivery: SUCCESSFUL");
    }
}
