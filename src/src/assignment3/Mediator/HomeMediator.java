package assignment3.Mediator;

// Интерфейс посредника
public interface HomeMediator {
    void registerSensor(Sensor sensor);
    void receiveData(String data);
    void printReport();
}
