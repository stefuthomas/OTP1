package Week4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public void removeBook(String book) {
        books.remove(book);
    }

    public List<String> getBooks() {
        return books;
    }
}