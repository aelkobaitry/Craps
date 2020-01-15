
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
        result = roll();
    }

    /**
     * This method rolls a die
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int roll()
    {
        // put your code here
        int roll = (int)((Math.random() * 6) + 1);
        return roll;
    }
    
    /**
     * This class rolls a die
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getRoll()
    {
        // put your code here
        int r1 = roll();
        int r2 = roll();
        return r1 + r2;
    }
}
