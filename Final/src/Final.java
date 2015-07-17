
public class Final {	
	
	/*public static void main(String[] args) {
		String[] flowers = {"Daisy", "Rose", "Jasmine", "Lotus", "Daffodil"};
		
		for(int i = 0; i < flowers.length; i=i+2) {
			System.out.println(flowers[i]);
		}
	}
//			=array[i] % 2];
//			return result;
} */
	/*public static void main (String[] args){
	int n = 1024;

	for (int i = 0; i < 50; i++)

	{
		n = n / 2;
		System.out.println(n);
	}
	}*/
	
	public static void main (String[] args){
	
	void ReadFile(String filePath)

	{

	       try

	       {

	            String filePathSmallChars = filePath.toLowerCase();

	            FileReader reader = new FileReader(filePathSmallChars);

	               try

	               {

	                     BufferedReader breader = new BufferedReader(reader);

	                     String nextLine = breader.readLine();

	                     int index = nextLine.length() + 1;

	                     char oneChar = nextLine[index];

	               }

	               catch(ArrayIndexOutOfBoundsException arrayEx)

	               {

	                }

	       }

	       catch(FileNotFoundException fileEx)

	      {

	      }

	       catch(NullPointerException nullEx)

	      {

	      }

	}
}

