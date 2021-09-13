package decorator;

/**
 * Abstract characterDecorator class creates objects of characters
 * @author Jack Faust
 */
public abstract class CharacterDecorator extends Character {
    
    protected Character character;

    /**
     * Constructor copies sections to the object
     * @param character what character is being copied
     */
    public CharacterDecorator(Character character) {
        this.character = character;
        for (String section : character.sections) {
            this.sections.add(section);
        }
        customize();
    }

    /**
     * Abstract customize method
     */
    public abstract void customize();

}
