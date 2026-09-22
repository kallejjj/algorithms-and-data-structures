public class Fibonacci {
    
    public static double fibonacciIterative(int n)
    {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        
        double prev2 = 0;
        double prev1 = 1;
        double current = 0;
        
        for (int i = 2; i <= n; i++)
        {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }
    
    public static double fibonacciRecursive(int n)
    {
        if (n==0 || n==1) //base case
        return n;
        else return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static void main(String[] args) {
        int n = 40;

        // Time the iterative version
        long startIter = System.nanoTime();
        double resultIter = fibonacciIterative(n);
        long endIter = System.nanoTime();
        long durationIter = endIter - startIter;

        System.out.println("Iterative Fibonacci(" + n + ") = " + resultIter);
        System.out.println("Iterative time: " + durationIter + " nanoseconds");

        // Time the recursive version
        long startRec = System.nanoTime();
        double resultRec = fibonacciRecursive(n);
        long endRec = System.nanoTime();
        long durationRec = endRec - startRec;

        System.out.println("Recursive Fibonacci(" + n + ") = " + resultRec);
        System.out.println("Recursive time: " + durationRec + " nanoseconds");

    }

}