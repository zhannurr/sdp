package assignment3.Memento;

// Класс редактора текста
public class TextEditor {
    private String text;

    public void write(String newText) {
        this.text = newText;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        this.text = memento.getState();
    }

    public String getText() {
        return text;
    }
}
