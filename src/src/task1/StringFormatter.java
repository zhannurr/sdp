package task1;

public class StringFormatter implements Formatter {
    @Override
    public String format(Book book) {
        return "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn();
    }
}
