package Assignment2.Adapter;

public class PDFDocument {
    private String fileName;

    public PDFDocument(String fileName) {
        this.fileName = fileName;
    }

    public void openPDF() {
        System.out.println("Открытие PDF документа: " + fileName);
    }

    public void showPDF() {
        System.out.println("Отображение содержимого PDF документа: " + fileName);
    }
}
