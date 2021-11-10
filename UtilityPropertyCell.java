/**
* The rent of UtilityPropertyCell is computed by the number of steps that the player rolled multiply by x
* x = 100, if both property are owned by the same player
* x = 10, if the owner of this property cell owns only one property cell.
*/
public class UtilityPropertyCell extends PropertyCell {
    public static final int UTILITY_PROPERTY_COST = 500;
    public static final UtilityPropertyCell LIBRARY_UTILITY_CELL = new UtilityPropertyCell("Library", UTILITY_PROPERTY_COST);
    public static final UtilityPropertyCell CANTEEN_UTILITY_CELL = new UtilityPropertyCell("Canteen", UTILITY_PROPERTY_COST);


    //TODO add some other methods if necessary

}
