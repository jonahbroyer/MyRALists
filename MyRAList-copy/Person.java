/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String first;
    private String last;
    private String ID;
    
    public Person(String first, String last, String ID)
    {
        this.ID = ID;
        this.first = first;
        this.last = last;
    }
    
    public String getFirst()
    {
        return first;
    }
    
    public String getLast()
    {
        return last;
    }
    
    public String getID()
    {
        return ID;
    }
    
    public String toString()
    {
        return first;
    }
}