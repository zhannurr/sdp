package assignment3.Chain;

// Обработчик платежей A с балансом $100
public class PaymentA extends PaymentHandler {
    private int balance = 100;

    @Override
    public void handle(int amount) {
        if (balance >= amount) {
            System.out.println("Оплачено с помощью PaymentA");
        } else if (next != null) {
            next.handle(amount);  // Передача запроса следующему обработчику
        }
    }
}
