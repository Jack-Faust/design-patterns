package decorator;

public class Eyes extends CharacterDecorator {
    
    public Eyes(Character character) {
        super(character);
    }

    public void customize() {
        if (sections.size() >= 4) {
            sections.set(3, " |  o  o  | ");
       }  
     }
}
