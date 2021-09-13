package decorator;

/**
 * Nose class adds nose to character
 * @author Jack Faust
 */
public class Nose extends CharacterDecorator {
    
    /**
     * Constructor inherits from parent class
     */
    public Nose(Character character) {
        super(character);
    }
    /**
     * replaces 5th section with nose
     */
    public void customize() {
        if (sections.size() >= 5) {
            sections.set(4, " |   >    | ");
        }
    }
}
