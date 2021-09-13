package decorator;

public class Mouth extends CharacterDecorator{
    
    public Mouth(Character character) {
        super(character);
    }

    public void customize() {
        if (sections.size() >= 6) {
            sections.set(5, "  \\ ---- / ");
        }
    }
}
