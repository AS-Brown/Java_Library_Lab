import java.util.ArrayList;

public class Library {
    private ArrayList<Books> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<Books>();
        this.capacity = capacity;
    }

    public int checkStock(){
        return stock.size();
    }

    public void addBook(Books book){
        if(stock.size() < capacity ){
        this.stock.add(book);}
    }

    public Books removeBook(){
        return this.stock.remove(0);
    }
}
