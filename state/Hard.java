package state;

import java.util.Random;

/**
 * Implements State interface methods for the Hard state 
 * @author Ronald Faust
 */
public class Hard implements State {
    
    private ArithemeticGame game;
    private Random r;

    /**
     * Constructor for Hard State
     * @param game current game being played
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
        r = new Random();
    }

    /**
     * gets a random number between 1 and 100
     * @return random int in the above bounds
     */
    public int getNum() {
        return r.nextInt(100)+1;
    }

    /**
     * gets a random operator that is either +, -, *, or /
     * @return random operator from above choices
     */
    public String getOperation() {
        int op = r.nextInt(4);
        switch(op) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2: 
                return "*";
            case 3:
                return "/";
            default:
                return "+";
        }
    }

    /**
     * Displays encouraging message for performing well in the top level
     */
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    /**
     * Demotes the user to the Medium level
     */
    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You are struggling, let's go to medium mode.");
    }

}
