package assignment1.FactoryMethod;

public class EspressoFactory implements CoffeeFactory {
    @Override
    public Coffee addCoffee() {
        return new Espresso(); // Создаем и возвращаем новый объект
    }
}