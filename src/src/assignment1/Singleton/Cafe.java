package assignment1.Singleton;

public class Cafe {
    private static Cafe instance; // Переменная для хранения единственного экземпляра кафе

    private Cafe() {} // Приватный конструктор

    public static Cafe getInstance() {
        if (instance == null) { // Проверяем, создан ли экземпляр
            instance = new Cafe(); // Создаем новый экземпляр
        }
        return instance; // Возвращаем экземпляр
    }

    public void orderCoffee(String coffeeType) {
        System.out.println("Заказ: " + coffeeType); // Печатаем тип заказа
    }
}
