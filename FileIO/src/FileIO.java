/*import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
public class FileIO {

	public static void main(String[] args) 
	{
		Read();
	}
	public static void Read
	{
		FileReader fileReader = null;
		
		try
		{
			fileReader = new FileReader("C:")
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String iReadThis = bufferedReader.readLine();
			System.out.println
			StringBuilder builder = new StringBuilder();
		}
	
	
	
	while(iReadThis=null)
	{
		iReadThis.Replace =
		iReadThis = bufferedReader.readline();
	}
	
	}
}*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileIO 
{

	public static void main(String[] args) 
	{
		try 
		{
		String filepath = "C:\\Users\\Rlyons-price13\\Documents\\A PROGRAMMER\\OOP_week15.txt";
		String iReadThis = Read(filepath);
		String originalWord = "dolor";
		String replaceWord ="hedon";
		String replacedString = Replace(iReadThis,originalWord, replaceWord);
		Write(replacedString, filepath);
		}
	
	
 	catch (IOException ex)
	{
		System.out.println("Something went wrong while reading or writing from file");
		ex.printStackTrace();
	}
	catch (NullPointerException nullab)
	{
		System.out.println("You did not supply a valid file path");
		nullab.printStackTrace();
	}
}
	
	private static void Write(String replacedString, String filePath) throws IOException
	{
		
		FileWriter writer = null;
		
		try
		{
			writer = new FileWriter(filePath);
			writer.write(replacedString);
		}
		finally 
		{
			if (writer != null )
			{
				writer.close();
			}
		}
	}
	
	private static String Replace(String iReadThis, String originalWord, String replaceWord)
	{
		String replacedString = null;
		
		if(iReadThis != null)
		{
			replacedString = iReadThis.replace(originalWord, replaceWord);
		}
		
		return replacedString;
	}
		
	public static String Read(String filePath) throws NullPointerException, IOException
	{
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String fullFile = null;
		
		try 
		{
			if (filePath == null)
			{
				throw new NullPointerException();
			}
			
			fileReader = new FileReader(filePath);
			
			StringBuilder builder = new StringBuilder();
			
			String iReadThis = bufferedReader.readLine();
						
			while(iReadThis != null)
			{
				builder.append(iReadThis);
				iReadThis = bufferedReader.readLine();
			}
			
			fullFile = builder.toString();
		}
		finally
		{
			if (fileReader != null);
			{
				fileReader.close();
			}
			
			if (bufferedReader != null)
			{
			bufferedReader.close();	
			}
		}
		return fullFile;
	 }
	
}

