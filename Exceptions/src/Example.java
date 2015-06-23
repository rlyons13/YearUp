
public class Example {

	public static void main(String[] args) 
	{
		Example exceptionsCentral = new Example();
		
		try
		{
			exceptionsCentral.Divide(50, 0);
		}
		catch(Exception ex)
		{
			System.out.println("could not do the division");
		}
		
		exceptionsCentral.PrintSomething(null);
		int[] array = null;
		exceptionsCentral.PrintArrayValues(array);
	}
	
	int Divide(int number, int divisor) throws ArithmeticException
	{
		int quotient = number/divisor;
		return quotient;
	}
	
	double SquareRoot(double number) throws ArithmeticException
	{
		double sqroot = Math.sqrt(number);
		
		if (!(sqroot > 0))
		{
			throw new ArithmeticException();
		}
		
		return sqroot;
	}

	void PrintSomething(String someString) throws NullPointerException
	{
		String smallString = someString.toLowerCase();
		System.out.println(smallString);
	}
	
	void PrintArrayValues(int[] array)
	{
		try
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.println(array[i]);
			}
		}
		/*catch(Exception exception)
		{
			exception.printStackTrace();
		}*/
		catch(ArrayIndexOutOfBoundsException arrayIndexEx)
		{			
			System.out.println("array passed in did not have 10 slots");
			arrayIndexEx.printStackTrace();
		}
		catch(NullPointerException nullPtrEx)
		{
			System.out.println("array passed in is null");
			nullPtrEx.printStackTrace();
		}		
	}
}
