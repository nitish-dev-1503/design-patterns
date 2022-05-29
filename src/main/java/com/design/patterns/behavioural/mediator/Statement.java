package com.design.patterns.behavioural.mediator;

public class Statement {
    private AccountMediator accountMediator;

    public Statement() {
    }

    public void generate() {
        var totalTransactionAmount = accountMediator.getTotalTransactionAmount();
        var paymentDueDate = accountMediator.getPaymentDueDate();

        System.out.println("----- STATEMENT -----");
        System.out.println("Total Payment Due: " + totalTransactionAmount);
        System.out.println("Payment Due Date: " + paymentDueDate);
    }

    public void setAccountMediator(AccountMediator accountMediator) {
        this.accountMediator = accountMediator;
    }
}
