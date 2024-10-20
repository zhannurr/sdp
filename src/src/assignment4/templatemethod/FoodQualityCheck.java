package assignment4.templatemethod;
public class FoodQualityCheck extends QualityCheck {

    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Проверка срока годности и состава продукта питания...");
    }
}
