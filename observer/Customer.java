package observer;

import java.util.ArrayList;

/**
 * class customer to implement update and display
 * @author Ronald Faust
 */
public class Customer implements Observer{
    
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;
    /**
     * Constructor for Customer
     * @param subject name of subject, customer first and last name 
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wishList = new ArrayList<Book>();
    }
    /**
     * Update method to update wishlist
     * @param book name of book
     */
    public void update(Book book) {
        wishList.add(book);
    }
    /**
     * calls book to string method to display the wishlist  
     */
    public void display() {
        System.out.println("Wish List:");
        System.out.println(wishList.size());
        for (int i = 0; i < this.wishList.size(); ++i) {
            System.out.println(this.wishList.get(i).toString());
        }
    }
}
