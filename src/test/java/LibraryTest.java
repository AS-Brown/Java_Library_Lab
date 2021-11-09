import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Books book;

    @Before
    public void before(){
        library = new Library(2);
        book = new Books("Author", "Title", "Genre") ;

    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.checkStock());
    }
    @Test
    public void libraryCanAddBook(){
        library.addBook(book);
        assertEquals(1,library.checkStock());
    }
    @Test
    public void libraryHasCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.checkStock());
    }

    @Test
    public void libraryCanRemove(){
        library.addBook(book);
        library.addBook(book);
        library.removeBook();
        assertEquals(1, library.checkStock());
    }
}
