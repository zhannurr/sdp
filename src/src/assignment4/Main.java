package assignment4;

import assignment4.observer.*;
import assignment4.state.*;
import assignment4.strategy.*;
import assignment4.templatemethod.*;
import assignment4.visitor.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Выберите паттерн для тестирования ===");
            System.out.println("1. Стратегия");
            System.out.println("2. Наблюдатель");
            System.out.println("3. Состояние");
            System.out.println("4. Шаблонный метод");
            System.out.println("5. Посетитель");
            System.out.println("6. Выход");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    testStrategyPattern(scanner);
                    break;
                case 2:
                    testObserverPattern(scanner);
                    break;
                case 3:
                    testStatePattern(scanner);
                    break;
                case 4:
                    testTemplateMethodPattern(scanner);
                    break;
                case 5:
                    testVisitorPattern();
                    break;
                case 6:
                    running = false;
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }

        scanner.close();
    }

    private static void testStrategyPattern(Scanner scanner) {
        System.out.print("Введите цену заказа: ");
        double orderPrice = scanner.nextDouble();

        // Стратегия оплаты картой
        PaymentStrategy cardPayment = new CardPaymentStrategy();
        Order order = new Order(orderPrice, cardPayment);
        System.out.println("Цена при оплате картой: " + order.calculateFinalPrice());

        // Стратегия оплаты электронным кошельком
        PaymentStrategy walletPayment = new WalletPaymentStrategy();
        order.setPaymentStrategy(walletPayment);
        System.out.println("Цена при оплате электронным кошельком: " + order.calculateFinalPrice());

        // Стратегия оплаты наложенным платежом
        PaymentStrategy cashOnDeliveryPayment = new CashOnDeliveryStrategy();
        order.setPaymentStrategy(cashOnDeliveryPayment);
        System.out.println("Цена при наложенном платеже: " + order.calculateFinalPrice());
    }

    private static void testObserverPattern(Scanner scanner) {
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        // Создание подписчиков
        Observer smartphoneSubscriber = new NewsSubscriberSmartphone("Подписчик на смартфоне");
        Observer laptopSubscriber = new NewsSubscriberLaptop("Подписчик на ноутбуке");
        Observer tabletSubscriber = new NewsSubscriberTablet("Подписчик на планшете");

        // Добавление подписчиков к издателю
        newsPublisher.addSubscriber(smartphoneSubscriber);
        newsPublisher.addSubscriber(laptopSubscriber);
        newsPublisher.addSubscriber(tabletSubscriber);

        // Публикация новостей
        System.out.println("=== Публикация новостей ===");
        System.out.print("Введите категорию новости: ");
        String category = scanner.next();
        System.out.print("Введите текст новости: ");
        String news = scanner.next();

        newsPublisher.notifySubscribers(category, news);
    }

    private static void testStatePattern(Scanner scanner) {
        Player player = new Player();
        boolean playing = true;

        while (playing) {
            System.out.println("\n=== Управление плеером ===");
            System.out.println("1. Воспроизвести");
            System.out.println("2. Пауза");
            System.out.println("3. Остановить");
            System.out.println("4. Вернуться в меню");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.play(); // Воспроизведение
                    break;
                case 2:
                    player.pause(); // Пауза
                    break;
                case 3:
                    player.stop(); // Остановлено
                    break;
                case 4:
                    playing = false; // Вернуться в меню
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }

    private static void testTemplateMethodPattern(Scanner scanner) {
        System.out.println("=== Выбор типа проверки качества ===");
        System.out.println("1. Проверка продукта питания");
        System.out.println("2. Проверка электроники");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            // Проверка качества продукта питания
            QualityCheck foodCheck = new FoodQualityCheck();
            System.out.println("Процесс проверки продукта питания:");
            foodCheck.checkProduct();
        } else if (choice == 2) {
            // Проверка качества электроники
            QualityCheck electronicsCheck = new ElectronicsQualityCheck();
            System.out.println("Процесс проверки электроники:");
            electronicsCheck.checkProduct();
        } else {
            System.out.println("Неверный выбор.");
        }
    }

    private static void testVisitorPattern() {
        File textFile = new TextFile("document.txt");
        File executableFile = new ExecutableFile("program.exe");

        AntivirusVisitor antivirusVisitor = new AntivirusVisitor();
        ReportVisitor reportVisitor = new ReportVisitor();

        System.out.println("=== Антивирусная проверка ===");
        textFile.accept(antivirusVisitor);
        executableFile.accept(antivirusVisitor);

        System.out.println("\n=== Генерация отчета ===");
        textFile.accept(reportVisitor);
        executableFile.accept(reportVisitor);
    }
}
