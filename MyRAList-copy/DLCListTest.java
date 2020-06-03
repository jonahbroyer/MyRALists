import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DLCListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DLCListTest
{        
    private DLCList<Person> listOne;
    private Person[] people;
    private Person aPerson;
    
    /**
     * Default constructor for test class DLCListTest
     */    
    public DLCListTest()
    {
        people = new Person[]{
            new Person("Bob", "Smith", "123456789"),
            new Person("Paula", "Thomas", "234567890"),
            new Person("Gina", "Roberts", "345678901"),
        };
        
        aPerson = new Person("New", "Person", "123123123");
        String toFind = "Gina";
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        listOne = new DLCList<>();
        listOne.add(people[0]);
        listOne.add(people[1]);
        listOne.add(people[2]);
    }
    
    @Test
    public void testLength()
    {
        assertTrue(people.length == listOne.size());
    }
    
    @Test
    public void testAddLast()
    {
        listOne.add(aPerson);  
        assertTrue(listOne.size() == people.length + 1);
    }
    
    @Test
    public void testGetFirst()
    {
        assertTrue(listOne.getFirst().getID().equals("123456789"));
    }
    
    @Test
    public void testGetLast()
    {
        listOne.add(aPerson);
        assertTrue(listOne.getLast().getID().equals("123123123"));
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
    public void testAddFirst()
    {        
        assertEquals(true, listOne.addFirst(aPerson));
    }
}