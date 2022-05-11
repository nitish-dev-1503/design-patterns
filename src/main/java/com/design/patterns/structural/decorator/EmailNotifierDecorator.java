package com.design.patterns.structural.decorator;

public class EmailNotifierDecorator extends TransactionNotifierDecorator {
    public EmailNotifierDecorator(TransactionNotifier notifier) {
        super(notifier);
    }

    @Override
    public void notifyTransaction() {
        super.notifyTransaction();
        System.out.println("This is Email Notifier. Transaction Notification sent on email");
    }
}
