package assignment4.state;

// Состояние остановки
public class StoppedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Плеер запускает воспроизведение с начала.");
        player.setState(new PlayingState()); // Переход в состояние воспроизведения
    }

    @Override
    public void pause(Player player) {
        System.out.println("Плеер уже остановлен. Нельзя поставить на паузу.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Плеер уже остановлен.");
    }
}
