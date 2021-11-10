import java.util.concurrent.ThreadLocalRandom;

/**
 * Got one of the following chances randomly:
 * 1. Roll again
 * 2. +1000
 * 3. -1000
 * 4. Move to Jail directly without getting the 2000.
 */
class ChanceCell extends FunctionCell {

    public ChanceCell(String name) {
        super(name);
    }

    @Override
    public void event(Player p, Cell[] cells) {
        //TODO
    }
}