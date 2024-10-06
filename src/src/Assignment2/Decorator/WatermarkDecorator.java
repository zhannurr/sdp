package Assignment2.Decorator;

import Assignment2.Document;

// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator implements Document {
    private Document document; // Ссылка на оригинальный документ

    public WatermarkDecorator(Document document) {
        this.document = document; // Инициализируем оригинальный документ
    }

    @Override
    public void display() {
        document.display(); // Отображаем оригинальный документ
        addWatermark(); // Добавляем водяной знак
    }

    // Метод для добавления водяного знака
    private void addWatermark() {
        System.out.println("Добавление водяного знака к документу."); // Симуляция добавления водяного знака
    }
}
