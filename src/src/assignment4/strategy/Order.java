package assignment4.strategy;

public class Order {
    private PaymentStrategy paymentStrategy;
    private double orderPrice;

    // Конструктор для инициализации заказа с ценой и стратегией
    public Order(double orderPrice, PaymentStrategy paymentStrategy) {
        this.orderPrice = orderPrice;
        this.paymentStrategy = paymentStrategy;
    }

    // Метод для установки стратегии оплаты
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Метод для расчёта финальной стоимости заказа
    public double calculateFinalPrice() {
        return paymentStrategy.calculateFinalPrice(orderPrice);
    }
}
