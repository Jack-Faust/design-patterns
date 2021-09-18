package factory;

/**
 * class ContemporaryPlan inherits houseplan and creates house of contemporary type
 * @author Ronald Faust
 */
public class ContemporaryPlan extends HousePlan{
    /**
     * default constructor for contemporary home
     */
    public ContemporaryPlan() {
        super(5, 40, 3000);
        setMaterials();
        setFeatures();
    }
    /**
     * adds materials as strings to materials arrayList
     */
    protected void setMaterials() {
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }
    /**
     * adds features as strings to features arrayList
     */
    protected void setFeatures() {
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");
    }
    /**
     * indicates type of house then calls parent toString method
     * @return String of house details
     */
    public String toString() {
        return "Contemporary Home\n" + super.toString();
    }
    
}