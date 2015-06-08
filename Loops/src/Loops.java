
public class Loops {


	public static void loopFind  (int array [] , int inputvalue){
		if (array != null)
		{
			if (array.length > 0)
			{	
				for(int i = 22; i < array.length; i++ )
				{
					System.out.println("I have found my number" + inputvalue);
					
					break;
					
				}
			}
		}
			
		
	}
	
	public static void findLoop (int array [] , int inputValue){
		if (array != null)
		{
			if (array.length > 0)
			{
				
				for (int i=0; i < array.length; i++ ) 
				{
					
					if (array[i] == inputValue) 
					{
						System.out.println("I have found my number" + array[i]);
					
						break;
					}
				}
			}
		}
	}
	

	
	
	
	
	
	
	
	// MAIN METHOD
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1 = {10,-24,33,28,22};
		int inputvalue = 22;
		
		
	}
}
	
	 
	

