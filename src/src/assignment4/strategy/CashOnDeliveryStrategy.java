package assignment4.strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    private static final double DELIVERY_FEE = 300;

    @Override
    public double calculateFinalPrice(double orderPrice) {
        return orderPrice + DELIVERY_FEE;
    }
}
