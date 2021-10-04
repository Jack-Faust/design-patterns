package singleton;
/**
 * Questions class to great instances of question with possible answers
 * @author Jack Faust
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    /**
     * Question constructor
     * @param question the question to be asked
     * @param ans1 answer option 1
     * @param ans2 answer option 2
     * @param ans3 answer option 3
     * @param ans4 answer option 4
     * @param correctAnswer index of the correct answer
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        answers = new String[4];
        this.answers[0] = ans1;
        this.answers[1] = ans2;
        this.answers[2] = ans3;
        this.answers[3] = ans4;
    }
    /**
     * toString class to output question in readable format 
     * @return String of question 
     */
    public String toString() {
        return this.question + "\n1." + this.answers[0] + "\n2." + this.answers[1]+ "\n3." + this.answers[2]+ "\n4." + this.answers[3];
    }

    /**
     * Tells whether the users answer is correct 
     * @param userAnswer index user inputted 
     * @return boolean that is true when user is correct
     */
    public boolean isCorrect(int userAnswer) {
        if ((this.correctAnswer+1) == userAnswer) {
            return true;
        }
        else { 
            return false;
       }
    }

    /**
     * Gets the correct answer 
     * @return the correct answer as a string 
     */
    public String getCorrectAnswer() {
        return this.answers[correctAnswer];
    }
}
