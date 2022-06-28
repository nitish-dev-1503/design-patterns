package com.design.patterns.behavioural.command.example2;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private final List<Command> orderHistory;

    public Broker() {
        this.orderHistory = new ArrayList<>();
    }

    public void placeOrder(Command command) {
        orderHistory.add(command);
        command.execute();
    }

    public List<Command> getOrderHistory() {
        return orderHistory;
    }
}
