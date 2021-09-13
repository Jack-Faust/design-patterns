package decorator;

/**
 * Mouth class adds mouths to character
 * @author Jack Faust
 */
public class Mouth extends CharacterDecorator{
    
     /**
     * Constructor inherits from parent class
     */
    public Mouth(Character character) {
        super(character);
    }
     /**
     * replaces 6th section with mouth
     */
    public void customize() {
        if (sections.size() >= 6) {
            sections.set(5, "  \\ ---- / ");
        }
    }
}
