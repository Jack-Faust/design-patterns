package decorator;
import java.util.ArrayList;

/**
 * Abstract character class creates characters
 * @author Jack Faust
 */
public abstract class Character {
    protected ArrayList<String> sections;

    /**
     * Character constructor
     */
    public Character() {
        this.sections = new ArrayList<String>();
    }

    /**
     * Prints sections to draw them
     */
    public void draw() {
        for (String section : this.sections) {
            System.out.println(section);
        }
    }
}
