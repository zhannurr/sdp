package assignment4.strategy;

public interface PaymentStrategy {
    // Метод для расчёта финальной стоимости заказа
    double calculateFinalPrice(double orderPrice);
}
