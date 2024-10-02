package assignment1.AbstractFactory;

// Конкретная фабрика для создания ингредиентов для кофе
public class CoffeeIngredientFactory implements IngredientFactory {
    @Override
    public Ingredient createMilk() {
        return new Milk(); // Создаем молоко
    }

    @Override
    public Ingredient createSyrup() {
        return new Syrup(); // Создаем сироп
    }
}
