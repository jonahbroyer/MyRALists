import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NodeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NodeTest
{
    private Node<Integer> node1;

    /**
     * Default constructor for test class NodeTest
     */
    public NodeTest()
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
        node1 = new Node<Integer>(42);
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
    public void testGetData()
    {
        assertNotNull(node1.getData());
    }

    @Test
    public void testGetNext()
    {
        assertNotNull(node1.getNext());
    }

    @Test
    public void testGetPrev()
    {
        assertNotNull(node1.getPrev());
    }
}