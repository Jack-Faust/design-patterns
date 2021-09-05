package strategy;

import java.util.ArrayList;
   /**
     * A SearchBehavior of type BinarySearch
     * @author Jack Faust
     */
public class BinarySearch implements SearchBehavior{
    /**
     * Conducts a binary search of data parameter searching for item parameter
     * @param data is the list of names
     * @param item is the name being search for 
     * @return boolean that is true when the item is found and false otherwise
     */
    public boolean contains(ArrayList<String> data, String item) {
    
        /*
        *binary search Algorithm found online
        *https://www.geeksforgeeks.org/java-program-to-perform-binary-search-on-arraylist/
        */
        int mid = 0;
        int left = 0;
        int right = data.size();

        while (left <= right) {
            mid = left + (right - left) / 2;
            if(mid >= data.size() || mid < 0){
                return false;
            }
            if(data.get(mid).equalsIgnoreCase(item)) {
                return true;
            }
            if(data.get(mid).length() < item.length()) {
               left = mid + 1; 
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}
