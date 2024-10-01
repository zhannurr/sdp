package assignment1.FactoryMethod;

public class MacchiatoFactory implements CoffeeFactory{
    @Override
    public Coffee addCoffee() {
        return new Macchiato(); // Создаем и возвращаем новый объект
    }
}
