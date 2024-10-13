package assignment3.Mediator;

// Реализация посредника
import java.util.ArrayList;
import java.util.List;

public class HomeMediatorImpl implements HomeMediator {
    private List<String> data = new ArrayList<>();

    @Override
    public void registerSensor(Sensor sensor) {
        sensor.sendData();  // При регистрации сразу собираем данные
    }

    @Override
    public void receiveData(String data) {
        this.data.add(data);
    }

    @Override
    public void printReport() {
        System.out.println("Отчет по сенсорам:");
        for (String entry : data) {
            System.out.println(entry);
        }
    }
}
