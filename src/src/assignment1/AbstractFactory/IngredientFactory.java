package assignment1.AbstractFactory;

// Интерфейс для создания ингредиентов
public interface IngredientFactory {
    Ingredient createMilk();
    Ingredient createSyrup();
}
