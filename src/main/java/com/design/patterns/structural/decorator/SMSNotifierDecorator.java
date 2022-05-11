package com.design.patterns.structural.decorator;

public class SMSNotifierDecorator extends TransactionNotifierDecorator {
    public SMSNotifierDecorator(TransactionNotifier notifier) {
        super(notifier);
    }

    @Override
    public void notifyTransaction() {
        super.notifyTransaction();
        System.out.println("This is SMS Notifier. Transaction Notification sent on SMS");
    }
}
