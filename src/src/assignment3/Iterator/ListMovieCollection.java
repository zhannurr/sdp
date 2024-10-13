package assignment3.Iterator;

// Коллекция фильмов на основе списка
import java.util.List;

public class ListMovieCollection {
    private List<String> movies;

    public ListMovieCollection(List<String> movies) {
        this.movies = movies;
    }

    public Iterator<String> createIterator() {
        return new ListMovieIterator(movies);
    }
}
