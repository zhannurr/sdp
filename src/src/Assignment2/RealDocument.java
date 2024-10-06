package Assignment2;

// Реальная реализация документа
public class RealDocument implements Document {
    private String title; // Заголовок документа

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk(); // Загружаем документ с диска при создании
    }

    // Метод для симуляции загрузки документа с диска
    private void loadFromDisk() {
        System.out.println("Загрузка документа с диска: " + title);
    }

    @Override
    public void display() {
        System.out.println("Отображение документа: " + title); // Отображаем документ
    }
}
