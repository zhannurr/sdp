package assignment3.Command;

// Класс телевизора с основными действиями
public class Television {
    public void turnOn() {
        System.out.println("Телевизор включен");
    }

    public void turnOff() {
        System.out.println("Телевизор выключен");
    }

    public void volumeUp() {
        System.out.println("Громкость увеличена");
    }

    public void volumeDown() {
        System.out.println("Громкость уменьшена");
    }

    public void nextChannel() {
        System.out.println("Канал переключен вперед");
    }

    public void previousChannel() {
        System.out.println("Канал переключен назад");
    }
}
