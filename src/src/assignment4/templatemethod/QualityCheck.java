package assignment4.templatemethod;

public abstract class QualityCheck {

    // Шаблонный метод, который определяет общий процесс проверки качества
    public final void checkProduct() {
        checkAppearance();        // Шаг 1: Проверка внешнего вида
        checkSpecificCharacteristics(); // Шаг 2: Проверка специфических характеристик (для каждого продукта)
        generateFinalReport();    // Шаг 3: Заключительный отчёт
    }

    // Реализация проверки внешнего вида (одинаково для всех продуктов)
    private void checkAppearance() {
        System.out.println("Проверка внешнего вида продукта...");
    }

    // Абстрактный метод для проверки специфических характеристик
    protected abstract void checkSpecificCharacteristics();

    // Реализация заключительного отчёта (одинаково для всех продуктов)
    private void generateFinalReport() {
        System.out.println("Финальный отчёт: проверка завершена.");
    }
}

