package assignment3.Command;

// Команда переключения канала вперед
public class NextChannel implements Command {
    private Television tv;

    public NextChannel(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.nextChannel();
    }
}
