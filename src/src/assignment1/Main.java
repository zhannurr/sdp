package assignment1;

import assignment1.Singleton.Cafe;
import assignment1.FactoryMethod.CoffeeFactory;
import assignment1.Prototype.CoffeePrototype;
import assignment1.Prototype.CoffeeOrder;
import assignment1.Builder.*;
import assignment1.AbstractFactory.*;

import java.util.Scanner;

import static assignment1.FactoryMethod.Main.addCoffeeByName;

public class Main {
    public static void main(String[] args) {
        // Singleton создается один раз, и он доступен в любом месте
        Cafe cafe = Cafe.getInstance();

        Scanner scan = new Scanner(System.in);

        System.out.println("Menu:" + "\n" +
                "   espresso" + "\n" +
                "   cappuccino" + "\n" +
                "   latte" + "\n" +
                "   macchiato" + "\n" +
                "   americano" + "\n");

        // Спрашиваем, хочет ли пользователь дефолтный или кастомный кофе
        System.out.print("Do you want a default coffee or a custom one? (default/custom): ");
        String coffeeTypeChoice = scan.next().toLowerCase();

        String coffeeName = "";
        String milkChoice = "";
        String syrupChoice = "";

        if (coffeeTypeChoice.equals("default")) {
            System.out.print("Enter the name of coffee you want to order: ");
            coffeeName = scan.next().toLowerCase();

            // Используем Singleton
            cafe.orderCoffee(coffeeName);

            // Factory Method
            CoffeeFactory coffeeFactory = addCoffeeByName(coffeeName);
            assignment1.FactoryMethod.Coffee coffee = coffeeFactory.addCoffee();
            coffee.makeCoffee();

            // Используем абстрактную фабрику для создания ингредиентов
            IngredientFactory ingredientFactory = new CoffeeIngredientFactory();
            Ingredient milk = ingredientFactory.createMilk();
            Ingredient syrup = ingredientFactory.createSyrup();

            // Пример добавления ингредиентов
            milk.addIngredient(); // Добавим молоко
            syrup.addIngredient(); // Добавим сироп

            // Сохраняем выбор ингредиентов
            milkChoice = "default"; // Поскольку мы используем дефолтное молоко
            syrupChoice = "default"; // Поскольку мы используем дефолтный сироп

        } else if (coffeeTypeChoice.equals("custom")) {
            System.out.print("Enter the name of coffee you want to customize: ");
            coffeeName = scan.next().toLowerCase();

            // Настройка ингредиентов в зависимости от типа кофе
            System.out.print("Do you want to add milk? (yes/no): ");
            String addMilk = scan.next().toLowerCase();
            if (addMilk.equals("yes")) {
                System.out.println("What kind of milk do you want to add?");
                milkChoice = scan.next();
            }

            System.out.print("Do you want to add syrup? (yes/no): ");
            String addSyrup = scan.next().toLowerCase();
            if (addSyrup.equals("yes")) {
                System.out.println("What kind of syrup do you want to add?");
                syrupChoice = scan.next();
            }

            // Используем Builder для создания кастомного кофе на основе выбора пользователя
            CustomCoffee.Builder coffeeBuilder = new CustomCoffee.Builder(coffeeName);

            if (!milkChoice.isEmpty()) {
                coffeeBuilder.addMilk(milkChoice);
            }
            if (!syrupChoice.isEmpty()) {
                coffeeBuilder.addSyrup(syrupChoice);
            }

            CustomCoffee customCoffee = coffeeBuilder.build();
            System.out.println("Your custom coffee: " + customCoffee);
        } else {
            System.out.println("Invalid choice. Please select 'default' or 'custom'.");
            return;
        }

        // Prototype: Клонируем заказ, если пользователь хочет повторить тот же заказ
        System.out.println("Do you want to order the same? (yes/no)");
        String answer = scan.next().toLowerCase();

        if (answer.equals("yes")) {
            CoffeePrototype originalOrder = new CoffeePrototype(coffeeName + " with " + milkChoice + " milk and " + syrupChoice + " syrup");
            CoffeeOrder clonedOrder = originalOrder.cloneOrder();
            System.out.println("Cloned order: " + ((CoffeePrototype) clonedOrder).getType());
        }
    }
}
