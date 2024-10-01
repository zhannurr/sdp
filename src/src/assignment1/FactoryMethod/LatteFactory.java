package assignment1.FactoryMethod;

public class LatteFactory implements CoffeeFactory{

    @Override
    public Coffee addCoffee() {
        return new Latte(); // Создаем и возвращаем новый объект
    }
}
