import java.util.ArrayList;

public class Borrower {
    private ArrayList<Books> collection;

    public Borrower() {
        this.collection = new ArrayList<Books>();
    }

    public int hasCollection(){
        return collection.size();
    }

    public void addBook(Books book){
        collection.add(book);
    }


}
