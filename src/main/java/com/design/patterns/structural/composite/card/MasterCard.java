package com.design.patterns.structural.composite.card;

public class MasterCard implements Card {
    @Override
    public void showCardDetails() {
        System.out.println("This is a MASTERCARD.");
    }
}
