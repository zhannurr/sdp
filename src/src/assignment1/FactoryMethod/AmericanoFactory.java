package assignment1.FactoryMethod;

public class AmericanoFactory implements CoffeeFactory{
    @Override
    public Coffee addCoffee() {
        return new Americano(); // Создаем и возвращаем новый объект
    }
}
