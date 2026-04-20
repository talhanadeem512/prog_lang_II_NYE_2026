import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}

public class Task3 {
    public static Book findBookByTitle(List<Book> library, String title) {
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();
        library.add(new Book("Clean Code", "Robert Martin"));
        library.add(new Book("The Pragmatic Programmer", "Andrew Hunt"));
        library.add(new Book("Effective Java", "Joshua Bloch"));

        Book result = findBookByTitle(library, "Effective Java");
        System.out.println(result != null ? result : "Not found");

        Book missing = findBookByTitle(library, "Unknown");
        System.out.println(missing != null ? missing : "Not found");
    }
}