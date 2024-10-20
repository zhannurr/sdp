package assignment4.visitor;

// Класс для генерации отчета
public class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Генерация отчета для текстового файла: " + textFile.getName());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Генерация отчета для исполняемого файла: " + executableFile.getName());
    }
}
