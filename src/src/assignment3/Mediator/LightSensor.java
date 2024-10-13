package assignment3.Mediator;
// Сенсор освещенности
public class LightSensor implements Sensor {
    private HomeMediator mediator;
    private String lightLevel;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void setLightLevel(String lightLevel) {
        this.lightLevel = lightLevel;
        mediator.receiveData("Уровень освещенности: " + lightLevel);
    }

    @Override
    public void sendData() {
        mediator.receiveData("Уровень освещенности: " + lightLevel);
    }
}
