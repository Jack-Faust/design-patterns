package factory;


/**
 * class HousePlanFactory to be able to create house plans of the correct type
 * @author Ronald Faust
 */
public class HousePlanFactory {
    
     /**
      * calls house plan constructors to return house plan of the proper type
      * @param type type of house
      * @return HousePlan of the proper type
      */
    public static HousePlan createHousePlan(String type) {
        HousePlan ret;
        if (type.equalsIgnoreCase("Log Cabin")) {
             ret = new LogCabinPlan();
        }
        else if (type.equalsIgnoreCase("Contemporary home")) {
             ret = new ContemporaryPlan();
        }
        else if (type.equalsIgnoreCase("Tiny Home")) {
             ret = new TinyHomePlan();
        }
        else {
             ret = new LogCabinPlan();
        }
        return ret;
    }
}