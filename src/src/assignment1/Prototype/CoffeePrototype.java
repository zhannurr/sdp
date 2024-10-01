package assignment1.Prototype;

public class CoffeePrototype implements CoffeeOrder {
    private String type; // Тип кофе

    public CoffeePrototype(String type) {
        this.type = type; // Инициализируем тип кофе
    }

    public String getType() {
        return type; // Возвращаем тип кофе
    }

    @Override
    public CoffeePrototype cloneOrder() {
        // Клонируем текущий объект CoffeePrototype
        return new CoffeePrototype(this.type); // Создаем новый объект с тем же типом кофе
    }
}
