package state;
import java.util.Scanner;

public class ArithemeticGame {
    
    private Scanner key;
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        this.state = easyState;
        this.score = 0;
        key = new Scanner(System.in);
    }

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

    public void setState(State state) {
        this.state = state;
    }

    public State getEasyState() {
        return easyState;
    }

    public State getMediumState() {
        return mediumState;
    }

    public State getHardState() {
        return hardState;
    }
}
