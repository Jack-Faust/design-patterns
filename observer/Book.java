package observer;

/**
 * Class book creates book objects
 * @author Ronald Faust
 */
public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;
    /**
     * book constructor
     * @param title title of book
     * @param authorFirstName author first name
     * @param authorLastName author last name
     */
    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    /**
     * getter for title
     * @return title of book
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * getter for author first name
     * @return first name 
     */
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    /**
     * getter for author last name
     * @return last name 
     */
    public String getAuthorLastName() {
        return this.authorLastName;
    }
    /**
     * method to convert all book information to string
     * @return string of book information 
     */
    public String toString() {
        return "- "+this.title+" by: "+this.authorFirstName+" "+this.authorLastName;
    }
}
