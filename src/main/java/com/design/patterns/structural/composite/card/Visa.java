package com.design.patterns.structural.composite.card;

public class Visa implements Card {
    @Override
    public void showCardDetails() {
        System.out.println("This is a VISA CARD.");
    }
}
