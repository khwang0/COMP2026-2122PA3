import java.util.concurrent.ThreadLocalRandom;

public class Player {
    private final String name;
    private int money;
    private int position;
    private int lastMove;
    private boolean inPark;
    private boolean inJail;

    /**
     * Constructor
     * 
     * @param name The name of the player.
     */
    public Player(String name) {
        //TODO
    }

    /**
     * A player roll a dice and change its position
     */
    public void roll() {
        //TODO
    }
    /**
     * Return true if the player is in Park 
     *
     * @return true if the player is in Park
     */
    public boolean isInPark() { 
        //TODO
    }
    /**
     * Set the player in a park. This will only be called when a player
     * move to the cell Car Park. 
     *
     * @param inPark true if the player is set in the park
     */
    public void setInPark(boolean inPark) { 
        //TODO
     }
    /**
     * Return true if the player is in Jail. It should return false
     * if the player visits Jail (i.e., rolls a dice and moves to the cell Jail)
     *
     * @return true if the player is in Jail
     */
    public boolean isInJail() { 
        //TODO
     }
    /**
     * Put the player into Jail directly without passing Home (i.e., no 2000)
     */
    public void putToJail() {
        //TODO
    }

    /**
     * Get the value of dice that the player has just rolled.
     *
     * @return the value of dice
     */
    public int getLastMove() { 
        //TODO 
    }
    /**
     * Get the amount of money that the player has
     *
     * @return the amount of money the player has
     */
    public int getMoney() { 
        //TODO
     }
     /**
      * Return the name of the player
      *
      * @return the name of the player
      */
    public String getName() { 
        //TODO
     }
     /**
      * return the current position of the player
      * 
      * @return the position of the player
      */
    public int getPosition() { 
        //TODO
     }
     /**
      * charge certain amount of dollar from the player.
      * 
      * @param money The amount being charged
      */
    public void charge(int money) { 
        //TODO
     }

     //TODO add some other private methods if necessary
}
