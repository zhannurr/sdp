package Assignment2;

import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleRenderEngine;
import Assignment2.Bridge.HighlightRenderEngine;
import Assignment2.Composite.DocumentGroup;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Flyweight.DocumentFactory;
import Assignment2.Adapter.PDFDocumentAdapter;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory(); // Создаем фабрику документов

        // 1. Использование Proxy для ленивой загрузки
        System.out.println("1. Ленивая загрузка документов:");
        Document report = factory.getDocument("Report");
        report.display(); // Отображаем документ

        // 2. Использование декоратора для добавления водяного знака
        System.out.println("\n2. Добавление водяного знака:");
        Document watermarkedReport = new WatermarkDecorator(report);
        watermarkedReport.display(); // Отображаем документ с водяным знаком

        // 3. Использование Flyweight для повторного использования документа
        System.out.println("\n3. Повторное использование документа:");
        Document anotherReport = factory.getDocument("Report"); // Получаем тот же документ
        anotherReport.display(); // Отображаем повторно загруженный документ

        // 4. Использование Composite для работы с группой документов
        System.out.println("\n4. Работа с группами документов:");
        DocumentGroup group = new DocumentGroup(); // Создаем группу документов
        group.addDocument(factory.getDocument("Report")); // Добавляем документы в группу
        group.addDocument(factory.getDocument("Presentation"));
        group.display(); // Отображаем группу документов

        // 5. Использование Adapter для работы с PDF
        System.out.println("\n5. Работа с PDF документами через Adapter:");
        Document pdfDocument = new PDFDocumentAdapter("document.pdf"); // Создаем адаптер для PDF
        pdfDocument.display(); // Отображаем PDF документ

        // 6. Использование Bridge для рендеринга
        System.out.println("\n6. Рендеринг документа через движок:");
        RenderEngine simpleEngine = new SimpleRenderEngine(); // Создаем простой движок рендеринга
        simpleEngine.render("Report"); // Рендерим документ

        RenderEngine highlightEngine = new HighlightRenderEngine(); // Создаем движок с выделением
        highlightEngine.render("Report"); // Рендерим документ с выделением
    }
}
