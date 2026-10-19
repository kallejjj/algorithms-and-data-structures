public class Main {
    public static void main(String[] args) {
        // Create a new stack using your LinkedStack class
        StackInterface<String> myStack = new LinkedStack<>();
        
        // Test the methods you built
        myStack.push("First Item");
        myStack.push("Second Item");
        
        System.out.println("Top item is: " + myStack.peek());
        System.out.println("Removing top item: " + myStack.pop());
        System.out.println("Is the stack empty now? " + myStack.isEmpty());
    }
}