package decorator;

public abstract class CharacterDecorator extends Character {
    
    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
        for (String section : character.sections) {
            this.sections.add(section);
        }
        customize();
    }

    public abstract void customize();

}
