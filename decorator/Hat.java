package decorator;

/**
 * Hat class adds hats to character
 * @author Jack Faust
 */
public class Hat extends CharacterDecorator {

    /**
     * Constructor inherits from parent class
     */
    public Hat(Character character) {
        super(character);
    }
    /**
     * replaces 1st and 2nd section with hat
     */
    public void customize() {
        if (sections.size() >= 2) {
            sections.set(0, "    ____");
            sections.set(1, " __|____|____");
        }
    }
}
