/**
 * Write a description of interface IList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * add(index, e), addFirst(e), addLast(e)
 * delete(index), deleteFirst(), deleteLast()
 * size()
 * clear()
 * contains(T e)
 * get(index), getFirst(), getLast(), set(index, object)
 */
public interface IList<T>
{
    boolean add(T element);
    boolean addFirst(T element);
    boolean addLast(T element);
    
    void delete(int index);
    void deleteFirst();
    void deleteLast();
    
    int size();
    void clear();
    boolean contains(T object);
    
    T get(int index);
    T getFirst();
    T getLast();
    
    void set(int index, T object);
    void insert(int index, T object);
}