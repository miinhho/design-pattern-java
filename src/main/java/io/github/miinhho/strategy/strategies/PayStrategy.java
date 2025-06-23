package io.github.miinhho.strategy.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
