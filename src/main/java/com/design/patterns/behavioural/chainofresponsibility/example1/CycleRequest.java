package com.design.patterns.behavioural.chainofresponsibility.example1;

import java.math.BigDecimal;

public class CycleRequest {
    private BigDecimal financeCharge;
    private BigDecimal lateFee;
    private BigDecimal minimumPaymentDue;

    public BigDecimal getFinanceCharge() {
        return financeCharge;
    }

    public void setFinanceCharge(BigDecimal financeCharge) {
        this.financeCharge = financeCharge;
    }

    public BigDecimal getLateFee() {
        return lateFee;
    }

    public void setLateFee(BigDecimal lateFee) {
        this.lateFee = lateFee;
    }

    public BigDecimal getMinimumPaymentDue() {
        return minimumPaymentDue;
    }

    public void setMinimumPaymentDue(BigDecimal minimumPaymentDue) {
        this.minimumPaymentDue = minimumPaymentDue;
    }
}
