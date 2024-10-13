package assignment3.Command;

// Пульт управления с кнопками
public class RemoteControl {
    private Command[] buttons = new Command[6];

    public void setCommand(int buttonNumber, Command command) {
        buttons[buttonNumber] = command;
    }

    public void pressButton(int buttonNumber) {
        if (buttons[buttonNumber] != null) {
            buttons[buttonNumber].execute();
        }
    }
}
