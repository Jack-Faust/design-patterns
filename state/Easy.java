package state;

import java.util.Random;

/**
 * Implements State interface methods for the easy state 
 * @author Ronald Faust
 */
public class Easy implements State{
    
    private ArithemeticGame game;
    private Random r;

    /**
     * Constructor for Easy State
     * @param game current game being played
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
        r = new Random();
    }

    /**
     * gets a random number between 1 and 10
     * @return random int in the above bounds
     */
    public int getNum() {
        return r.nextInt(10)+1;
    }

    /**
     * gets a random operator that is either + or -
     * @return random operator from above choices
     */
    public String getOperation() {
        int op = r.nextInt(2);
        switch(op) {
            case 0:
                return "+";
            case 1:
                return "-";
            default:
                return "+";
        }
    }
    /**
     * promotes the user to the Medium level
     */
    public void levelUp() {
        game.setState(game.getMediumState());
        System.out.println("You've been advanced to medium mode.");
    }

    /**
     * Encourages user to study for struggling in lowest level
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
