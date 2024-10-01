package task1;

public class JsonFormatter implements Formatter {
    @Override
    public String format(Book book) {
        return "{\n" +
                "  \"title\": \"" + book.getTitle() + "\",\n" +
                "  \"author\": \"" + book.getAuthor() + "\",\n" +
                "  \"isbn\": \"" + book.getIsbn() + "\"\n" +
                "}";
    }
}
