package observer;

import java.util.LinkedList;
import java.util.Queue;

public class Store implements Observer{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    public Store(Subject subject) {
        this.subject = subject;
        this.bestSellers = new LinkedList<Book>();
    }

    public void update(Book book) {
        if (this.bestSellers.size() <= 5) {
            this.bestSellers.add(book);
            System.out.println("added");
        }
        else {
            this.bestSellers.remove();
            this.bestSellers.add(book);
            System.out.println("added");
        }
    }

    public void display() {
        System.out.println("Top 5 Best Sellers:");
        for (Book book : this.bestSellers) {
            System.out.println(book.toString());
        }
    }
}
