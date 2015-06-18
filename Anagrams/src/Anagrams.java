public class Anagrams{
	
public static void main(String [ ] args) {
	 	isAnagram("Live", "Evil");
	 

boolean firstIsAnagram(String first, String second)  
	{  
    
		char[] firstArray = first.toCharArray();  
		char[] secondArray = first.toCharArray();  
  
		Array.sort(firstArray.length);  
		Array.sort(secondArray.length);  
  
		return Array.equals(firstArray, secondArray);  
	 }
}