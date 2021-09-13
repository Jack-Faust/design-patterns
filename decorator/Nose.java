package decorator;

public class Nose extends CharacterDecorator {
    
    public Nose(Character character) {
        super(character);
    }

    public void customize() {
        if (sections.size() >= 5) {
            sections.set(4, " |   >    | ");
        }
    }
}
