package Assignment2.Flyweight;

import Assignment2.Document;
import Assignment2.Proxy.ProxyDocument; // Импортируем ProxyDocument
import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и управления документами
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>(); // Хранение документов

    // Метод для получения документа по заголовку
    public static Document getDocument(String title) {
        Document document = documentMap.get(title); // Проверяем, есть ли документ в кэше
        if (document == null) {
            document = new ProxyDocument(title); // Используем Proxy для ленивой загрузки
            documentMap.put(title, document); // Кэшируем документ
        }
        return document; // Возвращаем документ
    }
}
