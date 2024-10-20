package assignment4.visitor;

// Класс для исполняемого файла
public class ExecutableFile implements File {
    private String name;

    public ExecutableFile(String name) {
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
