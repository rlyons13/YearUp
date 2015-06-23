
public class ExceptionCentral {

	public static void main(String[] args) 
	{
		ExceptionCentral exceptionCentral = new ExceptionCentral();
		try
		{
			int firstnum=22, secondnum=0;
			int output= firstnum/secondnum;
			System.out.println (output+ " is the answer.");
			
		}	
		catch (ArithmeticException ab)
		{
			System.out.println ("Arithmetic Exception!!!!");
		}
		exceptionCentral.secondException(null);
		int[] array = null;
		exceptionCentral.thirdException(array);
	}
	int firstException(int firstnum, int secondnum) throws ArithmeticException
	{
		int sum = (firstnum/secondnum);
		return sum;
	}
	public void secondException(String HiBuyWhy ) {
	    if (HiBuyWhy == null) {
	        throw new NullPointerException("HiBuyWhy cannot be null");
	    }
	}
	public void thirdException (int [] array)
	{
		try
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.println(array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexDP)
		{			
			System.out.println("array values don't exist");
			arrayIndexDP.printStackTrace();
		}
    }
}

