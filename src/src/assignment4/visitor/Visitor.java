package assignment4.visitor;

// Интерфейс для посетителей
public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}
