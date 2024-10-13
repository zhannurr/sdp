package assignment3.Command;

public class PreviousChannel implements Command {
    private Television television;

    // Конструктор, который принимает объект Television
    public PreviousChannel(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.previousChannel();
    }
}
