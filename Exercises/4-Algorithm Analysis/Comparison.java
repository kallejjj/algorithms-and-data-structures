
public class Comparison 
{
	public static long sum1(int n)
	{
		long sum = 0;
		for (int i=0; i<n; i++)
		  sum++;
		
		return sum;
	}

	public static long sum2(int n)
	{
		long sum=0;
		for (int i=0; i<n; i++)
		  for (int j=0; j < n; j++)
		    sum++;
		return sum;
	}
	
	public static long sum3(int n)
	{
		long sum=0;
		for (int i=0; i<n; i++)
		  for (int j=0; j < n * n; j++)
		    sum++;
		
		return sum;
	}
	
	public static long sum4(int n)
	{	
		long sum=0;
	
		for (int i=0; i<n; i++)
		  for (int j=0; j < i; j++)
		    sum++;
		return sum;
	}
	
	public static long sum5(int n)
	{		
		long sum=0;
		for (int i=0; i<n; i++)
		  for (int j=0; j < i * i; j++)
		    for (int k=0; k < j; k++)
		      sum++;
		return sum;
	}
	
	public static long sum6(int n)
	{	
		long sum=0;
		for (int i=0; i<n; i++)
		  for (int j=1; j < i * i; j++)
		    if (j % i == 0)  // Only true O(N2) times
		      for (int k=0; k < j; k++)
		        sum++;
		return sum;
	}	
		
	public static void main(String[] args) 
	{
		// Run the different sum-functions and measure
		// the executions times
		
		int n = 100;
		long start = System.nanoTime();
		long sum = sum1(n);
		long finish = System.nanoTime();
		long executionTime = finish-start;
		
		System.out.println("The execution time of sum1 in nanoseconds was "+executionTime);
	
		start = System.nanoTime();
		sum = sum2(n);
		finish = System.nanoTime();
		executionTime = finish-start;
		
		System.out.println("The execution time of sum2 in nanoseconds was "+executionTime);

		start = System.nanoTime();
		sum = sum3(n);
		finish = System.nanoTime();
		executionTime = finish-start;
		
		System.out.println("The execution time of sum3 in nanoseconds was "+executionTime);

		
		start = System.nanoTime();
		sum = sum4(n);
		finish = System.nanoTime();
		executionTime = finish-start;
		
		System.out.println("The execution time of sum4 in nanoseconds was "+executionTime);

		
		start = System.nanoTime();
		sum = sum5(n);
		finish = System.nanoTime();
		executionTime = finish-start;
		
		System.out.println("The execution time of sum5 in nanoseconds was "+executionTime);

		
		start = System.nanoTime();
		sum = sum6(n);
		finish = System.nanoTime();
		executionTime = finish-start;
		
		System.out.println("The execution time of sum6 in nanoseconds was "+executionTime);

	}
}
