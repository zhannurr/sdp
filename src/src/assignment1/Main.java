package assignment1;
import assignment1.Singleton.Cafe;
import assignment1.FactoryMethod.CoffeeFactory;
import assignment1.Prototype.CoffeePrototype;
import assignment1.Prototype.CoffeeOrder;
import assignment1.Builder.*;
import java.util.Scanner;
import static assignment1.FactoryMethod.Main.addCoffeeByName;
public class Main {
    public static void main(String[] args) {
        System.out.println("Menu:" + "\n" +
                "   espresso" + "\n" +
                "   cappuccino" + "\n" +
                "   latte" + "\n" +
                "   macchiato" + "\n" +
                "   americano" + "\n");
        System.out.print("Enter the name of coffee you want to order: ");
        Scanner scan = new Scanner(System.in);
        String coffeeName = scan.next().toLowerCase();
        // Singleton
        Cafe cafe = Cafe.getInstance();
        cafe.orderCoffee(coffeeName);
        // Factory Method
        CoffeeFactory coffeeFactory = addCoffeeByName(coffeeName);
        assignment1.FactoryMethod.Coffee coffee = coffeeFactory.addCoffee();
        coffee.makeCoffee();
        // Настройка ингредиентов в зависимости от типа кофе
        String milkChoice = "";
        String syrupChoice = "";
        switch (coffeeName) {
            case "latte":
            case "cappuccino":
            case "macchiato":
                // Эти типы кофе предполагают наличие молока по умолчанию
                milkChoice = "regular";
                System.out.print("Do you want to change the type of milk? (yes/no): ");
                String changeMilk = scan.next().toLowerCase();
                if (changeMilk.equals("yes")) {
                    System.out.println("What kind of milk do you want to add?");
                    milkChoice = scan.next();
                }
                break;
            case "espresso":
            case "americano":
                // Эти типы кофе обычно не включают молоко, но можно предложить добавить его
                System.out.print("Do you want to add milk? (yes/no): ");
                String addMilk = scan.next().toLowerCase();
                if (addMilk.equals("yes")) {
                    System.out.println("What kind of milk do you want to add?");
                    milkChoice = scan.next();
                }
                break;
            default:
                break;
        }
        // Вопрос про сироп для любого типа кофе
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
        // Prototype: Клонируем заказ, если пользователь хочет повторить тот же заказ
        System.out.println("Do you want to order the same? (yes/no)");
        String answer = scan.next().toLowerCase();
        if (answer.equals("yes")) {
            CoffeePrototype originalOrder = new CoffeePrototype(coffeeName);
            CoffeeOrder clonedOrder = originalOrder.cloneOrder();
            System.out.println("Cloned order: " + ((CoffeePrototype) clonedOrder).getType());
        }
    }
}