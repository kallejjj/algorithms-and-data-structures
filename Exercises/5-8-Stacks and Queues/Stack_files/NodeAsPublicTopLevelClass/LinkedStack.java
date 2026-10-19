import java.util.EmptyStackException;

public final class LinkedStack<T> implements StackInterface<T> {
    private Node<T> topNode; 
    
    public LinkedStack() {
        topNode = null;[cite: 15]
    } 
    
    public void push(T newEntry) {
        Node<T> newNode = new Node<>(newEntry, topNode);
        topNode = newNode;[cite: 17]
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();[cite: 19]
        }
        return topNode.getData();[cite: 19]
    } 

    public T pop() {
        T top = peek();[cite: 19]
        topNode = topNode.getNextNode();[cite: 19]
        return top;[cite: 19]
    } 

    public boolean isEmpty() {
        return topNode == null;[cite: 20]
    } 
    
    public void clear() {
        topNode = null;[cite: 20]
    } 
}