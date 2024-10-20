package assignment4.visitor;

// Интерфейс для файлов
public interface File {
    void accept(Visitor visitor);
}
