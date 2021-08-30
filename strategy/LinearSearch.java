package strategy;

import java.util.ArrayList;
   /**
     * A SearchBehavior of type Linear
     * @author Jack Faust
     */
public class LinearSearch implements SearchBehavior {

    /**
     * Conducts a linear search
     * @param data is the list of names
     * @param item is the name being search for 
     * @return boolean that is true when the item is found and false otherwise
     */
    public boolean contains(ArrayList<String> data, String item) {
        for (int i = 0; i < data.size(); ++i) {
            String name = data.get(i);
            if (name.equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }
}
