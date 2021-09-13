package decorator;

/**
 * Eyes class adds eyes to character
 * @author Jack Faust
 */
public class Eyes extends CharacterDecorator {
    
    /**
     * Constructor inherits from parent class
     */
    public Eyes(Character character) {
        super(character);
    }

    /**
     * replaces 3rd section with eyes
     */
    public void customize() {
        if (sections.size() >= 4) {
            sections.set(3, " |  o  o  | ");
       }  
     }
}
