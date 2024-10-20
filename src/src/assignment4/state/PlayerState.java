package assignment4.state;
// Интерфейс для состояний плеера
public interface PlayerState {
    // Метод для команды "Воспроизвести"
    void play(Player player);

    // Метод для команды "Пауза"
    void pause(Player player);

    // Метод для команды "Стоп"
    void stop(Player player);
}



