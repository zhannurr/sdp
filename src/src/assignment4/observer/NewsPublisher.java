package assignment4.observer;

// Интерфейс NewsPublisher
public interface NewsPublisher {
    // Добавление подписчика
    void addSubscriber(Observer observer);

    // Удаление подписчика
    void removeSubscriber(Observer observer);

    // Уведомление всех подписчиков
    void notifySubscribers(String newsCategory, String news);
}
