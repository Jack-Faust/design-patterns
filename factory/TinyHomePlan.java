package factory;

/**
 * class TinyHomePlan inherits houseplan and creates house of tiny home type
 * @author Ronald Faust
 */
public class TinyHomePlan extends HousePlan{
    /**
     * default constructor for tiny home
     */
    public TinyHomePlan() {
        super(1,5,200);
    }
    /**
     * adds materials as strings to materials arrayList
     */
    protected void setMaterials() {
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");
    }
    /**
     * adds features as strings to features arrayList
     */
    protected void setFeatures() {
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("Multipurpose areas");
        features.add("Multi-use applications");
    }
    /**
     * indicates type of house then calls parent toString method
     * @return String of house details
     */
    public String toString() {
        return "Tiny House\n" + super.toString();
    }
}