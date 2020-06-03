/**
 * Write a description of class BadLengthException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BadLengthException extends RuntimeException
{
    private int length;

    public BadLengthException(int len)
    {
        length = len;
    }

    public int getLength()
    {
        return length;
    }

    public String toString()
    {
        return "Illegal length: " + getLength();
    }
}