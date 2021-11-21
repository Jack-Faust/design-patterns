package state;

import java.util.Random;
public class Easy implements State{
    
    private ArithemeticGame game;
    private Random r;

    public Easy(ArithemeticGame game) {
        this.game = game;
        r = new Random();
    }

    public int getNum() {
        return r.nextInt(10)+1;
    }

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

    public void levelUp() {
        game.setState(game.getMediumState());
        System.out.println("You've been advanced to medium mode.");
    }

    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
