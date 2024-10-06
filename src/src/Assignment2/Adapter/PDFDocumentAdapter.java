package Assignment2.Adapter;

import Assignment2.Document;

// Адаптер для работы с PDF-документами
public class PDFDocumentAdapter implements Document {
    private String pdfFileName; // Имя PDF-файла

    public PDFDocumentAdapter(String pdfFileName) {
        this.pdfFileName = pdfFileName; // Инициализируем имя файла
    }

    @Override
    public void display() {
        openPDF(); // Открываем PDF
        System.out.println("Отображение содержимого PDF документа: " + pdfFileName); // Отображаем содержимое
    }

    // Метод для открытия PDF-документа
    private void openPDF() {
        System.out.println("Открытие PDF документа: " + pdfFileName); // Симуляция открытия PDF
    }
}
