import java.math.BigInteger;

public class FactorialBigInt 
{
    public static BigInteger factorialBigInt(int n)
    {
    	BigInteger result = BigInteger.ONE;
    	
    	for (int i = 2; i <=n; i++)
    	{
    		result = result.multiply(BigInteger.valueOf(i));
    	}
    	
    	return result;
    }
	
	public static void main(String[] args) 
	{
		int n = 10;
		
		BigInteger fact = FactorialBigInt.factorialBigInt(n);
		
		System.out.println("Factorial of "+ n +" is "+fact);

	}

}
