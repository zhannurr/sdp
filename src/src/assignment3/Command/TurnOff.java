package assignment3.Command;

// Команда выключения телевизора
public class TurnOff implements Command {
    private Television tv;

    public TurnOff(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
