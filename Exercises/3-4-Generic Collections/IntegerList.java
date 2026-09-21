import java.util.*;

public class IntegerList 
{
	private LinkedList<Integer> intList = new LinkedList<Integer>();
	private TreeSet<Integer> intSet = new TreeSet<Integer>();

	private Random r = new Random();

	private void fillList(int n)
	{
		for (int i=0; i<n; i++)
		{
			intList.add(r.nextInt(100));
			intSet.add(r.nextInt(100));   // Comment out when using fillSet
		}
	}

	private void fillSet(int n)
	{
		int i=0;
		int rand;
		while (i<n)
		{
			rand = r.nextInt(100);
			if (!intSet.contains(rand))
			{
				intSet.add(rand);
				i++;
			}
		}
	}

	public static void main(String[] args) 
	{
		IntegerList myList = new IntegerList();
		myList.fillList(25);
		
		// myList.fillSet(25);

		System.out.println("List:");
		// myList.intList.sort(null);
		for (int item: myList.intList)
		{
			System.out.print(item+" ");
		}
		System.out.println();

		// Always sorted, no duplicates
		System.out.println("Set:");
		for (int item: myList.intSet)
		{
			System.out.print(item+" ");
		}
	}
}
