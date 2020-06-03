

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonTest
{
    private Person person1;

    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        person1 = new Person("Bob", "Banana", "123123123");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetFirst()
    {
        assertEquals("Bob", person1.getFirst());
    }

    @Test
    public void testGetLast()
    {
        assertEquals("Banana", person1.getLast());
    }

    @Test
    public void testGetID()
    {
        assertEquals("123123123", person1.getID());
    }

    @Test
    public void testToString()
    {
        assertEquals("Bob", person1.toString());
    }
}



