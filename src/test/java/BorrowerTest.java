import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Books book;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(2);
        book = new Books("Author", "Title", "Genre") ;
        library.addBook((book));
        borrower = new Borrower();
    }

    @Test
    public void borrowerHasCollection(){
        assertEquals(0, borrower.hasCollection());
    }

    @Test
    public void canAddBook(){
        book = library.removeBook();
        borrower.addBook(book);
        assertEquals(1, borrower.hasCollection());
    }
}
