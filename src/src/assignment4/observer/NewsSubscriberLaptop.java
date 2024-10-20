package assignment4.observer;
// Подписчик на ноутбуке, который интересуется только новостями науки
public class NewsSubscriberLaptop implements Observer {
    private String name;

    public NewsSubscriberLaptop(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsCategory, String news) {
        System.out.println(name + " получил новость в категории " + newsCategory + ": " + news);
    }

    @Override
    public boolean isInterestedIn(String newsCategory) {
        return newsCategory.equals("Наука");
    }
}
