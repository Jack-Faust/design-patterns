package observer;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Class store keeps track of Books in best sellers queue
 * @author Ronald Faust
 */
public class Store implements Observer{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * Constructor for Store
     * @param subject name of the subject 
     */
    public Store(Subject subject) {
        this.subject = subject;
        bestSellers = new LinkedList<Book>();
    }

    /**
     * update method to add if less than 5 elements and remove then add if more than 5
     * @param book is book being added
     */
    public void update(Book book) {
        if (bestSellers.size() <= 5) {
            bestSellers.add(book);
        }
        else {
            bestSellers.remove();
            bestSellers.add(book);
        }
    }
    /**
     * calls book to string method to display the wishlist  
     */
    public void display() {
        System.out.println("Top 5 Best Sellers:");
        for (Book book : bestSellers) {
            System.out.println(book.toString());
        }
    }
}
