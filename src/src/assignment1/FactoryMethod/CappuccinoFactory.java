package assignment1.FactoryMethod;

public class CappuccinoFactory implements CoffeeFactory{

    @Override
    public Coffee addCoffee() {
        return new Cappuccino(); // Создаем и возвращаем новый объект
    }
}