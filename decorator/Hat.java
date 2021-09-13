package decorator;

public class Hat extends CharacterDecorator {

    public Hat(Character character) {
        super(character);
    }

    public void customize() {
        if (sections.size() >= 2) {
            sections.set(0, "    ____");
            sections.set(1, " __|____|____");
        }
    }
}
