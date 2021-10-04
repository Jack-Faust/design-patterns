package iterator;

/**
 * class Airline to be able to create airlines that have a title and collection of flights
 * @author Ronald Faust
 */
public class Airline {
    private String title;
    private Flight[] flights;
    private int size;

   /**
    * Constructor for Airline object
    * @param title takes in a title that is assigned to that airline
    */
    public Airline(String title) {
        this.title = title;
        this.size = 2;
        this.flights = new Flight[this.size];
    }
    /**
     * Adds a flight to airline
     * @param flightNum passes flight number to flight constructor
     * @param from passes from to flight constructor
     * @param to passes to to flight constructor
     * @param duration passes duration to flight constructor
     * @param transfers passes transfers to flight constructor
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        FlightIterator iter = new FlightIterator(this.flights);
        if (iter.hasNext()) {
            for (int i=0; i < this.flights.length; ++i) {
                if (flights[i] == null) {
                    flights[i] = new Flight(flightNum, from, to, duration, transfers);
                    return;
                }
            }
        }
        else {
            growArray(this.flights);
            for (int i=0; i < this.flights.length; ++i) {
                if (flights[i] == null) {
                    flights[i] = new Flight(flightNum, from, to, duration, transfers);
                    return;
                }
            }
        }
    }
    /**
     * accessor for title
     * @return title of airline
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * Grows the array by double if there is no space
     * @param flights array of flights to refill new array
     * @return the resized array
     */
    private Flight[] growArray(Flight[] flights) {
        this.flights = new Flight[this.size * 2];
        int index = 0;
        for ( Flight flight : flights) {
            this.flights[index] = flight; 
            ++index;
        }
        return this.flights;
    }

    public FlightIterator createIterator() {
        return new FlightIterator(this.flights);
    }
}
