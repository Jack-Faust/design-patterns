package iterator;

/**
 * class Flights to be able to create flights
 * @author Ronald Faust
 */
public class Flight {
    
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    /**
     * Constructor for Flights
     * @param flightNum the flight number
     * @param from where the flight is from
     * @param to where the flight is going
     * @param duration length of the flight
     * @param transfers number of transfers 
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }
    /**
     * Accessor for from variable
     * @return from variable
     */
    public String getFrom() {
        return this.from;
    }
    /**
     * Accessor for To variable
     * @return  to variable 
     */
    public String getTo() {
        return this.to;
    }
    /**
     * Accessor for duration variable
     * @return duration variable 
     */
    public int getDuration() {
        return this.duration;
    }
    /**
     * Accessor for  transfers variable
     * @return transfers variable 
     */
    public int getNumTransfers() {
        return this.transfers;
    }
    /**
     * ToString method to return flight information in string form
     * @return String of flight info
     */
    public String toString() {
        String ret;
        ret = "Flight Number: " + this.flightNum;
        ret += "\nFrom: " + this.from;
        ret += "\nTo: " + this.to;
        int hours = this.duration / 60;
        int minutes = this.duration % 60;
        ret += "\nDuration: " + hours + " hours " + minutes + " minutes\n";
        if (this.transfers == 1) {
            ret += this.transfers + " Transfer";
        }
        else {
            ret += this.transfers + " Transfers";
        }
        return ret;
    }
}
