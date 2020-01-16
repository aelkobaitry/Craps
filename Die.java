
/**
 * This class rolls two dice and returns their sum
 *
 * @author Adam Elkobaitry
 * @version 2020-1-15
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int result;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        result = rollDie();
    }

    /**
     * This method rolls a die
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int rollDie()
    {
        // put your code here
        int roll = (int)((Math.random() * 6) + 1);
        return roll;
    }
    
    /**
     * This method sums up two rolls and returns them
     *
     * @param 
     * @return    the sum of x and y
     */
    public int getRolls()
    {
        // put your code here
        int r1 = rollDie();
        int r2 = rollDie();
        return r1 + r2;
    }
}
