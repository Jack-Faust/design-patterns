package singleton;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * TriviaGame class that makes only one single instance of a trivia game
 * @author Jack Faust
 */
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    /**
     * Trivia game constructor 
     */
    private TriviaGame() {
        this.questions = DataLoader.getTriviaQuestions();
        this.rand = new Random();
        this.reader = new Scanner(System.in);
    }

    /**
     * get Instance ensures there is only one instance of the class and makes sure it isnt null
     * @return The one instance of Trivia game
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * Loops to allow the player to play multiple rounds
     */
    public void play() {
        boolean keepPlaying = true;
        while(keepPlaying) {
            playRound();
            System.out.println("(P)lay or (Q)uit:");
            String response = reader.nextLine();
            if (response.equalsIgnoreCase("q")) {
                System.out.println("You won " +score+ " games. Goodbye!!");
                keepPlaying = false;
            }
        }
    }

    /**
     * Plays one round of the game 
     * @return boolean that is true if the answer is correct
     */
    private boolean playRound() {
        int question = rand.nextInt(10);
        System.out.println(questions.get(question).toString());
        System.out.print("Enter Answer: ");
        int response = reader.nextInt();
        reader.nextLine();
        if (questions.get(question).isCorrect(response)) {
            System.out.print("YAY! You got it right!"); 
            ++score;
            return true;
        }
        else {
            System.out.print("You got it wrong!"); 
            return false;
        }
    }

}
