package state;
import java.util.Scanner;

/**
 * Class to alter state of game and to generate questions
 * @author Ronald Faust
 */
public class ArithemeticGame {
    
    private Scanner key;
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    /**
     * Constructor for Arithmetic Game
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        this.state = easyState;
        this.score = 0;
        key = new Scanner(System.in);
    }

    /**
     * Method generates a question comprised of 2 random numbers and a random operation from the appropriate state
     */
    public void pressQuestionButton() {
        int firstNum = state.getNum();
        int secondNum = state.getNum();
        int answer;
        String operation = state.getOperation();
        switch (operation) {
            case "+":
                answer = firstNum + secondNum;
                break;
            case "-":
                answer = firstNum - secondNum;
                break;
            case "*":
                answer = firstNum * secondNum;
                break;
            case "/":
                answer = firstNum / secondNum;
                break;
            default:
                answer = 0;
                break;
        }
        System.out.println(firstNum + " "+operation+ " " + secondNum);
        int response = key.nextInt();
        key.nextLine();
        key.close();

        if (response == answer) {
            ++score;
            System.out.println("Correct");
            if (score >=3) {
                state.levelUp();
                score = 0;
            }
        }
        else {
            --score;
            System.out.println("Incorrect");
            if (score <=-3) {
                state.levelDown();
                score = 0;
            }
        }
    }

    /**
     * mutator for state variable
     * @param state state to change the state of the game to 
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Accessor for Easy state
     * @return Easy state
     */
    public State getEasyState() {
        return easyState;
    }
    /**
     * Accessor for Medium state
     * @return Medium state
     */
    public State getMediumState() {
        return mediumState;
    }
    /**
     * Accessor for Hard state
     * @return Hard state
     */
    public State getHardState() {
        return hardState;
    }
}
