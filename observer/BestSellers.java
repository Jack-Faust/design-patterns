package observer;
import java.util.ArrayList;

/**
 * Class best Sellers keeps track of observers and Books in best sellers arraylist
 * @author Ronald Faust
 */
public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;
    /**
     * BestSeller constructor
     */
    public BestSellers() {
        this.observers = new ArrayList<Observer>();
        this.bestSellers = new ArrayList<Book>();
    }
    /**
     * resgisters observer
     * @param observer to be added
     */
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }
    /**
     * removes observer
     * @param observer to be removed
     */
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
     /**
     *  notifies the observers that a new book has been added
     * @param book that was added
     */
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }
     /**
     * adds book 
     * @param book that was added
     */
    public void addBook(Book book) {
        this.bestSellers.add(book);
        notifyObservers(book);
    }
}
