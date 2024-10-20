package assignment4.observer;
// Подписчик на смартфоне, который интересуется только новостями спорта
public class NewsSubscriberSmartphone implements Observer {
    private String name;

    public NewsSubscriberSmartphone(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsCategory, String news) {
        System.out.println(name + " получил новость в категории " + newsCategory + ": " + news);
    }

    @Override
    public boolean isInterestedIn(String newsCategory) {
        return newsCategory.equals("Спорт");
    }
}
