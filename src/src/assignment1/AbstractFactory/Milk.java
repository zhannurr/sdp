package assignment1.AbstractFactory;

public class Milk implements Ingredient {
    @Override
    public void addIngredient() {
        System.out.println("Добавлено молоко");
    }
}