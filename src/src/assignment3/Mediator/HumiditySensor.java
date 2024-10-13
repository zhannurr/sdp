package assignment3.Mediator;

// Сенсор влажности
public class HumiditySensor implements Sensor {
    private HomeMediator mediator;
    private String humidity;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
        mediator.receiveData("Влажность: " + humidity);
    }

    @Override
    public void sendData() {
        mediator.receiveData("Влажность: " + humidity);
    }
}
