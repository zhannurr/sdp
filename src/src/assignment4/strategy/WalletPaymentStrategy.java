package assignment4.strategy;

public class WalletPaymentStrategy implements PaymentStrategy {

    @Override
    public double calculateFinalPrice(double orderPrice) {
        return orderPrice;  // Нет комиссии
    }
}


