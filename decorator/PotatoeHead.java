package decorator;
/**
 * Potatoehead class creates plain PotatoeHead
 * @author Jack Faust
 */
public class PotatoeHead extends Character {
    
    /**
     * constructor populates inhereted arraylist
     */
    public PotatoeHead() {
        super();
        this.sections.add("");
        this.sections.add("    ____");
        this.sections.add("  /      \\ ");
        this.sections.add(" |        | ");
        this.sections.add(" |        | ");
        this.sections.add("  \\      / ");
        this.sections.add("   \\____/ ");
    }
}
