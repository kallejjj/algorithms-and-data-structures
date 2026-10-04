public class exe4 {
    public static void main(String[] args) {
        // Increased n to 1 million so the loop takes long enough to measure
        int n = 1000000; 
        long sum = 0;
        
        // 1. Record the exact time before the loop starts
        long startTime = System.nanoTime();
        
        for (int i = 0; i < n; i++) {
            sum++;
        }
        
        // 2. Record the exact time after the loop finishes
        long endTime = System.nanoTime();
        
        // 3. Calculate the difference
        long durationInNano = (endTime - startTime);
        
        // Optional: Convert nanoseconds to milliseconds for easier reading
        double durationInMs = durationInNano / 1_000_000.0;
        
        System.out.println("The total sum is: " + sum);
        System.out.println("Execution time: " + durationInMs + " milliseconds");
    }
}