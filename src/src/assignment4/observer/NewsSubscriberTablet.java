package assignment4.observer;
// Подписчик на планшете, который интересуется всеми новостями
public class NewsSubscriberTablet implements Observer {
    private String name;

    public NewsSubscriberTablet(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsCategory, String news) {
        System.out.println(name + " получил новость в категории " + newsCategory + ": " + news);
    }

    @Override
    public boolean isInterestedIn(String newsCategory) {
        return true; // Интересуется всеми новостями
    }
}
