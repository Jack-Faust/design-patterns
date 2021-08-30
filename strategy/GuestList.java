package strategy;

import java.util.ArrayList;

/**
 * Class of Guestlist to be able to create and alter GuestList objects
 * @author Jack Faust
 */
public class GuestList {
    private String title;
    private ArrayList<String> people = new ArrayList<String>();
    private SearchBehavior searchBehavior;

    /**
     * Constructor for GuestList
     * @param title name of the guestlist 
     */
    public GuestList(String title) {
        this.title = title;
        this.searchBehavior = new LinearSearch();
    }
    /**
     * Adds a name to the GuestList
     * @param person name to add to the list
     * @return boolean that is false when the name is already on the list, true otherwise
     */
    public boolean add(String person) {
        boolean found = searchBehavior.contains(people, person);
        if (found == true) {
            return false;
        }
        else {
            people.add(person);
            return true;
        }
    }
    /**
     * Removes a name to the GuestList
     * @param person name to remove from the list
     * @return boolean that is true when the name is already on the list, false otherwise
     */
    public boolean remove(String person) {
        boolean found = searchBehavior.contains(people, person);
        if (found == true) { 
            people.remove(person);
        }
        return found;
    }
    /**
     * Accessor for title of list
     * @return String that is the list title
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * Mutator for SearchBehavior
     * @param searchBehavior new type of search to be conducted on the list  
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }
    /**
     * Accessor for arraylist of names
     * @return ArrayList of type String of the names
     */
    public ArrayList<String> getList() {
        return this.people;
    }

}
