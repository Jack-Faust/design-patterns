package Iterator;

public class Flight {
    
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    public Flight(String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getNumTransfers() {
        return this.transfers;
    }

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
