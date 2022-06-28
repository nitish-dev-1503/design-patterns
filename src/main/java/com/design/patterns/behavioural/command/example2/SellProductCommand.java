package com.design.patterns.behavioural.command.example2;

public class SellProductCommand implements Command {
    private final Product product;

    public SellProductCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        product.sell();
    }
}
