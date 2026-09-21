import java.util.*;

public class RandInt 
{
	private LinkedList<Integer> values = new LinkedList<Integer>();
	private Random r = new Random();
	public static final int MAX = 25;
	public static final int BOUND = 1000;
	
	public RandInt()
	{
		int rand;
		
		for ( int i=0; i < MAX; i++ )
		{
			rand = r.nextInt(BOUND);
			while (values.contains(rand))
			{
			   rand = r.nextInt(BOUND);
			}
			values.add(rand);
		}
		
		Collections.sort(values);
	}

	public static void main(String[] args) 
	{
		RandInt randInt = new RandInt();
		for (int i: randInt.values)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
