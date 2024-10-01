package assignment1.FactoryMethod;

// Класс для эспрессо
public class Espresso implements Coffee{

    @Override
    public void makeCoffee() {
        System.out.println("make espresso"); // Метод для приготовления кофе
    }
}
