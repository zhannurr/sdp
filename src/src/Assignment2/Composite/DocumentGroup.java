package Assignment2.Composite;

import Assignment2.Document;
import java.util.ArrayList;
import java.util.List;

// Класс для группы документов
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>(); // Список документов

    // Метод для добавления документа в группу
    public void addDocument(Document document) {
        documents.add(document); // Добавляем документ в список
    }

    @Override
    public void display() {
        for (Document document : documents) {
            document.display(); // Отображаем каждый документ в группе
        }
    }
}
