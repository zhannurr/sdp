package assignment3.Iterator;

// Итератор для списка фильмов
import java.util.List;

public class ListMovieIterator implements Iterator<String> {
    private List<String> movies;
    private int position = 0;

    public ListMovieIterator(List<String> movies) {
        this.movies = movies;
    }

    @Override
    public boolean hasNext() {
        return position < movies.size();
    }

    @Override
    public String next() {
        return movies.get(position++);
    }
}
