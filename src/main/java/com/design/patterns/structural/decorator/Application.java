package com.design.patterns.structural.decorator;

public class Application {
    public static void main(String[] args) {
        var appNotifier = new AppNotifier();    // default notifier
        var notifier = new TransactionNotifierDecorator(appNotifier);

        boolean isSMSNotificationEnabled = true;
        if (isSMSNotificationEnabled) {
            notifier = new SMSNotifierDecorator(notifier);
        }

        boolean isEmailNotificationEnabled = true;
        if (isEmailNotificationEnabled) {
            notifier = new EmailNotifierDecorator(notifier);
        }

        notifier.notifyTransaction();

    }
}
