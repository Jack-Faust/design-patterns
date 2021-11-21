package state;

/**
 * Interface for State to allow methods to be implemented based on the present state
 * @author Ronald Faust
 */
public interface State {

    /**
     * Gets a random number based on the state
     * @return random int
     */
    public int getNum();

    /**
     * Gets a random operation based on the state
     * @return random operation
     */
    public String getOperation();

    /**
     * Moves the user to the next level
     */
    public void levelUp();

    /** 
     * Moves the user to the previous level
    */
    public void levelDown();
    
}