package assignment4.state;

// Класс плеера, который управляет состояниями
public class Player {
    // Текущее состояние плеера
    private PlayerState currentState;

    public Player() {
        // Начальное состояние - остановка
        this.currentState = new StoppedState();
    }

    public void setState(PlayerState state) {
        this.currentState = state;
    }

    // Команда "Воспроизвести"
    public void play() {
        currentState.play(this);
    }

    // Команда "Пауза"
    public void pause() {
        currentState.pause(this);
    }

    // Команда "Стоп"
    public void stop() {
        currentState.stop(this);
    }
}
