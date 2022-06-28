package com.design.patterns.behavioural.command.example2;

public class BuyProductCommand implements Command {
    private final Product product;

    public BuyProductCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        product.buy();
    }
}
