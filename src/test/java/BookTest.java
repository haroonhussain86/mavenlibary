import company.company.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testTitleMethod() {
        // create variables used to define out book properties
        String bookTitle = "Top Gear";
        String bookCategory = "Sci-Fi";
        String bookAuthor = "Haroon Hussain";
        Integer bookSize = 250;
        // initialise test book variable as book class and create new book with defined properties
        Book testBook = new Book(bookTitle, bookCategory, bookAuthor, bookSize);
        assertEquals("The pen was not the same title", bookTitle, testBook.getTitle());
    }

    @Test
    public void testCategoryMethod() {
        // create variables used to define out book properties
        String bookTitle = "Top Gear";
        String bookCategory = "Sci-Fi";
        String bookAuthor = "Haroon Hussain";
        Integer bookSize = 250;
        // initialise test book variable as book class and create new book with defined properties
        Book testBook = new Book(bookTitle, bookCategory, bookAuthor, bookSize);
        assertEquals("The pen was not the same title", bookCategory, testBook.getCategory());
    }

    @Test
    public void testAuthorMethod() {
        // create variables used to define out book properties
        String bookTitle = "Top Gear";
        String bookCategory = "Sci-Fi";
        String bookAuthor = "Haroon Hussain";
        Integer bookSize = 250;
        // initialise test book variable as book class and create new book with defined properties
        Book testBook = new Book(bookTitle, bookCategory, bookAuthor, bookSize);
        assertEquals("The pen was not the same title", bookAuthor, testBook.getAuthor());
    }

    @Test
    public void testSizeMethod() {
        // create variables used to define out book properties
        String bookTitle = "Top Gear";
        String bookCategory = "Sci-Fi";
        String bookAuthor = "Haroon Hussain";
        Integer bookSize = 250;
        // initialise test book variable as book class and create new book with defined properties
        Book testBook = new Book(bookTitle, bookCategory, bookAuthor, bookSize);
        assertEquals("The pen was not the same title", bookSize, testBook.getSize());
    }
}
