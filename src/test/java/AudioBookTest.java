import company.company.AudioBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AudioBookTest {

    @Test
    public void testTitleMethod() {
        // create variables used to define out audioBook properties
        String audioBookTitle = "Top Gear";
        String audioBookCategory = "Sci-Fi";
        String audioBookAuthor = "Haroon Hussain";
        Integer audioBookSize = 250;
        // initialise test audioBook variable as audioBook class and create new audioBook with defined properties
        AudioBook testBook = new AudioBook(audioBookTitle, audioBookCategory, audioBookAuthor, audioBookSize);
        assertEquals("The pen was not the same title", audioBookTitle, testBook.getTitle());
    }

    @Test
    public void testCategoryMethod() {
        // create variables used to define out audioBook properties
        String audioBookTitle = "Top Gear";
        String audioBookCategory = "Sci-Fi";
        String audioBookAuthor = "Haroon Hussain";
        Integer audioBookSize = 250;
        // initialise test audioBook variable as audioBook class and create new audioBook with defined properties
        AudioBook testBook = new AudioBook(audioBookTitle, audioBookCategory, audioBookAuthor, audioBookSize);
        assertEquals("The pen was not the same title", audioBookCategory, testBook.getCategory());
    }

    @Test
    public void testAuthorMethod() {
        // create variables used to define out audioBook properties
        String audioBookTitle = "Top Gear";
        String audioBookCategory = "Sci-Fi";
        String audioBookAuthor = "Haroon Hussain";
        Integer audioBookSize = 250;
        // initialise test audioBook variable as audioBook class and create new audioBook with defined properties
        AudioBook testBook = new AudioBook(audioBookTitle, audioBookCategory, audioBookAuthor, audioBookSize);
        assertEquals("The pen was not the same title", audioBookAuthor, testBook.getAuthor());
    }

    @Test
    public void testSizeMethod() {
        // create variables used to define out audioBook properties
        String audioBookTitle = "Top Gear";
        String audioBookCategory = "Sci-Fi";
        String audioBookAuthor = "Haroon Hussain";
        Integer audioBookSize = 250;
        // initialise test audioBook variable as audioBook class and create new audioBook with defined properties
        AudioBook testBook = new AudioBook(audioBookTitle, audioBookCategory, audioBookAuthor, audioBookSize);
        assertEquals("The pen was not the same title", audioBookSize, testBook.getSize());
    }
}
