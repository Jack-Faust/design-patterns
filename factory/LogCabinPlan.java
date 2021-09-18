package factory;

/**
 * class LogCabinPlan inherits houseplan and creates house of Log cabin type
 * @author Ronald Faust
 */
public class LogCabinPlan extends HousePlan{
    /**
     * default constructor for log cabin
     */
    public LogCabinPlan() {
        super(2, 10, 1800);
        setMaterials();
        setFeatures();
    }
    /**
     * adds materials as strings to materials arrayList
     */
    protected void setMaterials() {
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }
    /**
     * adds features as strings to features arrayList
     */
    protected void setFeatures() {
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }
    /**
     * indicates type of house then calls parent toString method
     * @return String of house details
     */
    public String toString() {
        return "Log Cabin\n" + super.toString();
    }
    
}
