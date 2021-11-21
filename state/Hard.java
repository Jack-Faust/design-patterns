package state;

import java.util.Random;

public class Hard implements State {
    
    private ArithemeticGame game;
    private Random r;

    public Hard(ArithemeticGame game) {
        this.game = game;
        r = new Random();
    }

    public int getNum() {
        return r.nextInt(100)+1;
    }

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

    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You are struggling, let's go to medium mode.");
    }

}
