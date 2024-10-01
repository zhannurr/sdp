package assignment1.FactoryMethod;

public class Latte implements Coffee{
    @Override
    public void makeCoffee() {
        System.out.println("make latte"); // Метод для приготовления кофе
    }
}
