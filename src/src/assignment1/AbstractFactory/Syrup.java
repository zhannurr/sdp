package assignment1.AbstractFactory;

public class Syrup implements Ingredient {
    @Override
    public void addIngredient() {
        System.out.println("Добавлен сироп");
    }
}
