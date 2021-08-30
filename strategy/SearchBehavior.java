package strategy;
import java.util.ArrayList;
   /**
     * An interface to ensure a contains method is present for each SearchBehavior 
     * @author Jack Faust
     */
public interface SearchBehavior {
    /**
     * Abstract method to be overriden for a search
     * @param data is the list of names
     * @param item is the name being search for 
     * @return boolean that is true when the item is found and false otherwise
     */
    public boolean contains(ArrayList<String> data, String item);
}
