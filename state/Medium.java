package state;

import java.util.Random;

/**
 * Implements State interface methods for the Medium state 
 * @author Ronald Faust
 */
public class Medium implements State{
    
    private ArithemeticGame game;
    private Random r;

    /**
     * Constructor for Medium State
     * @param game current game being played
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
        r = new Random();
    }

    /**
     * gets a random number between 1 and 50
     * @return random int in the above bounds
     */
    public int getNum() {
        return r.nextInt(50)+1;
    }

    /**
     * gets a random operator that is either +, -, or *
     * @return random operator from above choices
     */
    public String getOperation() {
        int op = r.nextInt(3);
        switch(op) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2: 
                return "*";
            default:
                return "+";
        }
    }

    /**
     * Promotes the user to the hard level
     */
    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("You've been advanced to the hardest mode.");
    }

    /**
     * Demotes the user to the easy level
     */
    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("You are struggling, let's go to easy mode.");
    }
}
