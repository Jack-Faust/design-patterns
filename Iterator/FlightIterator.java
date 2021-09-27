package Iterator;

/**
 * class FlightIterator to be able to iterate over flights array
 * @author Ronald Faust
 */
public class FlightIterator implements Iterator{

    private Flight[] flights;
    private int position;

    /**
     * Constructor for flight iterator 
     * @param flights array to iterator over
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;
        for (int i=0; i < this.flights.length; ++i) {
            if (this.flights[i] == null) {
                this.position = i-1;
                break;
            }
        }
    }

    /**
     * Determines if theres is a next element in the array
     * @return boolean value that is true if there is a next item
     */
    public boolean hasNext() {
        if (this.position < (this.flights.length - 1) ) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * return the next value and increases the postion variable 
     * @return the next flight
     */
    public Flight next() {
        if (hasNext()) {
            ++this.position;
            return this.flights[this.position];
        }
        return null;
    }

}
