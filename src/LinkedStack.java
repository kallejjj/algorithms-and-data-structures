import java.util.EmptyStackException;

public final class LinkedStack<T> implements StackInterface<T> {
    private Node<T> topNode; 
    
    public LinkedStack() {
        topNode = null;
    } 
    
    public void push(T newEntry) {
        Node<T> newNode = new Node<>(newEntry, topNode);
        topNode = newNode;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return topNode.getData();
    } 

    public T pop() {
        T top = peek();
        topNode = topNode.getNextNode();
        return top;
    } 

    public boolean isEmpty() {
        return topNode == null;
    } 
    
    public void clear() {
        topNode = null;
    } 
}