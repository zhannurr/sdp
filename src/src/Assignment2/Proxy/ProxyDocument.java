package Assignment2.Proxy;

import Assignment2.Document;
import Assignment2.RealDocument;

// Прокси-класс для ленивой загрузки документов
public class ProxyDocument implements Document {
    private String title; // Заголовок документа
    private RealDocument realDocument; // Ссылка на реальный документ

    public ProxyDocument(String title) {
        this.title = title; // Инициализируем заголовок
    }

    @Override
    public void display() {
        // Ленивая загрузка: загружаем реальный документ только при первом обращении
        if (realDocument == null) {
            realDocument = new RealDocument(title); // Создаем реальный документ
        }
        realDocument.display(); // Отображаем реальный документ
    }
}
