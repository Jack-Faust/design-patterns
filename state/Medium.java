package state;

import java.util.Random;

public class Medium implements State{
    
    private ArithemeticGame game;
    private Random r;

    public Medium(ArithemeticGame game) {
        this.game = game;
        r = new Random();
    }

    public int getNum() {
        return r.nextInt(50)+1;
    }

    /**
     * 
     * @return returns a random operation
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

    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("You've been advanced to the hardest mode.");
    }

    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("You are struggling, let's go to easy mode.");
    }
}
