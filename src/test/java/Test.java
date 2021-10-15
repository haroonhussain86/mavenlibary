import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testTitleMethod() {
        Book testBook = new book("Top Gear");
        assertEquals("The pen was not the same title", "Top Gear", testTitle.getTitle());
    }
}
