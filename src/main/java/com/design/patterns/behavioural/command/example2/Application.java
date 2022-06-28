package com.design.patterns.behavioural.command.example2;

public class Application {
    public static void main(String[] args) {
        var broker = new Broker();

        var product = new Product("Laptop", "Macbook Pro 16 inch", 5);

        var buyProductCommand = new BuyProductCommand(product);
        broker.placeOrder(buyProductCommand);

        var sellProductCommand = new SellProductCommand(product);
        broker.placeOrder(sellProductCommand);
    }
}
