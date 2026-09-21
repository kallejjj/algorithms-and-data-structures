
public class Queue<T> implements QueueInterface<T>
{
	private Node<T> firstNode;
	private Node<T> lastNode;
	
	// Add implementations for the methods
	public void enqueue(T newEntry)
	{
        
	}

	public T dequeue()
	{
       
	}

	public T getFront()
	{

	}	  

	public boolean isEmpty()
	{
		return (firstNode == null) && (lastNode == null);
	}

	public void clear()	
	{

	}
}
