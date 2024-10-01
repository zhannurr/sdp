package assignment1.FactoryMethod;

public class Americano implements Coffee{
    @Override
    public void makeCoffee() {
        System.out.println("make americano"); // Метод для приготовления кофе
    }
}
