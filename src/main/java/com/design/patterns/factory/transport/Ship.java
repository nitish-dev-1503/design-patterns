package com.design.patterns.factory.transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        // Deliver Products
        System.out.println("Ship Delivery: SUCCESSFUL");
    }
}
