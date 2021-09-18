package factory;
import java.util.ArrayList;

/**
 * class HousePlan to be able to create house plans of variable types
 * @author Ronald Faust
 */
public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    /**
     * default constructor for houseplan
     * @param numRooms
     * @param numWindows
     * @param squareFeet
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        this.materials = new ArrayList<String>();
        this.features = new ArrayList<String>();
    }

    /**
     * abstract method to make children classes set their materials
     */
    protected abstract void setMaterials();
    /**
     * abstract method to make children classes set their features
     */
    protected abstract void setFeatures();

    /**
     * accessor for materials arrayList
     * @return arraylist of materials
     */
    public ArrayList<String> getMaterials() {
        return this.materials;
    }
    /**
     * accessor for features arrayList
     * @return arraylist of features
     */
    public ArrayList<String> getFeatures() {
        return this.features;
    }
    /**
     * accessor for Number of Rooms
     * @return int Number of Rooms
     */
    public int getNumRooms() {
        return this.numRooms;
    }
    /**
     * accessor for Number of Windows
     * @return int Number of Windows
     */
    public int getNumWindows() {
        return this.numWindows;
    }
    /**
     * accessor for square footage
     * @return int square feet
     */
    public int getSquareFeet() {
        return this.squareFeet;
    }
    /**
     * toString method to print out all information about a house
     * @return String of house information
     */
    public String toString() {
        return "Square Feet: "+this.squareFeet+"\nRoom: "+this.numRooms+"\nWindows: "+this.numWindows +"\n"+ matsAndFeatsString();
    }
    /**
     * helper method for to string
     * @return string of materials and featurs labeled appropriately
     */
    private String matsAndFeatsString() {
        String ret = "\nMaterials:\n";
        for (String material : this.getMaterials()) {
            ret += "  - "+material+"\n";
        }
        ret += "\nFeatures:\n";
        for (String feature : this.getFeatures()) {
            ret +=  "  - " + feature + "\n";
        }
        return ret;
    }

}
