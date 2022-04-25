package com.design.patterns.creational.factory.transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        // Deliver Products
        System.out.println("Truck Delivery: SUCCESSFUL");
    }
}
