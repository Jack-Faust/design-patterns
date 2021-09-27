package Iterator;

public class Airline {
    private String title;
    private Flight[] flights;
    private int size;

    public Airline(String title) {
        this.title = title;
        this.size = 2;
        this.flights = new Flight[this.size];
    }
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
    public String getTitle() {
        return this.title;
    }
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
