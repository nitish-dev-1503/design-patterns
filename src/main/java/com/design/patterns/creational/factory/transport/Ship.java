package com.design.patterns.creational.factory.transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        // Deliver Products
        System.out.println("Ship Delivery: SUCCESSFUL");
    }
}
