package assignment3.Chain;

// Обработчик платежей B с балансом $300
public class PaymentB extends PaymentHandler {
    private int balance = 300;

    @Override
    public void handle(int amount) {
        if (balance >= amount) {
            System.out.println("Оплачено с помощью PaymentB");
        } else if (next != null) {
            next.handle(amount);
        }
    }
}
