package task1;

public class XmlFormatter implements Formatter {
    @Override
    public String format(Book book) {
        return "book\n" +
                "  <title>" + book.getTitle() + "</title>\n" +
                "  <author>" + book.getAuthor() + "</author>\n" +
                "  <isbn>" + book.getIsbn() + "</isbn>\n" +
                "</book>";
    }
}
