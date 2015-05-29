
public class LargestNumber 
{

	public static void main(String[] args) 
	{
		int [] array1 = {-1,-4,5} ;
		int [] array2 = {};
		int [] array3 = null;
		LargestNumberUsingForLoop (array1);
		LargestNumberUsingForLoop (array2);
		LargestNumberUsingForLoop (array3);
		
		LargestNumberUsingWhileLoop (array1);
		LargestNumberUsingWhileLoop (array2);
		LargestNumberUsingWhileLoop (array3);
	
	}
		
	public static void LargestNumberUsingWhileLoop (int [] inputarray)
	{
		if  (inputarray != null)
		{
			if (inputarray.length > 0)
			{
				int largestNumber =inputarray [0];
				int i=0;
				
				while (i < inputarray.length)
				{
					if (largestNumber < inputarray [1])
					{
						largestNumber = inputarray[1];
					}
					
					i++;
				}
					
			}
		}
	}
			System.out.println ("The largest number that I found is" + largestNumber);
			
			else 
			{
				System.out.println ("This array does not have any even numbers");
			}
		else
		{
			System.out.println ("This array does not have any odd numbers");
		}
	public static void LargestNumberUsingForLoop (int [] inputarray)
	{
		if (inputarray !=null)
		{
			if (inputarray.length > 0)
			{
				int largestNumber =inputarray[0];
				 i= 0
				
				for (i = 0; i = inputarray.length; i++)
				{
					if  (largestNumber < inputarray[1])
					{
						largestNumber = inputarray[1];
					}
				}
			}
		}
	}
	
			System.out.println ("The largest number that I found is" + largestNumber);
	
			else
		{
				System.out.println ("This array does not have any even numbers");
	}
		
		else
		{
			System.out.println ("This array does not have any odd numbers");
		}
		
	
}
		