
public class ShiftOnes2Left 
{
    public static int shiftOnesLeft(int num)
    {
    	int shiftedNum = 0;
    	int bit;
    	int mask = 1<<30;
    	
    	for (bit = 1<<30; bit > 0; bit = bit >> 1)
    	{
    		// If the bit is set on (1)
    		if ( (num & bit ) !=0 )
    		{
    			// Set the next leftmost bit in
    			shiftedNum = shiftedNum | mask;
    			
    			// Shift the mask one bit position to the right
    			mask = mask >> 1;
    		}
    	}
    	return shiftedNum;
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
