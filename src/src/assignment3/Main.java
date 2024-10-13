package assignment3;

// Главный класс для запуска всех паттернов
import assignment3.Chain.*;
import assignment3.Command.*;
import assignment3.Iterator.*;
import assignment3.Iterator.Iterator;
import assignment3.Mediator.*;
import assignment3.Memento.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Выбор паттерна ===");
            System.out.println("1. Цепочка обязанностей");
            System.out.println("2. Команда");
            System.out.println("3. Итератор");
            System.out.println("4. Посредник");
            System.out.println("5. Снимок");
            System.out.println("0. Выход");
            System.out.print("Введите номер паттерна для запуска: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    runChainOfResponsibility(scanner);
                    break;
                case 2:
                    runCommandPattern(scanner);
                    break;
                case 3:
                    runIteratorPattern();
                    break;
                case 4:
                    runMediatorPattern(scanner);
                    break;
                case 5:
                    runMementoPattern(scanner);
                    break;
                case 0:
                    System.out.println("Завершение программы.");
                    return;
                default:
                    System.out.println("Неправильный ввод, попробуйте снова.");
            }
        }
    }

    // Цепочка обязанностей
    private static void runChainOfResponsibility(Scanner scanner) {
        System.out.println("\n=== Цепочка обязанностей ===");
        PaymentHandler handlerA = new PaymentA();
        PaymentHandler handlerB = new PaymentB();
        PaymentHandler handlerC = new PaymentC();
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);

        System.out.print("Введите сумму для обработки: ");
        int amount = scanner.nextInt();
        handlerA.handle(amount);
    }

    // Паттерн Команда
    private static void runCommandPattern(Scanner scanner) {
        System.out.println("\n=== Паттерн Команда ===");
        Television tv = new Television();
        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, new TurnOn(tv));
        remote.setCommand(1, new TurnOff(tv));
        remote.setCommand(2, new VolumeUp(tv));
        remote.setCommand(3, new VolumeDown(tv));
        remote.setCommand(4, new NextChannel(tv));
        remote.setCommand(5, new PreviousChannel(tv));

        while (true) {
            System.out.println("1. Включить ТВ");
            System.out.println("2. Выключить ТВ");
            System.out.println("3. Увеличить громкость");
            System.out.println("4. Уменьшить громкость");
            System.out.println("5. Следующий канал");
            System.out.println("6. Предыдущий канал");
            System.out.println("0. Назад");
            System.out.print("Введите номер действия: ");
            int commandChoice = scanner.nextInt();

            switch (commandChoice) {
                case 1:
                    remote.pressButton(0);
                    break;
                case 2:
                    remote.pressButton(1);
                    break;
                case 3:
                    remote.pressButton(2);
                    break;
                case 4:
                    remote.pressButton(3);
                    break;
                case 5:
                    remote.pressButton(4);
                    break;
                case 6:
                    remote.pressButton(5);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверная команда.");
            }
        }
    }

    // Паттерн Итератор
    private static void runIteratorPattern() {
        System.out.println("\n=== Паттерн Итератор ===");
        List<String> moviesList = Arrays.asList("Film A", "Film B", "Film C");
        ListMovieCollection listMovieCollection = new ListMovieCollection(moviesList);
        Iterator<String> listIterator = listMovieCollection.createIterator();

        System.out.println("Список фильмов:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

    // Паттерн Посредник
    private static void runMediatorPattern(Scanner scanner) {
        System.out.println("\n=== Паттерн Посредник ===");
        HomeMediator mediator = new HomeMediatorImpl();
        Sensor tempSensor = new TemperatureSensor(mediator);
        Sensor humiditySensor = new HumiditySensor(mediator);
        Sensor lightSensor = new LightSensor(mediator);

        System.out.print("Введите температуру: ");
        String temperature = scanner.next();
        ((TemperatureSensor) tempSensor).setTemperature(temperature);

        System.out.print("Введите влажность: ");
        String humidity = scanner.next();
        ((HumiditySensor) humiditySensor).setHumidity(humidity);

        System.out.print("Введите уровень освещенности: ");
        String lightLevel = scanner.next();
        ((LightSensor) lightSensor).setLightLevel(lightLevel);

        mediator.printReport();
    }

    // Паттерн Снимок
    private static void runMementoPattern(Scanner scanner) {
        System.out.println("\n=== Паттерн Снимок ===");
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        while (true) {
            System.out.println("1. Написать текст");
            System.out.println("2. Сохранить текст");
            System.out.println("3. Восстановить текст");
            System.out.println("0. Назад");
            System.out.print("Введите номер действия: ");
            int action = scanner.nextInt();
            scanner.nextLine(); // Очищаем строку

            switch (action) {
                case 1:
                    System.out.print("Введите текст: ");
                    String text = scanner.nextLine();
                    editor.write(text);
                    System.out.println("Текущий текст: " + editor.getText());
                    break;
                case 2:
                    caretaker.save(editor);
                    System.out.println("Текст сохранен.");
                    break;
                case 3:
                    caretaker.undo(editor);
                    System.out.println("Текущий текст после восстановления: " + editor.getText());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверная команда.");
            }
        }
    }
}
