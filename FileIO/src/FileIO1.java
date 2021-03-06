import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileIO1 
{	
	public static void main(String[] args)
	{
		try
		{
			String filePath = ("C:\\Users\\Rlyons-price13\\Documents\\A PROGRAMMER\\OOP_week15.txt");
			String iReadThis = Read(filePath);
			String originalWord = "dolor";
			String replaceWord = "hedon";
			String replacedString = Replace(iReadThis, originalWord, replaceWord);
			Write(replacedString, filePath);
		}
		catch(IOException ex)
		{
			System.out.println("Something went wrong from reading or writing from file");
			ex.printStackTrace();
		}
		catch(NullPointerException nullEx)
		{
			System.out.println("You did not supply a valid path");
			nullEx.printStackTrace();
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
			if (writer != null)
			{
				writer.close();
			}
		}
	}

	private static String Replace(String iReadThis, String originalWord, String replaceWord) 
	{
		String replacedString = null;

		if (iReadThis != null)
		{
			replacedString = iReadThis.replace(originalWord, replaceWord);
		}
		return replacedString;
	}


	public static String Read(String filePath) throws NullPointerException, IOException
	{
		FileReader fileReader = null;
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String fullFile = null;

		try
		{
			if (filePath == null)
			{
				throw new NullPointerException();
			}


			fileReader = new FileReader("C:\\Users\\Rlyons-price13\\Documents\\A PROGRAMMER\\OOP_week15.txt");

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
			if (fileReader != null)
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








public static void main(String[] args) 
{
	Read();
}

public static void Read()
{
	try
	{
		FileReader fileReader = new FileReader("C:\readme.txt"); 
		BufferedReader bufferedReader = new BufferedReader(fileReader );
		String iReadThis = bufferedReader.readLine();
		System.out.println("I read this line: " + iReadThis);
	}
	catch(FileNotFoundException e)
	{
		System.out.println("C:\readme.txt does not exist");

	}
	
}

}


