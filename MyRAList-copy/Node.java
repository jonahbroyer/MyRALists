/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node<T>
{
    // instance variables - replace the example below with your own
    private Node previous;
    private Node next;
    private T data;

    /**
     * Constructor for objects of class Node
     */
    public Node(T data)
    {
        init(data, this, this);
    }
    
    public Node(T data, Node<T> prev, Node<T> next)
    {
        init(data, prev, next);
    }
    
    private void init(T data, Node<T> prev, Node<T> next)
    {
        this.data = data;
        this.previous = prev;
        this.next = next;    
    }
    
    public void setNext(Node<T> next)
    {
        this.next = next;
    }
        
    public void setPrev(Node<T> previous)
    {
        this.previous = previous;
    }
    
    public void setData(T data)
    {
        this.data = data;
    }
    
    public void setNull()
    {
        this.data = null;
        this.previous = null;
        this.next = null;
    }
    
    public Node<T> getPrev()
    {
        return previous;
    }
    
    public Node<T> getNext()
    {
        return next;
    }
    
    public T getData()
    {
        return data;
    }
    
    public String toString()
    {
        return "Node->Data: " + getData();
    }
}