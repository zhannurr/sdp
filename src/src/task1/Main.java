package task1;


public class Main {
    public static void main(String[] args) {
        // Create a new book
        Book book = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        // Check book availability
        BookAvailability availability = new BookAvailability(true);
        System.out.println("Is the book available? " + availability.isAvailable());

        // Format the book in string format
        Formatter stringFormatter = new StringFormatter();
        System.out.println(stringFormatter.format(book));


        // Format the book in JSON format
        Formatter jsonFormatter = new JsonFormatter();
        System.out.println(jsonFormatter.format(book));

        // Format the book in XML format
        Formatter xmlFormatter = new XmlFormatter();
        System.out.println(xmlFormatter.format(book));
    }
}
