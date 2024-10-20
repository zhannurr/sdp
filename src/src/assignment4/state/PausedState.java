package assignment4.state;

// Состояние паузы
public class PausedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Плеер возобновляет воспроизведение.");
        player.setState(new PlayingState()); // Переход в состояние воспроизведения
    }

    @Override
    public void pause(Player player) {
        System.out.println("Плеер уже на паузе.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Плеер останавливается.");
        player.setState(new StoppedState()); // Переход в состояние остановки
    }
}
