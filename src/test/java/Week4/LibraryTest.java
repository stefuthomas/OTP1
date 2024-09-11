package Week4;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @org.junit.jupiter.api.Test
    public void testAddAndListBooks() {
        Library library = new Library();
        library.addBook("The Great Gatsby");
        List<String> books = library.getBooks();
        assertEquals(1, books.size(), "There should be 1 book in the library");
        assertEquals("The Great Gatsby", books.get(0), "The Great Gatsby");
    }

    @org.junit.jupiter.api.Test
    public void testRemoveBook() {
        Library library = new Library();
        library.addBook("1984");
        library.removeBook("1984");
        List<String> books = library.getBooks();
        assertEquals(0, books.size(), "There should be no books in the library");

    }

}