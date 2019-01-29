
/**
 * Write a description of class Dice here.
 *
 * @author Kian Soltani
 * @version 1-18-19
 */
public class Dice
{
    private Die d1;
    private Die d2;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        int[] rolls = new int[2];
        d1 = new Die();
        d2 = new Die();
    }

    /**
     * 
     */
    public int[] roll()
    {
        int[] result = {d1.roll(), d2.roll()};
        return result;
    }
}
