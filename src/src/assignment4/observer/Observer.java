package assignment4.observer;

// Интерфейс Observer
public interface Observer {
    // Метод для получения уведомлений
    void update(String newsCategory, String news);

    // Метод для проверки интереса к категории новостей
    boolean isInterestedIn(String newsCategory);
}
