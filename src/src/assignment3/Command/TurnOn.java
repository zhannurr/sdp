package assignment3.Command;

// Команда включения телевизора
public class TurnOn implements Command {
    private Television tv;

    public TurnOn(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}

