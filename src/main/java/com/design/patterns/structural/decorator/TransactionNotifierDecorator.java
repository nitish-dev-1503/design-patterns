package com.design.patterns.structural.decorator;

public class TransactionNotifierDecorator implements TransactionNotifier {

    private final TransactionNotifier notifier;

    public TransactionNotifierDecorator(TransactionNotifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notifyTransaction() {
        notifier.notifyTransaction();
    }
}
