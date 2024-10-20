package assignment4.visitor;

// Класс для текстового файла
public class TextFile implements File {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
