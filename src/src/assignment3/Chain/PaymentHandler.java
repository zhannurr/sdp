package assignment3.Chain;

// Абстрактный класс обработчика платежей
public abstract class PaymentHandler {
    protected PaymentHandler next;  // Следующий обработчик в цепочке

    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    // Метод для обработки платежа
    public abstract void handle(int amount);
}
