import java.util.Scanner;

public class PropertyCell extends Cell {
    protected int baseCost;
    protected Player owner = null;
    int house = 0;

    /**
     * Return the owner of the property
     * @return owner
     */
    public Player getOwner() { 
        //TODO
     }
     /**
      * Constructor
      */
    public PropertyCell(String name, int baseCost) {
        //TODO
    }
    /**
     * Return the cost of the property cell
     * @return the base cost of the property cell.
     */
    public int getCost() { 
        //TODO
    }
    /**
     * Return number of houses built on this property cell.
     * @return the number of houses.
     */
    public int getHouse() { 
        //TODO
    }


    /**
     * Return a specific format of string. See the assignment webpage
     * for more details
     * @return the specific string of the property cell/
     */
    @Override
    public String toString() {
        //TODO
    }

    /**
     * Return the rent charged against this player. The formula for an ordinary cell is
     * baseCost * (1 + house * 0.5) rounding the nearest integer.
     *
     * @param p - The player who is charged. p is irrelevant in this case.
     * @return The rent.
     */
    public int getRent(Player p) {
        //TODO
    }

    //TODO add some other methods if necessary

}
