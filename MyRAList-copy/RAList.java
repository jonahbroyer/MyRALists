import java.util.Arrays;
import java.lang.Exception;
/**
 * Write a description of class RAList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RAList<E>
{
    private final static int DEFAULT_SIZE = 10;
    private Object[] obj_array;     //object array
    private int capacity;
    private int numberOfElements;

    // class constructor
    public RAList(int length) {
        // instantiate a new Object array of specified length
        if(length < 0) {
            throw new BadLengthException(length);
        }
        init(length);
    }

    //class constructor
    public RAList() {        
        init(DEFAULT_SIZE);        
    }

    private void init(int length) {
        obj_array = new Object[length];
        this.capacity = length;
        numberOfElements = 0;
    }

    public int size() {
        return numberOfElements;
    }

    // get obj_array[i]
    public E get(int i) throws Exception{
        if (i >= size()) {
            throw new Exception("What were you thinking? " + i +
                " is out of bounds");
        }        
        @SuppressWarnings("unchecked")
        final E e = (E)obj_array[i];
        return e;
    }

    public int capacity() {
        return capacity;
    }

    // set e at obj_array[i]
    public void set(int i, E e) {
        obj_array[i] = e;
    }

    public void add(E e) {
        if (size() == capacity) {
            resize();
        }
        obj_array[numberOfElements] = e;
        numberOfElements += 1;
    }

    private void resize() {
        int newSize = capacity() * 2 + 1;
        Object[] biggerArray = new Object[newSize];

        try {
            for (int i = 0; i < size(); i += 1) {
                biggerArray[i] = get(i);
            }
        }
        catch (Exception e) {
            throw new RuntimeException("What? " + e.toString());
        }

        obj_array = biggerArray;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < size() - 1; i += 1) {
            sb.append(obj_array[i].toString() + ", ");
        }

        if (size() > 0) {
            sb.append(obj_array[size() - 1].toString() + "]");
        }

        return sb.toString();
    }
}