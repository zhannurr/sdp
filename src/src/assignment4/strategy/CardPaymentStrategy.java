package assignment4.strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    private static final double COMMISSION_RATE = 0.02;

    @Override
    public double calculateFinalPrice(double orderPrice) {
        return orderPrice + (orderPrice * COMMISSION_RATE);
    }
}


