package assignment1.FactoryMethod;

public class Main {

    // Метод для получения фабрики по имени кофе
    public static CoffeeFactory addCoffeeByName(String coffeeName) {

        switch (coffeeName) {
            case "espresso":
                return new EspressoFactory(); // Возвращаем фабрику для эспрессо
            case "latte":
                return new LatteFactory(); // Возвращаем фабрику для латте
            case "cappuccino":
                return new CappuccinoFactory(); // Возвращаем фабрику для капучино
            case "americano":
                return new AmericanoFactory(); // Возвращаем фабрику для американо
            case "macchiato":
                return new MacchiatoFactory(); // Возвращаем фабрику для маккиато
            default:
                throw new RuntimeException("Unknown coffee name"); // Выбрасываем исключение для неизвестного имени кофе
        }
    }
}
