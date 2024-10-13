package assignment3.Mediator;

// Сенсор температуры
public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;
    private String temperature;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        mediator.receiveData("Температура: " + temperature);
    }

    @Override
    public void sendData() {
        mediator.receiveData("Температура: " + temperature);
    }
}
