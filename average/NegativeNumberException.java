package average;

/**
 * Assignment-4, exercise-4
 *
 * @author Sophia Hjörnhede
 * @version 1.10 11 July 2020
 */

public class NegativeNumberException extends Exception
{
    public NegativeNumberException( )
    {
        super("Number must be greater than 0.");
    }

    public NegativeNumberException(String message)
    {
        super(message);
    }
}