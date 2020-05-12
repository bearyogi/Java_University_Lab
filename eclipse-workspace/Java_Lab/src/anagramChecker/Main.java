package anagramChecker;

import java.util.Arrays;

class Main{
	public static void main (String [] args)
	{
		Anag anagram = new Anag();
		System.out.println(anagram.isAnagram("Komputer", "Ser"));
		System.out.println(anagram.isAnagram("komputer", "terkompu"));
	}
}
class Anag implements IAnagramChecker{

	public boolean isAnagram(String word1, String word2)
	{
		int n1 = word1.length(); 
        int n2 = word2.length(); 
        char tempArray[] = word1.toCharArray(); 
        char tempArray2[] = word2.toCharArray(); 
        
        // If length of both strings is not same, 
        // then they cannot be anagram 
        if (n1 != n2) 
            return false; 
  
        // Sort both strings 
        Arrays.sort(tempArray); 
        Arrays.sort(tempArray2); 
  
        // Compare sorted strings 
        for (int i = 0; i < n1; i++) 
            if (tempArray[i] != tempArray[i]) 
                return false; 
  
        return true; 
	}
	
}