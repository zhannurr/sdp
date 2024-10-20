package assignment4.observer;
import java.util.ArrayList;
import java.util.List;

// Класс, управляющий подписчиками и уведомляющий их
public class NewsPublisherImpl implements NewsPublisher {
    // Список всех подписчиков
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String newsCategory, String news) {
        // Уведомляем только тех подписчиков, которые интересуются этой категорией новостей
        for (Observer observer : subscribers) {
            if (observer.isInterestedIn(newsCategory)) {
                observer.update(newsCategory, news);
            }
        }
    }
}
