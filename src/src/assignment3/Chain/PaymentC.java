package assignment3.Chain;

// Обработчик платежей C с балансом $1000
public class PaymentC extends PaymentHandler {
    private int balance = 1000;

    @Override
    public void handle(int amount) {
        if (balance >= amount) {
            System.out.println("Оплачено с помощью PaymentC");
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
