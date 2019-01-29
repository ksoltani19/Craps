
/**
 * Write a description of class Die here.
 *
 * @author Kian Soltani
 * @version 1-23-19
 */
public class Die
{
    private int roll;
    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        roll = roll();
    }

    /**
     * Roll class.
     */
    public int roll()
    {
         roll = (int) (Math.random() * 6 + 1);
         return roll;
    }
}
