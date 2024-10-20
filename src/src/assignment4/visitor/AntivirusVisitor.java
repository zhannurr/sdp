package assignment4.visitor;

// Класс для антивирусной проверки
public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Проверка текстового файла: " + textFile.getName());
        // Логика проверки на запрещенные слова
        System.out.println("Проверка завершена.");
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Проверка исполняемого файла: " + executableFile.getName());
        // Логика проверки на наличие вредоносного кода
        System.out.println("Проверка завершена.");
    }
}
