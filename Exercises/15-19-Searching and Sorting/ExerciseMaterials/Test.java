import java.util.*;
public class Test 
{
	public static final int SIZE = 10;
	public static final int LENGTH = 4;

	private Random r = new Random(100);

	private Name[] names = new Name[SIZE];
	private StringBuilder sb = new StringBuilder(LENGTH);

	public Test()
	{
		for (int i = 0; i < SIZE; i++) 
		{
			names[i] = new Name();
			names[i].setName(randomString(LENGTH), randomString(LENGTH));
		}
	}

	public String randomString(int len) 
	{
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		sb.setLength(0);
		
		for (int i = 0; i < len; i++) 
		{
			int index = r.nextInt(characters.length());
			sb.append(characters.charAt(index));
		}

		return sb.toString();
	}

	public static void main(String[] args) 
	{

		Test t = new Test();
		SortArray.selectionSort(t.names, SIZE);
        for (Name s : t.names) 
        {
            System.out.println(s.getName());
        }
	}

}
