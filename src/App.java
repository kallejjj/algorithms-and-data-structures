public class App {
    public static void main(String[] args) {
        // Create a new Circle object with a radius of 5
        Circle myCircle = new Circle(5);
        
        // Call the methods you built in Circle.java
        long area = myCircle.getArea();
        
        // Print the result
        System.out.println("The area of the circle is: " + area);
    }
}
