package com.design.patterns.structural.decorator;

public class AppNotifier implements TransactionNotifier {
    @Override
    public void notifyTransaction() {
        System.out.println("Notifying using App. A transaction has been made");
    }
}
