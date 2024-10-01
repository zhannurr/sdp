package assignment1.Builder;

// Класс для создания кастомного кофе
public class CustomCoffee {
    private String type; // Тип кофе
    private String milk; // Вид молока
    private String syrup; // Вид сиропа

    // Конструктор, который принимает объект Builder
    private CustomCoffee(Builder builder) {
        this.type = builder.type;
        this.milk = builder.milk;
        this.syrup = builder.syrup;
    }

    // Вложенный класс Builder для построения CustomCoffee
    public static class Builder {
        private String type; // Тип кофе
        private String milk; // Вид молока
        private String syrup; // Вид сиропа

        // Конструктор Builder, который принимает тип кофе
        public Builder(String type) {
            this.type = type;
        }

        // Метод для добавления молока
        public Builder addMilk(String milk) {
            this.milk = milk;
            return this; // Возвращаем текущий объект для цепочки вызовов
        }

        // Метод для добавления сиропа
        public Builder addSyrup(String syrup) {
            this.syrup = syrup;
            return this; // Возвращаем текущий объект для цепочки вызовов
        }

        // Метод для создания объекта CustomCoffee
        public CustomCoffee build() {
            return new CustomCoffee(this); // Создаем новый объект CustomCoffee
        }
    }

    // Переопределение метода toString для удобного вывода информации о кофе
    @Override
    public String toString() {
        return ("Coffee " + type + " with " + milk + " milk, " + syrup + " syrup");
    }
}
