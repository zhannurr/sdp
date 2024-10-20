package assignment4.state;

// Состояние воспроизведения
public class PlayingState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Плеер уже воспроизводит.");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Плеер ставится на паузу.");
        player.setState(new PausedState()); // Переход в состояние паузы
    }

    @Override
    public void stop(Player player) {
        System.out.println("Плеер останавливается.");
        player.setState(new StoppedState()); // Переход в состояние остановки
    }
}

