package Iterator;

public class FlightIterator implements Iterator{

    private Flight[] flights;
    private int position;

    public FlightIterator(Flight[] flights) {
        this.flights = flights;
        for (int i=0; i < this.flights.length; ++i) {
            if (this.flights[i] == null) {
                this.position = i-1;
                break;
            }
        }
    }

    public boolean hasNext() {
        if (this.position < (this.flights.length - 1) ) {
            return true;
        }
        else {
            return false;
        }
    }

    public Flight next() {
        if (hasNext()) {
            ++this.position;
            return this.flights[this.position];
        }
        return null;
    }

}
